
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

package com.citrix.sharefile.api.models;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.citrix.sharefile.api.*;
import com.citrix.sharefile.api.enumerations.*;
import com.citrix.sharefile.api.models.*;

public class SFAccessControlParam extends SFODataObject {

	@SerializedName("AccessControl")
	private SFAccessControl AccessControl;
	@SerializedName("NotifyUser")
	private Boolean NotifyUser;
	@SerializedName("NotifyMessage")
	private String NotifyMessage;
	@SerializedName("Recursive")
	private Boolean Recursive;

		/**
		* AccessControl.Item is inherited from AccessControlsBulkParams and cannot be specified here
		*/
	public SFAccessControl getAccessControl() {
		return this.AccessControl;
	}

		/**
		* AccessControl.Item is inherited from AccessControlsBulkParams and cannot be specified here
		*/
	public void setAccessControl(SFAccessControl accesscontrol) {
		this.AccessControl = accesscontrol;
	}
		/**
		* Defines whether this principal should receieve a notice on the permission grant.
		* If not specified it is inherited AccessControlsBulkParams
		*/
	public Boolean getNotifyUser() {
		return this.NotifyUser;
	}

		/**
		* Defines whether this principal should receieve a notice on the permission grant.
		* If not specified it is inherited AccessControlsBulkParams
		*/
	public void setNotifyUser(Boolean notifyuser) {
		this.NotifyUser = notifyuser;
	}
		/**
		* Custom notification message, if any
		* If not specified it is inherited AccessControlsBulkParams
		*/
	public String getNotifyMessage() {
		return this.NotifyMessage;
	}

		/**
		* Custom notification message, if any
		* If not specified it is inherited AccessControlsBulkParams
		*/
	public void setNotifyMessage(String notifymessage) {
		this.NotifyMessage = notifymessage;
	}
		/**
		* Defines whether this ACL change should be applied recursively
		*/
	public Boolean getRecursive() {
		return this.Recursive;
	}

		/**
		* Defines whether this ACL change should be applied recursively
		*/
	public void setRecursive(Boolean recursive) {
		this.Recursive = recursive;
	}

}