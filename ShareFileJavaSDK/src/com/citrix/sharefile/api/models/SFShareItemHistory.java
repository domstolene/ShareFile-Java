
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

public class SFShareItemHistory extends SFODataObject {

	@SerializedName("Title")
	private String Title;
	@SerializedName("Recipient")
	private String Recipient;
	@SerializedName("ActivityType")
	private SFSafeEnum<SFItemAction> ActivityType;
	@SerializedName("DownloadDate")
	private Date DownloadDate;

	public String getTitle() {
		return this.Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}
	public String getRecipient() {
		return this.Recipient;
	}

	public void setRecipient(String recipient) {
		this.Recipient = recipient;
	}
	public SFSafeEnum<SFItemAction> getActivityType() {
		return this.ActivityType;
	}

	public void setActivityType(SFSafeEnum<SFItemAction> activitytype) {
		this.ActivityType = activitytype;
	}
	public Date getDownloadDate() {
		return this.DownloadDate;
	}

	public void setDownloadDate(Date downloaddate) {
		this.DownloadDate = downloaddate;
	}

}