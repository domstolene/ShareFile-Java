
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2014 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.sharefile.api.entities;

import com.sharefile.api.SFApiQuery;
import com.sharefile.api.enumerations.SFHttpMethod;
import com.sharefile.api.models.SFItem;
import com.sharefile.api.models.SFODataFeed;
import com.sharefile.api.models.SFShare;
import com.sharefile.api.models.SFShareAlias;
import com.sharefile.api.models.SFShareRequestParams;
import com.sharefile.api.models.SFShareSendParams;


public class SFSharesEntity extends SFODataEntityBase
{
    /**
	* Get List of Shares
	* Retrieve all outstanding Shares of the authenticated user
	* @return List of Shares created by the authenticated user
    */
	public static SFApiQuery<SFODataFeed<SFShare>> get()
	{
		SFApiQuery<SFODataFeed<SFShare>> query = new SFApiQuery<SFODataFeed<SFShare>>();
		query.setFrom("Shares");
		query.setHttpMethod(SFHttpMethod.GET);
		return query;
	}

    /**
	* Get List of Shares
	* Retrieve all outstanding Shares of the authenticated user
	* @return List of Shares created by the authenticated user
    */
	public static SFApiQuery<SFShare> get(String id)
	{
		SFApiQuery<SFShare> query = new SFApiQuery<SFShare>();
		query.setFrom("Shares");
		query.setId(id);
		query.setHttpMethod(SFHttpMethod.GET);
		return query;
	}

    /**
	* Get Recipients of a Share
	* Retrieve the list of Recipients in the share. Recipients represent the target users of the Share, containing
	* access information, such as number of times that user downloaded files from the share. Each Recipient is
	* identified by an Alias, which is an unique ID given to each user - allowing tracking of downloads for
	* non-authenticated users.
	* @param id 	
	* @return A feed of Share Aliases representing recipients of the Share
    */
	public static SFApiQuery<SFODataFeed<SFShareAlias>> getRecipients(String id , String parentid)
	{
		SFApiQuery<SFODataFeed<SFShareAlias>> query = new SFApiQuery<SFODataFeed<SFShareAlias>>();
		query.setFrom("Shares");
		query.setAction("Recipients");
		query.setId(id);
		query.addQueryString("id", parentid);
		query.setHttpMethod(SFHttpMethod.GET);
		return query;
	}

    /**
	* Get Items of a Share
	* Retrieve the list of Items (files and folders) in the Share.
	* @param id 	
	* @return A feed of Items of the Share
    */
	public static SFApiQuery<SFODataFeed<SFItem>> getItems(String id , String parentid)
	{
		SFApiQuery<SFODataFeed<SFItem>> query = new SFApiQuery<SFODataFeed<SFItem>>();
		query.setFrom("Shares");
		query.setAction("Items");
		query.setId(id);
		query.addQueryString("id", parentid);
		query.setHttpMethod(SFHttpMethod.GET);
		return query;
	}
    

    /**
	* Downloads Share Items
	* Downloads items from the Share. The default action will download all Items in the Share.
	* If a Share has a single item, the download attachment name
	* will use the item name. Otherwise, the download will contain a ZIP archive containing all
	* files and folders in the share, named Files.zip.To download Shares that require authentication, make sure this request is authenticated. To download
	* shares that require require user information, provide the Name, Email and Company parameters in the URI
	* query. Anyone can download files from anonymous shares.You can also download individual Items in the Share. Use the Share(id)/Items(id)/Download action. The
	* item ID must be a top-level item in the Share - i.e., you cannot download or address files contained inside
	* a shared folder.
	* @param id 	
	* @param Name 	
	* @param Email 	
	* @param Company 	
	* @return Redirects the caller (302) to the download address for the share contents.
    */
	public static SFApiQuery<SFStream> download(String id, String Name, String Email, String Company)
	{
		SFApiQuery<SFStream> query = new SFApiQuery<SFStream>();
		query.setFrom("Shares");
		query.setAction("Download");
		query.setId(id);
		query.addQueryString("Name", Name);
		query.addQueryString("Email", Email);
		query.addQueryString("Company", Company);
		query.setHttpMethod(SFHttpMethod.GET);
		return query;
	}

    /**
	* Create Share
    * {
    * "ShareType":"Send",
    * "Title":"Sample Send Share",
    * "Items": [ { "Id":"itemid" }, {...} ],
    * "Recipients":[ { "User": { "Id":"userid" } }, { "User": { "Email": "user@email" } } ],
    * "ExpirationDate": "2013-07-23",
    * "RequireLogin": false,
    * "RequireUserInfo": false,
    * "MaxDownloads": -1,
    * "UsesStreamIDs": false
    * }
    * {
    * "ShareType":"Request",
    * "Title":"Sample Request Share",
    * "Recipients":[ { "User": { "Id":"userid" } }, { "User": { "Email": "user@email" } } ],
    * "Parent": { "Id":"folderid" },
    * "ExpirationDate": "2013-07-23",
    * "RequireLogin": false,
    * "RequireUserInfo": false,
    * "TrackUntilDate": "2013-07-23",
    * "SendFrequency": -1,
    * "SendInterval": -1
    * }
	* Creates a new Send or Request Share.
	* Expiration date:
	* - if not specified the default is 30 days
	* - "9999-12-31" disables share expiration.
	* To use stream IDs as item IDs UsesStreamIDs needs to be set to true, and all the IDs in Items need to be specified
	* as stream IDs.
	* @param share 	
	* @param notify 	
	* @return The new Share
    */
	public SFApiQuery<SFShare> create(SFShare share, Boolean notify)
	{
		SFApiQuery<SFShare> query = new SFApiQuery<SFShare>();
		query.setFrom("Shares");
		query.addQueryString("notify", notify);
		query.setBody(share);
		query.setHttpMethod(SFHttpMethod.POST);
		return query;
	}

    /**
	* Modify Share
    * {
    * "Title": "New Title",
    * "ExpirationDate": "2013-07-23",
    * "RequireLogin": false,
    * "Items": [ { "Id":"itemid" }, {...} ],
    * }
	* Modifies an existing Share. If Items are specified they are added to the share.
	* @param id 	
	* @param share 	
	* @return The modified Share
    */
	public SFApiQuery<SFShare> update(String id, SFShare share)
	{
		SFApiQuery<SFShare> query = new SFApiQuery<SFShare>();
		query.setFrom("Shares");
		query.setId(id);
		query.setBody(share);
		query.setHttpMethod(SFHttpMethod.POST);
		return query;
	}

    /**
	* Delete Share
	* Removes an existing Share
	* @param id 	
    */
	public SFApiQuery delete(String id)
	{
		SFApiQuery query = new SFApiQuery();
		query.setFrom("Shares");
		query.setId(id);
		query.setHttpMethod(SFHttpMethod.DELETE);
		return query;
	}

    /**
	* Create Share Alias
	* Creates a share alias for the specified share ID and user email. If a user with the given email address does not
	* exist it is created first.
	* For shares requiring login an activation email is sent to the created user. If 'notify' is enabled, the user activation is
	* included in the share notification email.
	* @param id 	
	* @param email 	
	* @param notify 	
	* @return Share with the AliasID property set to the created alias ID
    */
	public SFApiQuery<SFShare> createAlias(String id, String email, Boolean notify)
	{
		SFApiQuery<SFShare> query = new SFApiQuery<SFShare>();
		query.setFrom("Shares");
		query.setAction("Alias");
		query.setId(id);
		query.addQueryString("email", email);
		query.addQueryString("notify", notify);
		query.setHttpMethod(SFHttpMethod.DELETE);
		return query;
	}

    /**
	* Deliver Send a File Email
	* Sends an Email to the specified list of addresses, containing a link to the specified Items.
	* The default number of expiration days is 30. -1 disables share expiration.
	* @param parameters 	
    */
	public SFApiQuery createSend(SFShareSendParams parameters)
	{
		SFApiQuery query = new SFApiQuery();
		query.setFrom("Shares");
		query.setAction("Send");
		query.setBody(parameters);
		query.setHttpMethod(SFHttpMethod.POST);
		return query;
	}

    /**
	* Deliver Request a File Email
	* Sends an Email to the specified list of addresses, containing a link to files upload.
	* The default number of expiration days is 30. -1 disables share expiration.
	* @param parameters 	
    */
	public SFApiQuery createRequest(SFShareRequestParams parameters)
	{
		SFApiQuery query = new SFApiQuery();
		query.setFrom("Shares");
		query.setAction("Request");
		query.setBody(parameters);
		query.setHttpMethod(SFHttpMethod.POST);
		return query;
	}

}

