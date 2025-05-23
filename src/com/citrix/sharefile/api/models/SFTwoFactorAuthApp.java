
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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.citrix.sharefile.api.enumerations.*;

public class SFTwoFactorAuthApp extends SFODataObject {

	@SerializedName("Name")
	private String Name;
	@SerializedName("LastLoginDate")
	private Date LastLoginDate;
	@SerializedName("PasscodeType")
	private SFSafeEnum<SFTwoFactorAuthPasscodeType> PasscodeType;
	@SerializedName("UserId")
	private String UserId;

		/**
		* TFA App Name
		*/
	public String getName() {
		return this.Name;
	}

		/**
		* TFA App Name
		*/
	public void setName(String name) {
		this.Name = name;
	}
		/**
		* Last Login Date for the TFA App
		*/
	public Date getLastLoginDate() {
		return this.LastLoginDate;
	}

		/**
		* Last Login Date for the TFA App
		*/
	public void setLastLoginDate(Date lastlogindate) {
		this.LastLoginDate = lastlogindate;
	}
		/**
		* The type of Passcode, such as Cookie, associated with this App
		*/
	public SFSafeEnum<SFTwoFactorAuthPasscodeType> getPasscodeType() {
		return this.PasscodeType;
	}

		/**
		* The type of Passcode, such as Cookie, associated with this App
		*/
	public void setPasscodeType(SFSafeEnum<SFTwoFactorAuthPasscodeType> passcodetype) {
		this.PasscodeType = passcodetype;
	}
		/**
		* User associated with the TFA App
		*/
	public String getUserId() {
		return this.UserId;
	}

		/**
		* User associated with the TFA App
		*/
	public void setUserId(String userid) {
		this.UserId = userid;
	}

}