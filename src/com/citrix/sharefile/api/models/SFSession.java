
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

public class SFSession extends SFODataObject {

	@SerializedName("Principal")
	private SFPrincipal Principal;
	@SerializedName("AuthenticationType")
	private String AuthenticationType;
	@SerializedName("OAuth2ClientName")
	private String OAuth2ClientName;
	@SerializedName("Tool")
	private String Tool;
	@SerializedName("Version")
	private String Version;
	@SerializedName("ClientIPAddress")
	private String ClientIPAddress;
	@SerializedName("IsAuthenticated")
	private Boolean IsAuthenticated;
	@SerializedName("Name")
	private String Name;
	@SerializedName("DeviceUser")
	private SFDeviceUser DeviceUser;

	public SFPrincipal getPrincipal() {
		return this.Principal;
	}

	public void setPrincipal(SFPrincipal principal) {
		this.Principal = principal;
	}
	public String getAuthenticationType() {
		return this.AuthenticationType;
	}

	public void setAuthenticationType(String authenticationtype) {
		this.AuthenticationType = authenticationtype;
	}
	public String getOAuth2ClientName() {
		return this.OAuth2ClientName;
	}

	public void setOAuth2ClientName(String oauth2clientname) {
		this.OAuth2ClientName = oauth2clientname;
	}
	public String getTool() {
		return this.Tool;
	}

	public void setTool(String tool) {
		this.Tool = tool;
	}
	public String getVersion() {
		return this.Version;
	}

	public void setVersion(String version) {
		this.Version = version;
	}
	public String getClientIPAddress() {
		return this.ClientIPAddress;
	}

	public void setClientIPAddress(String clientipaddress) {
		this.ClientIPAddress = clientipaddress;
	}
	public Boolean getIsAuthenticated() {
		return this.IsAuthenticated;
	}

	public void setIsAuthenticated(Boolean isauthenticated) {
		this.IsAuthenticated = isauthenticated;
	}
	public String getName() {
		return this.Name;
	}

	public void setName(String name) {
		this.Name = name;
	}
	public SFDeviceUser getDeviceUser() {
		return this.DeviceUser;
	}

	public void setDeviceUser(SFDeviceUser deviceuser) {
		this.DeviceUser = deviceuser;
	}

}