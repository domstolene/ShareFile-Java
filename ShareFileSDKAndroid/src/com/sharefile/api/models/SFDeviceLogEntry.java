
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2014 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.sharefile.api.models;

public class SFDeviceLogEntry extends SFODataObject {

	private String FileName;
	private String FileID;
	private Long Timestamp;
	private String AccountID;
	private String UserID;
	private SFDeviceLogEntryAction Action;
	private String AdditionalInfo;

		/**
		* File name
		*/
	public String getFileName() {
		return FileName;
	}

		/**
		* File name
		*/
	public void setFileName(String filename) {
		FileName = filename;
	}
	public String getFileID() {
		return FileID;
	}

	public void setFileID(String fileid) {
		FileID = fileid;
	}
	public Long getTimestamp() {
		return Timestamp;
	}

	public void setTimestamp(Long timestamp) {
		Timestamp = timestamp;
	}
	public String getAccountID() {
		return AccountID;
	}

	public void setAccountID(String accountid) {
		AccountID = accountid;
	}
	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userid) {
		UserID = userid;
	}
	public SFDeviceLogEntryAction getAction() {
		return Action;
	}

	public void setAction(SFDeviceLogEntryAction action) {
		Action = action;
	}
	public String getAdditionalInfo() {
		return AdditionalInfo;
	}

	public void setAdditionalInfo(String additionalinfo) {
		AdditionalInfo = additionalinfo;
	}
}