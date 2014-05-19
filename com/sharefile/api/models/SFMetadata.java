
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

package com.sharefile.api.models;

public class SFMetadata extends SFODataObject {

	private String mName;
	private String mValue;
	private Boolean mIsPublic;

		/**
		* The name of a custom metadata entry
		*/
	public String getName() {
		return mName;
	}

		/**
		* The name of a custom metadata entry
		*/
	public void setName(String name) {
		mName = name;
	}
		/**
		* The value of a custom metadata entry
		*/
	public String getValue() {
		return mValue;
	}

		/**
		* The value of a custom metadata entry
		*/
	public void setValue(String value) {
		mValue = value;
	}
		/**
		* Whether the metadata entry is public or private. Used only by the zone or storage center metadata where only zone admins have access to private metadata.
		*/
	public Boolean getIsPublic() {
		return mIsPublic;
	}

		/**
		* Whether the metadata entry is public or private. Used only by the zone or storage center metadata where only zone admins have access to private metadata.
		*/
	public void setIsPublic(Boolean ispublic) {
		mIsPublic = ispublic;
	}
}