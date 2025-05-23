
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

public class SFEncryptedEmailParams extends SFODataObject {

	@SerializedName("Subject")
	private String Subject;
	@SerializedName("ExpirationDays")
	private Integer ExpirationDays;
	@SerializedName("NotifyOnUse")
	private Boolean NotifyOnUse;
	@SerializedName("SendSeparateActivation")
	private Boolean SendSeparateActivation;

	public String getSubject() {
		return this.Subject;
	}

	public void setSubject(String subject) {
		this.Subject = subject;
	}
	public Integer getExpirationDays() {
		return this.ExpirationDays;
	}

	public void setExpirationDays(Integer expirationdays) {
		this.ExpirationDays = expirationdays;
	}
	public Boolean getNotifyOnUse() {
		return this.NotifyOnUse;
	}

	public void setNotifyOnUse(Boolean notifyonuse) {
		this.NotifyOnUse = notifyonuse;
	}
		/**
		* Set to false if will be sent via API/&gt;
		*/
	public Boolean getSendSeparateActivation() {
		return this.SendSeparateActivation;
	}

		/**
		* Set to false if will be sent via API/&gt;
		*/
	public void setSendSeparateActivation(Boolean sendseparateactivation) {
		this.SendSeparateActivation = sendseparateactivation;
	}

}