
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

package com.sharefile.api.entities.internal;

import com.sharefile.api.entities.*;
import com.sharefile.api.models.*;
import com.sharefile.api.models.internal.*;
import com.sharefile.api.SFApiQuery;
import com.sharefile.api.interfaces.ISFQuery;


import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
 
import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;

public class SFEncryptedEmailsEntityInternal extends SFODataEntityBase
{
	public ISFQuery<SFEncryptedEmail> get(URI url, String firstName, String lastName, String email, String company)
	{
		SFApiQuery<SFEncryptedEmail> sfApiQuery = new SFApiQuery<SFEncryptedEmail>();
		sfApiQuery.setFrom("EncryptedEmails");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("firstName", firstName);
		sfApiQuery.addQueryString("lastName", lastName);
		sfApiQuery.addQueryString("email", email);
		sfApiQuery.addQueryString("company", company);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	public ISFQuery<SFODataFeed<SFEncryptedEmail>> thread(URI url, String firstName, String lastName, String email, String company)
	{
		SFApiQuery<SFODataFeed<SFEncryptedEmail>> sfApiQuery = new SFApiQuery<SFODataFeed<SFEncryptedEmail>>();
		sfApiQuery.setFrom("EncryptedEmails");
		sfApiQuery.setAction("Thread");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("firstName", firstName);
		sfApiQuery.addQueryString("lastName", lastName);
		sfApiQuery.addQueryString("email", email);
		sfApiQuery.addQueryString("company", company);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	public ISFQuery<SFODataFeed<SFEncryptedEmail>> received()
	{
		SFApiQuery<SFODataFeed<SFEncryptedEmail>> sfApiQuery = new SFApiQuery<SFODataFeed<SFEncryptedEmail>>();
		sfApiQuery.setFrom("EncryptedEmails");
		sfApiQuery.setAction("Received");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	public ISFQuery<SFEncryptedEmail> reply(URI url, SFEncryptedEmailParams encryptedEmailParams)
	{
		SFApiQuery<SFEncryptedEmail> sfApiQuery = new SFApiQuery<SFEncryptedEmail>();
		sfApiQuery.setFrom("EncryptedEmails");
		sfApiQuery.setAction("Reply");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(encryptedEmailParams);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	public ISFQuery<SFEncryptedEmail> replyAll(URI url, SFEncryptedEmailParams encryptedEmailParams)
	{
		SFApiQuery<SFEncryptedEmail> sfApiQuery = new SFApiQuery<SFEncryptedEmail>();
		sfApiQuery.setFrom("EncryptedEmails");
		sfApiQuery.setAction("ReplyAll");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(encryptedEmailParams);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	public ISFQuery<SFEncryptedEmail> create(SFEncryptedEmailParams encryptedEmailParams)
	{
		SFApiQuery<SFEncryptedEmail> sfApiQuery = new SFApiQuery<SFEncryptedEmail>();
		sfApiQuery.setFrom("EncryptedEmails");
		sfApiQuery.setBody(encryptedEmailParams);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	public ISFQuery send(URI url, SFEncryptedEmailSendParams encryptedEmailSendParams)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("EncryptedEmails");
		sfApiQuery.setAction("Send");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(encryptedEmailSendParams);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	public ISFQuery complete(URI url, SFEncryptedEmailSendParams encryptedEmailSendParams)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("EncryptedEmails");
		sfApiQuery.setAction("Complete");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(encryptedEmailSendParams);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	public ISFQuery<InputStream> message(URI url, String aliasId, Boolean redirect)
	{
		SFApiQuery<InputStream> sfApiQuery = new SFApiQuery<InputStream>();
		sfApiQuery.setFrom("EncryptedEmails");
		sfApiQuery.setAction("Message");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("aliasId", aliasId);
		sfApiQuery.addQueryString("redirect", redirect);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	public ISFQuery delete(URI url)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("EncryptedEmails");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

	public ISFQuery<SFUploadSpecification> upload(URI url, SFSafeEnum<SFUploadMethod> method, Boolean raw, String fileName, Long fileSize, String batchId, Boolean batchLast, Boolean canResume, Boolean startOver, Boolean unzip, String tool, Boolean overwrite, String title, String details, Boolean isSend, String sendGuid, String opid, Integer threadCount, String responseFormat, Boolean notify, Date clientCreatedDateUTC, Date clientModifiedDateUTC, Integer expirationDays)
	{
		SFApiQuery<SFUploadSpecification> sfApiQuery = new SFApiQuery<SFUploadSpecification>();
		sfApiQuery.setFrom("EncryptedEmails");
		sfApiQuery.setAction("Upload");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("method", method);
		sfApiQuery.addQueryString("raw", raw);
		sfApiQuery.addQueryString("fileName", fileName);
		sfApiQuery.addQueryString("fileSize", fileSize);
		sfApiQuery.addQueryString("batchId", batchId);
		sfApiQuery.addQueryString("batchLast", batchLast);
		sfApiQuery.addQueryString("canResume", canResume);
		sfApiQuery.addQueryString("startOver", startOver);
		sfApiQuery.addQueryString("unzip", unzip);
		sfApiQuery.addQueryString("tool", tool);
		sfApiQuery.addQueryString("overwrite", overwrite);
		sfApiQuery.addQueryString("title", title);
		sfApiQuery.addQueryString("details", details);
		sfApiQuery.addQueryString("isSend", isSend);
		sfApiQuery.addQueryString("sendGuid", sendGuid);
		sfApiQuery.addQueryString("opid", opid);
		sfApiQuery.addQueryString("threadCount", threadCount);
		sfApiQuery.addQueryString("responseFormat", responseFormat);
		sfApiQuery.addQueryString("notify", notify);
		sfApiQuery.addQueryString("clientCreatedDateUTC", clientCreatedDateUTC);
		sfApiQuery.addQueryString("clientModifiedDateUTC", clientModifiedDateUTC);
		sfApiQuery.addQueryString("expirationDays", expirationDays);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	public ISFQuery<SFUploadSpecification> upload2(URI url, SFUploadRequestParams uploadParams, Integer expirationDays)
	{
		SFApiQuery<SFUploadSpecification> sfApiQuery = new SFApiQuery<SFUploadSpecification>();
		sfApiQuery.setFrom("EncryptedEmails");
		sfApiQuery.setAction("Upload2");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("expirationDays", expirationDays);
		sfApiQuery.setBody(uploadParams);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

}

