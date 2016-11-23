
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

public class SFUserConfirmRequirement extends SFODataObject {

	@SerializedName("AuthenticationId")
	private String AuthenticationId;
	@SerializedName("IsProbableSAMLOnlyUser")
	private Boolean IsProbableSAMLOnlyUser;
	@SerializedName("IsADLinked")
	private Boolean IsADLinked;
	@SerializedName("ADUserName")
	private String ADUserName;
	@SerializedName("TempPassword")
	private String TempPassword;
	@SerializedName("User")
	private SFUser User;

	public String getAuthenticationId() {
		return this.AuthenticationId;
	}

	public void setAuthenticationId(String authenticationid) {
		this.AuthenticationId = authenticationid;
	}
	public Boolean getIsProbableSAMLOnlyUser() {
		return this.IsProbableSAMLOnlyUser;
	}

	public void setIsProbableSAMLOnlyUser(Boolean isprobablesamlonlyuser) {
		this.IsProbableSAMLOnlyUser = isprobablesamlonlyuser;
	}
	public Boolean getIsADLinked() {
		return this.IsADLinked;
	}

	public void setIsADLinked(Boolean isadlinked) {
		this.IsADLinked = isadlinked;
	}
	public String getADUserName() {
		return this.ADUserName;
	}

	public void setADUserName(String adusername) {
		this.ADUserName = adusername;
	}
	public String getTempPassword() {
		return this.TempPassword;
	}

	public void setTempPassword(String temppassword) {
		this.TempPassword = temppassword;
	}
	public SFUser getUser() {
		return this.User;
	}

	public void setUser(SFUser user) {
		this.User = user;
	}

}