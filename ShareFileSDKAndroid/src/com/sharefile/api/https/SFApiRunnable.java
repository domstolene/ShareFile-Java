package com.sharefile.api.https;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

import android.util.Log;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sharefile.api.SFApiQuery;
import com.sharefile.api.V3Error;
import com.sharefile.api.android.utils.SFLog;
import com.sharefile.api.authentication.SFOAuth2Token;
import com.sharefile.api.constants.SFKeywords;
import com.sharefile.api.constants.SFSDK;
import com.sharefile.api.enumerations.SFHttpMethod;
import com.sharefile.api.enumerations.SFProvider;
import com.sharefile.api.exceptions.SFInvalidStateException;
import com.sharefile.api.gson.auto.SFDefaultGsonParser;
import com.sharefile.api.interfaces.SFApiResponseListener;
import com.sharefile.api.models.SFODataObject;

public class SFApiRunnable<T extends SFODataObject> implements Runnable 
{
	private static final String TAG = "-SFApiThread";
	
	private final Class<T> mInnerType ;	
	private final SFApiQuery<T> mQuery; 
	private final SFApiResponseListener<T> mResponseListener;
	private final SFOAuth2Token mOauthToken;
		
	
	/**
	 *   This object will get filled with an errorCoode and the V3Error or valid SFOBject after the response 
	 *   The callListerners will be called appropriately based on the contents of this object.
	 */
	private class FinalResponse
	{
		private int mHttpErrorCode = 0;
		private V3Error mV3Error = null;
		private SFODataObject mResponseObject = null;	
		
		public void setFeilds(int errorCode, V3Error v3Error,SFODataObject sfObject)
		{
			mHttpErrorCode = errorCode;
			mV3Error = v3Error;
			mResponseObject = sfObject;
		}
	};
	
	FinalResponse mResponse = new FinalResponse();
		
	public SFApiRunnable(Class<T> innerType, SFApiQuery<T> query, SFApiResponseListener<T> responseListener,SFOAuth2Token token) throws SFInvalidStateException
	{	
		mInnerType = innerType;
		mQuery = query;
		mResponseListener = responseListener;
		mOauthToken = token;		
	}
	
	@Override
	public void run() 
	{
		executeQuery();
	}
	
	private void handleHttPost(URLConnection conn) throws IOException
	{
		if(mQuery.getHttpMethod().equalsIgnoreCase(SFHttpMethod.POST.toString()))
		{
			String body = mQuery.getBody(); 
			
			if(body!=null)
			{
				conn.setRequestProperty(SFKeywords.CONTENT_LENGTH, ""+body.getBytes().length);
				conn.setRequestProperty(SFKeywords.CONTENT_TYPE, SFKeywords.APPLICATION_JSON);
				
				SFHttpsCaller.postBody(conn, body);				
			}
		}
	}
	
	/**
	 *  This will change when we have better way of passing credentials. For the purpose of current POC app pass it as static global	 
	 */
	private static String mUsername = null;
	private static String mPassword = null;
	
	public static void setUsernamePassword(String user,String pass)
	{
		mUsername = user;
		mPassword = pass;
	}
	
	private void addAuthenticationHeader(URLConnection connection)
	{
		String path = connection.getURL().getPath();
		
		switch(SFProvider.getProviderTypeFromString(path))
		{
			case PROVIDER_TYPE_SF:
				SFHttpsCaller.addBearerAuthorizationHeader(connection, mOauthToken);
			break;
			
			default:
				SFHttpsCaller.setBasicAuth(connection, mUsername, mPassword);
			break;	
		}
		
	}
	
	public void executeQuery() 
	{								
		String server = mOauthToken.getApiServer();		
		String urlstr = mQuery.buildQueryUrlString(server);
			
		int httpErrorCode =  SFSDK.INTERNAL_HTTP_ERROR;
		String responseString = null;
		
		try
		{
			URL url = new URL(urlstr);
			URLConnection connection = SFHttpsCaller.getURLConnection(url);		
			SFHttpsCaller.setMethod(connection, mQuery.getHttpMethod());
			SFHttpsCaller.setAcceptLanguage(connection);
			//TODO: This needs a major revamp. We need User specific cookies to be set and CIFS/SharePoint specific authentication to be handled
			//We need a separate auth manager here to handle the setting of correct auth header based on the provider type and well as the user.
			addAuthenticationHeader(connection);
			
			handleHttPost(connection);
			
			SFLog.d2(TAG, mQuery.getHttpMethod() + " %s" , urlstr);
			
			connection.connect();
			
			httpErrorCode = SFHttpsCaller.safeGetResponseCode(connection);			
			
			//Use the bearer token currently. ignore the cookies untill we have a good cookie mgr. might impact sharepoint testing without cookies. 
			//v3Error = SFHttpsCaller.handleErrorAndCookies(connection, httpErrorCode, url);
			SFHttpsCaller.getAndStoreCookies(connection, url);
		    
			if(httpErrorCode == HttpsURLConnection.HTTP_OK)
			{											
				responseString = SFHttpsCaller.readResponse(connection);								
			}
			else if(httpErrorCode == HttpsURLConnection.HTTP_NO_CONTENT)
			{
				//no content. might be valid. let the listeners handle this.
			}
			else
			{
				responseString = SFHttpsCaller.readErrorResponse(connection);
			}
				    
			SFLog.d2(TAG, "%s",responseString);
			
			SFHttpsCaller.disconnect(connection);
		}
		catch(Exception ex)
		{		
			httpErrorCode = SFSDK.INTERNAL_HTTP_ERROR;
			responseString = "OrignalHttpCode = " + httpErrorCode + "\nExceptionStack = " +Log.getStackTraceString(ex);												
		}		
				
		parseResponse(httpErrorCode,responseString);
		
		callResponseListeners();
	}		 
			
	/**
	 *   Parse the response to the best of our ability. At the end of this function the FinalResponse object 
	 *   has to be filled with an ErrorCode or HTTP_OK and the V3Error or SFOBject should be filled based on success or failure or 
	 *   response parsing.	 
	 */
	private void parseResponse(int httpCode,String responseString)
	{
		switch(httpCode)
		{
			case HttpsURLConnection.HTTP_OK:
				callSuccessResponseParser(responseString);				
			break;	
			
			case HttpsURLConnection.HTTP_NO_CONTENT:
				//nothing
			break;
			
			case HttpsURLConnection.HTTP_UNAUTHORIZED:
				V3Error v3Error = new V3Error(httpCode,null,responseString);
				mResponse.setFeilds(HttpsURLConnection.HTTP_UNAUTHORIZED, v3Error, null);
			break;
			
			case SFSDK.INTERNAL_HTTP_ERROR:
				callInternalErrorResponseFiller(httpCode, responseString, null);
			break;
			
			default:
				callFailureResponseParser(httpCode, responseString);
			break;				
		}				
	}
	
	private void callResponseListeners()
	{
		if(mResponseListener == null)
		{
			return;
		}
		
		try
		{
			switch(mResponse.mHttpErrorCode)
			{
				case HttpsURLConnection.HTTP_OK:
					mResponseListener.sfapiSuccess((T) mResponse.mResponseObject);				
				break;	
				
				case HttpsURLConnection.HTTP_NO_CONTENT:
					mResponseListener.sfapiSuccess(null);
				break;
												
				default:
					mResponseListener.sfApiError(mResponse.mV3Error, mQuery);
				break;				
			}
		}
		catch(Exception ex)
		{
			SFLog.d2("-callback", "!!Exception calling the responseListener : %s ",Log.getStackTraceString(ex));
		}
	}
		
	/**
	 *   This is a filler only. wont do any parsing.
	 */
	private void callInternalErrorResponseFiller(int httpCode,String errorDetails,String extraInfo)
	{
		V3Error v3Error = new V3Error(httpCode,errorDetails,extraInfo);
		mResponse.setFeilds(SFSDK.INTERNAL_HTTP_ERROR, v3Error, null);
	}
			
	/**
	 *  If an error happens during parsing the success response, 
	 *  we return the exception description + the original server response in V3Error Object
	 */
	private void callSuccessResponseParser(String responseString)
	{					
		try 
		{			
			JsonParser jsonParser = new JsonParser();
			JsonElement jsonElement =jsonParser.parse(responseString);
			SFODataObject object = SFDefaultGsonParser.parse(mInnerType, jsonElement);			
			mResponse.setFeilds(HttpsURLConnection.HTTP_OK, null, object);			
		} 
		catch (Exception e) 
		{					
			/* 
			 * Note how we fill the httpErrorcode in V3Object to 200. Thats coz the server originally returned 200, 
			 * just the response object was malformed or caused some other exception while parsing.			 
			 */						
			callInternalErrorResponseFiller(HttpsURLConnection.HTTP_OK,Log.getStackTraceString(e),responseString);
		}					
	}
	
	private void callFailureResponseParser(int httpCode, String responseString)
	{
													
		try 
		{
			JsonParser jsonParser = new JsonParser();
			JsonElement jsonElement =jsonParser.parse(responseString);				
			V3Error v3Error = SFDefaultGsonParser.parse(jsonElement);
			v3Error.httpResponseCode = httpCode;				
			mResponse.setFeilds(httpCode, v3Error, null);
		} 
		catch (Exception e)  
		{					
			/* 
			 * Note how we fill the httpErrorcode to httpCode. Thats coz the server originally returned it, 
			 * just the error object was malformed or caused some other exception while parsing.			 
			 */						
			callInternalErrorResponseFiller(httpCode,Log.getStackTraceString(e),responseString);
		}
	}
			
	
	public Thread startNewThread()
	{
		Thread sfApithread = new Thread(this);		
		sfApithread.start();
		return sfApithread;
	}		
	
	public T createInstanceForSuccessResponse()
	{		
		T object =	null;
		
		try 
		{
			object = mInnerType.newInstance();	
		} 
		catch (Exception e) 
		{			
			e.printStackTrace();
		} 		
						
		return object;
	}
}