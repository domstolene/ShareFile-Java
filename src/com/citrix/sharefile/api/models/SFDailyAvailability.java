
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

public class SFDailyAvailability extends SFODataObject {

	@SerializedName("Days")
	private String Days;
	@SerializedName("StartHour")
	private Integer StartHour;
	@SerializedName("StartMin")
	private Integer StartMin;
	@SerializedName("EndHour")
	private Integer EndHour;
	@SerializedName("EndMin")
	private Integer EndMin;

	public String getDays() {
		return this.Days;
	}

	public void setDays(String days) {
		this.Days = days;
	}
	public Integer getStartHour() {
		return this.StartHour;
	}

	public void setStartHour(Integer starthour) {
		this.StartHour = starthour;
	}
	public Integer getStartMin() {
		return this.StartMin;
	}

	public void setStartMin(Integer startmin) {
		this.StartMin = startmin;
	}
	public Integer getEndHour() {
		return this.EndHour;
	}

	public void setEndHour(Integer endhour) {
		this.EndHour = endhour;
	}
	public Integer getEndMin() {
		return this.EndMin;
	}

	public void setEndMin(Integer endmin) {
		this.EndMin = endmin;
	}

}