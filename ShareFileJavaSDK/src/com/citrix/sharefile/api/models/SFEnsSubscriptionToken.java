
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

public class SFEnsSubscriptionToken extends SFODataObject {

	@SerializedName("SubscriptionId")
	private String SubscriptionId;
	@SerializedName("EntityId")
	private String EntityId;
	@SerializedName("EventTypes")
	private SFSafeEnumFlags<SFEnsEventType> EventTypes;
	@SerializedName("IncludeProgeny")
	private Boolean IncludeProgeny;
	@SerializedName("LastEventCount")
	private Long LastEventCount;

	public String getSubscriptionId() {
		return this.SubscriptionId;
	}

	public void setSubscriptionId(String subscriptionid) {
		this.SubscriptionId = subscriptionid;
	}
	public String getEntityId() {
		return this.EntityId;
	}

	public void setEntityId(String entityid) {
		this.EntityId = entityid;
	}
	public SFSafeEnumFlags<SFEnsEventType> getEventTypes() {
		return this.EventTypes;
	}

	public void setEventTypes(SFSafeEnumFlags<SFEnsEventType> eventtypes) {
		this.EventTypes = eventtypes;
	}
	public Boolean getIncludeProgeny() {
		return this.IncludeProgeny;
	}

	public void setIncludeProgeny(Boolean includeprogeny) {
		this.IncludeProgeny = includeprogeny;
	}
	public Long getLastEventCount() {
		return this.LastEventCount;
	}

	public void setLastEventCount(Long lasteventcount) {
		this.LastEventCount = lasteventcount;
	}

}