
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

public class SFSSOInfo extends SFODataObject {

	@SerializedName("Info")
	private ArrayList<SFSSOInfoEntry> Info;
	@SerializedName("AppControlPlane")
	private String AppControlPlane;
	@SerializedName("ApiControlPlane")
	private String ApiControlPlane;

		/**
		* Collection of entries
		*/
	public ArrayList<SFSSOInfoEntry> getInfo() {
		return this.Info;
	}

		/**
		* Collection of entries
		*/
	public void setInfo(ArrayList<SFSSOInfoEntry> info) {
		this.Info = info;
	}
		/**
		* Top level domain for ShareFile application
		*/
	public String getAppControlPlane() {
		return this.AppControlPlane;
	}

		/**
		* Top level domain for ShareFile application
		*/
	public void setAppControlPlane(String appcontrolplane) {
		this.AppControlPlane = appcontrolplane;
	}
		/**
		* Top level domain for ShareFile API
		*/
	public String getApiControlPlane() {
		return this.ApiControlPlane;
	}

		/**
		* Top level domain for ShareFile API
		*/
	public void setApiControlPlane(String apicontrolplane) {
		this.ApiControlPlane = apicontrolplane;
	}

}