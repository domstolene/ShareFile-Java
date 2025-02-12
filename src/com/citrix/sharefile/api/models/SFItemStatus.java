
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

package com.citrix.sharefile.api.models;

import com.google.gson.annotations.SerializedName;

public class SFItemStatus extends SFODataObject {

	@SerializedName("Provider")
	private SFItemStatusProvider Provider;
	@SerializedName("Name")
	private String Name;
	@SerializedName("Description")
	private String Description;
	@SerializedName("DefaultObjectInfo")
	private String DefaultObjectInfo;
	@SerializedName("Active")
	private Boolean Active;

		/**
		* The external party who defined this status value
		*/
	public SFItemStatusProvider getProvider() {
		return this.Provider;
	}

		/**
		* The external party who defined this status value
		*/
	public void setProvider(SFItemStatusProvider provider) {
		this.Provider = provider;
	}
	public String getName() {
		return this.Name;
	}

	public void setName(String name) {
		this.Name = name;
	}
	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String description) {
		this.Description = description;
	}
		/**
		* The default value to use for
		*/
	public String getDefaultObjectInfo() {
		return this.DefaultObjectInfo;
	}

		/**
		* The default value to use for
		*/
	public void setDefaultObjectInfo(String defaultobjectinfo) {
		this.DefaultObjectInfo = defaultobjectinfo;
	}
	public Boolean getActive() {
		return this.Active;
	}

	public void setActive(Boolean active) {
		this.Active = active;
	}

}