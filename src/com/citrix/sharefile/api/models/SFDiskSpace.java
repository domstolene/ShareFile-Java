
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

public class SFDiskSpace extends SFODataObject {

	@SerializedName("Max")
	private Integer Max;
	@SerializedName("Used")
	private Integer Used;
	@SerializedName("Free")
	private Integer Free;

		/**
		* Max space allowed
		*/
	public Integer getMax() {
		return this.Max;
	}

		/**
		* Max space allowed
		*/
	public void setMax(Integer max) {
		this.Max = max;
	}
		/**
		* Current space used
		*/
	public Integer getUsed() {
		return this.Used;
	}

		/**
		* Current space used
		*/
	public void setUsed(Integer used) {
		this.Used = used;
	}
		/**
		* Current space free
		*/
	public Integer getFree() {
		return this.Free;
	}

		/**
		* Current space free
		*/
	public void setFree(Integer free) {
		this.Free = free;
	}

}