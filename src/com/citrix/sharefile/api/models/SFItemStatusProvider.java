
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

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class SFItemStatusProvider extends SFODataObject {

	@SerializedName("Name")
	private String Name;
	@SerializedName("Description")
	private String Description;
	@SerializedName("ThirdParty")
	private Boolean ThirdParty;
	@SerializedName("Active")
	private Boolean Active;
	@SerializedName("Account")
	private SFAccountItemStatusProvider Account;
	@SerializedName("Statuses")
	private ArrayList<SFItemStatus> Statuses;

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
		* True if the external party is not Citrix-managed
		*/
	public Boolean getThirdParty() {
		return this.ThirdParty;
	}

		/**
		* True if the external party is not Citrix-managed
		*/
	public void setThirdParty(Boolean thirdparty) {
		this.ThirdParty = thirdparty;
	}
	public Boolean getActive() {
		return this.Active;
	}

	public void setActive(Boolean active) {
		this.Active = active;
	}
		/**
		* Configuration for the current ShareFile account in regards to this status provider
		*/
	public SFAccountItemStatusProvider getAccount() {
		return this.Account;
	}

		/**
		* Configuration for the current ShareFile account in regards to this status provider
		*/
	public void setAccount(SFAccountItemStatusProvider account) {
		this.Account = account;
	}
		/**
		* List of all possible statuses defined by this status provider
		*/
	public ArrayList<SFItemStatus> getStatuses() {
		return this.Statuses;
	}

		/**
		* List of all possible statuses defined by this status provider
		*/
	public void setStatuses(ArrayList<SFItemStatus> statuses) {
		this.Statuses = statuses;
	}

}