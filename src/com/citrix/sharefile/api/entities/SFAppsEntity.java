
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2017 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.citrix.sharefile.api.entities;

import com.citrix.sharefile.api.models.*;
import com.citrix.sharefile.api.SFApiQuery;
import com.citrix.sharefile.api.interfaces.ISFQuery;


import java.net.URI;

import com.google.gson.annotations.SerializedName;
import com.citrix.sharefile.api.interfaces.ISFApiClient;
import com.citrix.sharefile.api.exceptions.InvalidOrMissingParameterException;

public class SFAppsEntity extends SFEntitiesBase
{
	public SFAppsEntity(ISFApiClient client) {
		super(client);
	}

	/**
	* Get Apps for Current User
	* @return A feed of ConnectedApp objects
	*/
	public ISFQuery<SFODataFeed<SFConnectedApp>> get()	{

		SFApiQuery<SFODataFeed<SFConnectedApp>> sfApiQuery = new SFApiQuery<SFODataFeed<SFConnectedApp>>(this.client);
		sfApiQuery.setFrom("Apps");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get Apps for given User
	* @param userUrl 	 	
	* @return A feed of ConnectedApp objects
	*/
	public ISFQuery<SFODataFeed<SFConnectedApp>> getByUser(URI userUrl) throws InvalidOrMissingParameterException 	{
		if (userUrl == null) {
			throw new InvalidOrMissingParameterException("userUrl");
		}

		SFApiQuery<SFODataFeed<SFConnectedApp>> sfApiQuery = new SFApiQuery<SFODataFeed<SFConnectedApp>>(this.client);
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Apps");
		sfApiQuery.addIds(userUrl);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	public ISFQuery<SFConnectedApp> get(URI url) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}

		SFApiQuery<SFConnectedApp> sfApiQuery = new SFApiQuery<SFConnectedApp>(this.client);
		sfApiQuery.setFrom("Apps");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get App by ID
	* @param userUrl 	 	
	* @return ConnectedApp
	*/
	public ISFQuery<SFConnectedApp> getByUser(URI userUrl, String appid) throws InvalidOrMissingParameterException 	{
		if (userUrl == null) {
			throw new InvalidOrMissingParameterException("userUrl");
		}
		if (appid == null) {
			throw new InvalidOrMissingParameterException("appid");
		}

		SFApiQuery<SFConnectedApp> sfApiQuery = new SFApiQuery<SFConnectedApp>(this.client);
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Apps");
		sfApiQuery.addIds(userUrl);
		sfApiQuery.addActionIds(appid);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Revoke App access for Current User
	* @param appUrl 	 	
	* @return no data on success
	*/
	public ISFQuery delete(URI appUrl) throws InvalidOrMissingParameterException 	{
		if (appUrl == null) {
			throw new InvalidOrMissingParameterException("appUrl");
		}

		SFApiQuery sfApiQuery = new SFApiQuery(this.client);
		sfApiQuery.setFrom("Apps");
		sfApiQuery.addIds(appUrl);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

	/**
	* Revoke App access for a given User
	* @param userUrl 	 	
	* @return no data on success
	*/
	public ISFQuery deleteByUser(URI userUrl, String appid) throws InvalidOrMissingParameterException 	{
		if (userUrl == null) {
			throw new InvalidOrMissingParameterException("userUrl");
		}
		if (appid == null) {
			throw new InvalidOrMissingParameterException("appid");
		}

		SFApiQuery sfApiQuery = new SFApiQuery(this.client);
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("Apps");
		sfApiQuery.addIds(userUrl);
		sfApiQuery.addActionIds(appid);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

	/**
	* Get all Two Factor Authentication Apps for the Current User
	* @return A feed of TwoFactorAuthApp objects
	*/
	public ISFQuery<SFODataFeed<SFTwoFactorAuthApp>> tFA()	{

		SFApiQuery<SFODataFeed<SFTwoFactorAuthApp>> sfApiQuery = new SFApiQuery<SFODataFeed<SFTwoFactorAuthApp>>(this.client);
		sfApiQuery.setFrom("Apps");
		sfApiQuery.setAction("TFA");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	public ISFQuery<SFODataFeed<SFTwoFactorAuthApp>> getTFAByUser(URI url) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}

		SFApiQuery<SFODataFeed<SFTwoFactorAuthApp>> sfApiQuery = new SFApiQuery<SFODataFeed<SFTwoFactorAuthApp>>(this.client);
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("TFA");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get Two Factor Authentication App by ID for the Current User
	* @return TwoFactorAuthApp
	*/
	public ISFQuery<SFTwoFactorAuthApp> tFA(String appid) throws InvalidOrMissingParameterException 	{
		if (appid == null) {
			throw new InvalidOrMissingParameterException("appid");
		}

		SFApiQuery<SFTwoFactorAuthApp> sfApiQuery = new SFApiQuery<SFTwoFactorAuthApp>(this.client);
		sfApiQuery.setFrom("Apps");
		sfApiQuery.setAction("TFA");
		sfApiQuery.addActionIds(appid);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	public ISFQuery<SFTwoFactorAuthApp> getTFAByUser(URI url, String tfaAppId) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}
		if (tfaAppId == null) {
			throw new InvalidOrMissingParameterException("tfaAppId");
		}

		SFApiQuery<SFTwoFactorAuthApp> sfApiQuery = new SFApiQuery<SFTwoFactorAuthApp>(this.client);
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("TFA");
		sfApiQuery.addIds(url);
		sfApiQuery.addActionIds(tfaAppId);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Revoke Two Factor Auth App by ID
	* @return no data on success
	*/
	public ISFQuery deleteTFA(String tfaAppId) throws InvalidOrMissingParameterException 	{
		if (tfaAppId == null) {
			throw new InvalidOrMissingParameterException("tfaAppId");
		}

		SFApiQuery sfApiQuery = new SFApiQuery(this.client);
		sfApiQuery.setFrom("Apps");
		sfApiQuery.setAction("TFA");
		sfApiQuery.addActionIds(tfaAppId);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

	/**
	* Revoke Two Factor Auth App by ID
	* @param userUrl 	 	
	* @return no data on success
	*/
	public ISFQuery deleteTFA(URI userUrl, String tfaAppId) throws InvalidOrMissingParameterException 	{
		if (userUrl == null) {
			throw new InvalidOrMissingParameterException("userUrl");
		}
		if (tfaAppId == null) {
			throw new InvalidOrMissingParameterException("tfaAppId");
		}

		SFApiQuery sfApiQuery = new SFApiQuery(this.client);
		sfApiQuery.setFrom("Users");
		sfApiQuery.setAction("TFA");
		sfApiQuery.addIds(userUrl);
		sfApiQuery.addActionIds(tfaAppId);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

}

