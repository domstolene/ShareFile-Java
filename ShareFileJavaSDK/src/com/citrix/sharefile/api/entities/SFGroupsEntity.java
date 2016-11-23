
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2016 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.citrix.sharefile.api.entities;

import com.citrix.sharefile.api.*;
import com.citrix.sharefile.api.entities.*;
import com.citrix.sharefile.api.models.*;
import com.citrix.sharefile.api.SFApiQuery;
import com.citrix.sharefile.api.interfaces.ISFQuery;


import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
 
import com.google.gson.annotations.SerializedName;
import com.citrix.sharefile.api.enumerations.SFSafeEnum;
import com.citrix.sharefile.api.enumerations.SFSafeEnumFlags;
import com.citrix.sharefile.api.interfaces.ISFApiClient;
import com.citrix.sharefile.api.exceptions.InvalidOrMissingParameterException;

public class SFGroupsEntity extends SFEntitiesBase
{
	public SFGroupsEntity(ISFApiClient client) {
		super(client);
	}

	/**
	* Get Group List
	* Retrieves all Distribution Groups this user has permissions to View in this account
	* @return a list of Groups this user has access to
	*/
	public ISFQuery<SFODataFeed<SFGroup>> get()	{

		SFApiQuery<SFODataFeed<SFGroup>> sfApiQuery = new SFApiQuery<SFODataFeed<SFGroup>>(this.client);
		sfApiQuery.setFrom("Groups");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get Group By ID
	* Retrives a single Group by id
	* @param url 	 	
	* @return A single Group object
	*/
	public ISFQuery<SFGroup> get(URI url) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}

		SFApiQuery<SFGroup> sfApiQuery = new SFApiQuery<SFGroup>(this.client);
		sfApiQuery.setFrom("Groups");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Delete Group
	* Removes a single Group by id
	* @param url 	 	
	*/
	public ISFQuery delete(URI url) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}

		SFApiQuery sfApiQuery = new SFApiQuery(this.client);
		sfApiQuery.setFrom("Groups");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

	/**
	* Create Group
    * {
    * "Name":"Name",
    * "IsShared":true,
    * "Contacts":[{"Email":"user.one@domain.com"},{"Email":"user.two@domain.com"}]
    * }
	* Creates a new group. The Post body must include the specification of the group.
	* @param group 	 	
	* @return the new group instance
	*/
	public ISFQuery<SFGroup> create(SFGroup group) throws InvalidOrMissingParameterException 	{
		if (group == null) {
			throw new InvalidOrMissingParameterException("group");
		}

		SFApiQuery<SFGroup> sfApiQuery = new SFApiQuery<SFGroup>(this.client);
		sfApiQuery.setFrom("Groups");
		sfApiQuery.setBody(group);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	/**
	* Update Group
    * {
    * "Name":"Name",
    * "IsShared":true,
    * }
	* Updates an existing group.
	* This operation will ignore the provided clients list. Use the \Contacts navigation link to
	* add/remove elements from a group
	* @param url 	 	
	* @param group 	 	
	* @return the modified group object
	*/
	public ISFQuery<SFGroup> update(URI url, SFGroup group) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}
		if (group == null) {
			throw new InvalidOrMissingParameterException("group");
		}

		SFApiQuery<SFGroup> sfApiQuery = new SFApiQuery<SFGroup>(this.client);
		sfApiQuery.setFrom("Groups");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(group);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

	/**
	* Get Group Contacts
	* Retrieves the Contacts navigation property of a Group
	* @param url 	 	
	* @return A feed of Contacts representing the members of the Group
	*/
	public ISFQuery<SFODataFeed<SFContact>> getContacts(URI url) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}

		SFApiQuery<SFODataFeed<SFContact>> sfApiQuery = new SFApiQuery<SFODataFeed<SFContact>>(this.client);
		sfApiQuery.setFrom("Groups");
		sfApiQuery.setAction("Contacts");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Add Contacts to Group
    * [{"Email":"user.one@domain.com"},{"Id":"abcd"}]
	* Adds a list of contacts to a group
	* The contact list may contain either contact ID (same as User ID) or Email.
	* @param url 	 	
	* @param contacts 	 	
	* @return The updated list of contacts for this group
	*/
	public ISFQuery<SFODataFeed<SFContact>> createContacts(URI url, ArrayList<SFContact> contacts) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}
		if (contacts == null) {
			throw new InvalidOrMissingParameterException("contacts");
		}

		SFApiQuery<SFODataFeed<SFContact>> sfApiQuery = new SFApiQuery<SFODataFeed<SFContact>>(this.client);
		sfApiQuery.setFrom("Groups");
		sfApiQuery.setAction("Contacts");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(contacts);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	/**
	* Remove Contacts from Group
    * [{"Email":"user.one@domain.com"},{"Id":"abcd"}]
	* Removes contacts from a group
	* The contact list may contain either contact ID (same as User ID) or Email.
	* This method will ignore missing references in the provided list - i.e., if an email in the contacts
	* list is not present in the group, it will be ignored.
	* The method will not enforce that ID and Email match inside a single Contact instance: Id will be
	* looked up first, then Email.
	* @param url 	 	
	* @param contacts 	 	
	* @return The updated list of contacts for this group
	*/
	public ISFQuery<SFODataFeed<SFContact>> deleteContacts(URI url, ArrayList<SFContact> contacts) throws InvalidOrMissingParameterException 	{
		if (url == null) {
			throw new InvalidOrMissingParameterException("url");
		}
		if (contacts == null) {
			throw new InvalidOrMissingParameterException("contacts");
		}

		SFApiQuery<SFODataFeed<SFContact>> sfApiQuery = new SFApiQuery<SFODataFeed<SFContact>>(this.client);
		sfApiQuery.setFrom("Groups");
		sfApiQuery.setAction("Contacts");
		sfApiQuery.addIds(url);
		sfApiQuery.setBody(contacts);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

}

