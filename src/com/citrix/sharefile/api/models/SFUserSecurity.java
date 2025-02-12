
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

public class SFUserSecurity extends SFODataObject {

	@SerializedName("IsDisabled")
	private Boolean IsDisabled;
	@SerializedName("IsLocked")
	private Boolean IsLocked;
	@SerializedName("LockExpires")
	private Date LockExpires;
	@SerializedName("LastWebAppLogin")
	private Date LastWebAppLogin;
	@SerializedName("LastAnyLogin")
	private Date LastAnyLogin;
	@SerializedName("FirstAnyLogin")
	private Date FirstAnyLogin;
	@SerializedName("UserIPRestrictions")
	private String UserIPRestrictions;
	@SerializedName("DisableLoginBefore")
	private Date DisableLoginBefore;
	@SerializedName("DisableLoginAfter")
	private Date DisableLoginAfter;
	@SerializedName("ForcePasswordChange")
	private Boolean ForcePasswordChange;
	@SerializedName("PasswordNeverExpires")
	private Boolean PasswordNeverExpires;
	@SerializedName("LastPasswordChange")
	private Date LastPasswordChange;
	@SerializedName("UsernameShort")
	private String UsernameShort;
	@SerializedName("LastFailedLogin")
	private Date LastFailedLogin;
	@SerializedName("LastFailedLoginIP")
	private String LastFailedLoginIP;
	@SerializedName("FailedLoginCount")
	private Integer FailedLoginCount;
	@SerializedName("UserAuthenticationType")
	private SFSafeEnum<SFUserAuthenticationType> UserAuthenticationType;

	public Boolean getIsDisabled() {
		return this.IsDisabled;
	}

	public void setIsDisabled(Boolean isdisabled) {
		this.IsDisabled = isdisabled;
	}
	public Boolean getIsLocked() {
		return this.IsLocked;
	}

	public void setIsLocked(Boolean islocked) {
		this.IsLocked = islocked;
	}
	public Date getLockExpires() {
		return this.LockExpires;
	}

	public void setLockExpires(Date lockexpires) {
		this.LockExpires = lockexpires;
	}
	public Date getLastWebAppLogin() {
		return this.LastWebAppLogin;
	}

	public void setLastWebAppLogin(Date lastwebapplogin) {
		this.LastWebAppLogin = lastwebapplogin;
	}
	public Date getLastAnyLogin() {
		return this.LastAnyLogin;
	}

	public void setLastAnyLogin(Date lastanylogin) {
		this.LastAnyLogin = lastanylogin;
	}
	public Date getFirstAnyLogin() {
		return this.FirstAnyLogin;
	}

	public void setFirstAnyLogin(Date firstanylogin) {
		this.FirstAnyLogin = firstanylogin;
	}
	public String getUserIPRestrictions() {
		return this.UserIPRestrictions;
	}

	public void setUserIPRestrictions(String useriprestrictions) {
		this.UserIPRestrictions = useriprestrictions;
	}
	public Date getDisableLoginBefore() {
		return this.DisableLoginBefore;
	}

	public void setDisableLoginBefore(Date disableloginbefore) {
		this.DisableLoginBefore = disableloginbefore;
	}
	public Date getDisableLoginAfter() {
		return this.DisableLoginAfter;
	}

	public void setDisableLoginAfter(Date disableloginafter) {
		this.DisableLoginAfter = disableloginafter;
	}
	public Boolean getForcePasswordChange() {
		return this.ForcePasswordChange;
	}

	public void setForcePasswordChange(Boolean forcepasswordchange) {
		this.ForcePasswordChange = forcepasswordchange;
	}
	public Boolean getPasswordNeverExpires() {
		return this.PasswordNeverExpires;
	}

	public void setPasswordNeverExpires(Boolean passwordneverexpires) {
		this.PasswordNeverExpires = passwordneverexpires;
	}
	public Date getLastPasswordChange() {
		return this.LastPasswordChange;
	}

	public void setLastPasswordChange(Date lastpasswordchange) {
		this.LastPasswordChange = lastpasswordchange;
	}
	public String getUsernameShort() {
		return this.UsernameShort;
	}

	public void setUsernameShort(String usernameshort) {
		this.UsernameShort = usernameshort;
	}
	public Date getLastFailedLogin() {
		return this.LastFailedLogin;
	}

	public void setLastFailedLogin(Date lastfailedlogin) {
		this.LastFailedLogin = lastfailedlogin;
	}
	public String getLastFailedLoginIP() {
		return this.LastFailedLoginIP;
	}

	public void setLastFailedLoginIP(String lastfailedloginip) {
		this.LastFailedLoginIP = lastfailedloginip;
	}
	public Integer getFailedLoginCount() {
		return this.FailedLoginCount;
	}

	public void setFailedLoginCount(Integer failedlogincount) {
		this.FailedLoginCount = failedlogincount;
	}
		/**
		* Calculated value for how the user should authenticate
		*/
	public SFSafeEnum<SFUserAuthenticationType> getUserAuthenticationType() {
		return this.UserAuthenticationType;
	}

		/**
		* Calculated value for how the user should authenticate
		*/
	public void setUserAuthenticationType(SFSafeEnum<SFUserAuthenticationType> userauthenticationtype) {
		this.UserAuthenticationType = userauthenticationtype;
	}

}