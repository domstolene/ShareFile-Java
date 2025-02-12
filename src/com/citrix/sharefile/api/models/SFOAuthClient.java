
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
import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.citrix.sharefile.api.enumerations.*;

public class SFOAuthClient extends SFODataObject {

	@SerializedName("ClientSecret")
	private String ClientSecret;
	@SerializedName("AccountID")
	private String AccountID;
	@SerializedName("Image")
	private String Image;
	@SerializedName("ImageSmall")
	private String ImageSmall;
	@SerializedName("State")
	private SFSafeEnum<SFOAuthState> State;
	@SerializedName("Name")
	private String Name;
	@SerializedName("CompanyName")
	private String CompanyName;
	@SerializedName("ToolUrl")
	private String ToolUrl;
	@SerializedName("CreationDate")
	private Date CreationDate;
	@SerializedName("LastModifiedDate")
	private Date LastModifiedDate;
	@SerializedName("ServerFlow")
	private Boolean ServerFlow;
	@SerializedName("ClientFlow")
	private Boolean ClientFlow;
	@SerializedName("UsernamePasswordFlow")
	private Boolean UsernamePasswordFlow;
	@SerializedName("SamlFlow")
	private Boolean SamlFlow;
	@SerializedName("IsQA")
	private Boolean IsQA;
	@SerializedName("Impersonation")
	private Boolean Impersonation;
	@SerializedName("DeviceRegistration")
	private Boolean DeviceRegistration;
	@SerializedName("CanCreateFreemiumAccount")
	private Boolean CanCreateFreemiumAccount;
	@SerializedName("IsInternalAdmin")
	private Boolean IsInternalAdmin;
	@SerializedName("DisableAuthCookie")
	private Boolean DisableAuthCookie;
	@SerializedName("AccessFilesFolders")
	private SFSafeEnum<SFOAuthClientPermissions> AccessFilesFolders;
	@SerializedName("ModifyFilesFolders")
	private SFSafeEnum<SFOAuthClientPermissions> ModifyFilesFolders;
	@SerializedName("AdminUsers")
	private SFSafeEnum<SFOAuthClientPermissions> AdminUsers;
	@SerializedName("AdminAccounts")
	private SFSafeEnum<SFOAuthClientPermissions> AdminAccounts;
	@SerializedName("ChangeMySettings")
	private SFSafeEnum<SFOAuthClientPermissions> ChangeMySettings;
	@SerializedName("WebAppLogin")
	private SFSafeEnum<SFOAuthClientPermissions> WebAppLogin;
	@SerializedName("AppCode")
	private SFSafeEnum<SFAppCodes> AppCode;
	@SerializedName("RedirectUrls")
	private ArrayList<String> RedirectUrls;

	public String getClientSecret() {
		return this.ClientSecret;
	}

	public void setClientSecret(String clientsecret) {
		this.ClientSecret = clientsecret;
	}
	public String getAccountID() {
		return this.AccountID;
	}

	public void setAccountID(String accountid) {
		this.AccountID = accountid;
	}
	public String getImage() {
		return this.Image;
	}

	public void setImage(String image) {
		this.Image = image;
	}
	public String getImageSmall() {
		return this.ImageSmall;
	}

	public void setImageSmall(String imagesmall) {
		this.ImageSmall = imagesmall;
	}
	public SFSafeEnum<SFOAuthState> getState() {
		return this.State;
	}

	public void setState(SFSafeEnum<SFOAuthState> state) {
		this.State = state;
	}
	public String getName() {
		return this.Name;
	}

	public void setName(String name) {
		this.Name = name;
	}
	public String getCompanyName() {
		return this.CompanyName;
	}

	public void setCompanyName(String companyname) {
		this.CompanyName = companyname;
	}
	public String getToolUrl() {
		return this.ToolUrl;
	}

	public void setToolUrl(String toolurl) {
		this.ToolUrl = toolurl;
	}
	public Date getCreationDate() {
		return this.CreationDate;
	}

	public void setCreationDate(Date creationdate) {
		this.CreationDate = creationdate;
	}
	public Date getLastModifiedDate() {
		return this.LastModifiedDate;
	}

	public void setLastModifiedDate(Date lastmodifieddate) {
		this.LastModifiedDate = lastmodifieddate;
	}
	public Boolean getServerFlow() {
		return this.ServerFlow;
	}

	public void setServerFlow(Boolean serverflow) {
		this.ServerFlow = serverflow;
	}
	public Boolean getClientFlow() {
		return this.ClientFlow;
	}

	public void setClientFlow(Boolean clientflow) {
		this.ClientFlow = clientflow;
	}
	public Boolean getUsernamePasswordFlow() {
		return this.UsernamePasswordFlow;
	}

	public void setUsernamePasswordFlow(Boolean usernamepasswordflow) {
		this.UsernamePasswordFlow = usernamepasswordflow;
	}
	public Boolean getSamlFlow() {
		return this.SamlFlow;
	}

	public void setSamlFlow(Boolean samlflow) {
		this.SamlFlow = samlflow;
	}
	public Boolean getIsQA() {
		return this.IsQA;
	}

	public void setIsQA(Boolean isqa) {
		this.IsQA = isqa;
	}
	public Boolean getImpersonation() {
		return this.Impersonation;
	}

	public void setImpersonation(Boolean impersonation) {
		this.Impersonation = impersonation;
	}
	public Boolean getDeviceRegistration() {
		return this.DeviceRegistration;
	}

	public void setDeviceRegistration(Boolean deviceregistration) {
		this.DeviceRegistration = deviceregistration;
	}
	public Boolean getCanCreateFreemiumAccount() {
		return this.CanCreateFreemiumAccount;
	}

	public void setCanCreateFreemiumAccount(Boolean cancreatefreemiumaccount) {
		this.CanCreateFreemiumAccount = cancreatefreemiumaccount;
	}
	public Boolean getIsInternalAdmin() {
		return this.IsInternalAdmin;
	}

	public void setIsInternalAdmin(Boolean isinternaladmin) {
		this.IsInternalAdmin = isinternaladmin;
	}
	public Boolean getDisableAuthCookie() {
		return this.DisableAuthCookie;
	}

	public void setDisableAuthCookie(Boolean disableauthcookie) {
		this.DisableAuthCookie = disableauthcookie;
	}
	public SFSafeEnum<SFOAuthClientPermissions> getAccessFilesFolders() {
		return this.AccessFilesFolders;
	}

	public void setAccessFilesFolders(SFSafeEnum<SFOAuthClientPermissions> accessfilesfolders) {
		this.AccessFilesFolders = accessfilesfolders;
	}
	public SFSafeEnum<SFOAuthClientPermissions> getModifyFilesFolders() {
		return this.ModifyFilesFolders;
	}

	public void setModifyFilesFolders(SFSafeEnum<SFOAuthClientPermissions> modifyfilesfolders) {
		this.ModifyFilesFolders = modifyfilesfolders;
	}
	public SFSafeEnum<SFOAuthClientPermissions> getAdminUsers() {
		return this.AdminUsers;
	}

	public void setAdminUsers(SFSafeEnum<SFOAuthClientPermissions> adminusers) {
		this.AdminUsers = adminusers;
	}
	public SFSafeEnum<SFOAuthClientPermissions> getAdminAccounts() {
		return this.AdminAccounts;
	}

	public void setAdminAccounts(SFSafeEnum<SFOAuthClientPermissions> adminaccounts) {
		this.AdminAccounts = adminaccounts;
	}
	public SFSafeEnum<SFOAuthClientPermissions> getChangeMySettings() {
		return this.ChangeMySettings;
	}

	public void setChangeMySettings(SFSafeEnum<SFOAuthClientPermissions> changemysettings) {
		this.ChangeMySettings = changemysettings;
	}
	public SFSafeEnum<SFOAuthClientPermissions> getWebAppLogin() {
		return this.WebAppLogin;
	}

	public void setWebAppLogin(SFSafeEnum<SFOAuthClientPermissions> webapplogin) {
		this.WebAppLogin = webapplogin;
	}
	public SFSafeEnum<SFAppCodes> getAppCode() {
		return this.AppCode;
	}

	public void setAppCode(SFSafeEnum<SFAppCodes> appcode) {
		this.AppCode = appcode;
	}
	public ArrayList<String> getRedirectUrls() {
		return this.RedirectUrls;
	}

	public void setRedirectUrls(ArrayList<String> redirecturls) {
		this.RedirectUrls = redirecturls;
	}

}