
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

public class SFAppliedPlanAddOns extends SFODataObject {

	@SerializedName("AdditionalBandwidthGB")
	private Integer AdditionalBandwidthGB;
	@SerializedName("AdditionalStorageGB")
	private Integer AdditionalStorageGB;
	@SerializedName("AdditionalEmployees")
	private Integer AdditionalEmployees;

	public Integer getAdditionalBandwidthGB() {
		return this.AdditionalBandwidthGB;
	}

	public void setAdditionalBandwidthGB(Integer additionalbandwidthgb) {
		this.AdditionalBandwidthGB = additionalbandwidthgb;
	}
	public Integer getAdditionalStorageGB() {
		return this.AdditionalStorageGB;
	}

	public void setAdditionalStorageGB(Integer additionalstoragegb) {
		this.AdditionalStorageGB = additionalstoragegb;
	}
	public Integer getAdditionalEmployees() {
		return this.AdditionalEmployees;
	}

	public void setAdditionalEmployees(Integer additionalemployees) {
		this.AdditionalEmployees = additionalemployees;
	}

}