
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

public class SFMarketAnalytics extends SFODataObject {

	@SerializedName("ConversionIndex")
	private Double ConversionIndex;
	@SerializedName("ConversionIndex2")
	private Double ConversionIndex2;
	@SerializedName("LtvIndex")
	private Double LtvIndex;
	@SerializedName("PlanValue")
	private Double PlanValue;

	public Double getConversionIndex() {
		return this.ConversionIndex;
	}

	public void setConversionIndex(Double conversionindex) {
		this.ConversionIndex = conversionindex;
	}
	public Double getConversionIndex2() {
		return this.ConversionIndex2;
	}

	public void setConversionIndex2(Double conversionindex2) {
		this.ConversionIndex2 = conversionindex2;
	}
	public Double getLtvIndex() {
		return this.LtvIndex;
	}

	public void setLtvIndex(Double ltvindex) {
		this.LtvIndex = ltvindex;
	}
	public Double getPlanValue() {
		return this.PlanValue;
	}

	public void setPlanValue(Double planvalue) {
		this.PlanValue = planvalue;
	}

}