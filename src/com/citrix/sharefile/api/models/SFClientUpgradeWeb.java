
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

public class SFClientUpgradeWeb extends SFODataObject {

	@SerializedName("ClientUpgradeLink")
	private String ClientUpgradeLink;
	@SerializedName("ClientUpgradeText")
	private String ClientUpgradeText;

	public String getClientUpgradeLink() {
		return this.ClientUpgradeLink;
	}

	public void setClientUpgradeLink(String clientupgradelink) {
		this.ClientUpgradeLink = clientupgradelink;
	}
	public String getClientUpgradeText() {
		return this.ClientUpgradeText;
	}

	public void setClientUpgradeText(String clientupgradetext) {
		this.ClientUpgradeText = clientupgradetext;
	}

}