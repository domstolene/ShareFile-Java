
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

public class SFOutlookInformationOptionString extends SFODataObject {

	@SerializedName("Locked")
	private Boolean Locked;
	@SerializedName("Value")
	private String Value;

	public Boolean getLocked() {
		return this.Locked;
	}

	public void setLocked(Boolean locked) {
		this.Locked = locked;
	}
	public String getValue() {
		return this.Value;
	}

	public void setValue(String value) {
		this.Value = value;
	}

}