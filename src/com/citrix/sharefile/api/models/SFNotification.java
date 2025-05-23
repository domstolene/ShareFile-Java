
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

public class SFNotification extends SFODataObject {

	@SerializedName("NotificationType")
	private String NotificationType;
	@SerializedName("EventID")
	private String EventID;
	@SerializedName("SenderID")
	private String SenderID;
	@SerializedName("RecipientID")
	private String RecipientID;
	@SerializedName("FromName")
	private String FromName;
	@SerializedName("FromEmail")
	private String FromEmail;
	@SerializedName("ReplyTo")
	private String ReplyTo;
	@SerializedName("To")
	private String To;
	@SerializedName("CC")
	private String CC;
	@SerializedName("BCC")
	private String BCC;
	@SerializedName("Subject")
	private String Subject;
	@SerializedName("Message")
	private String Message;
	@SerializedName("PlainTextMessage")
	private String PlainTextMessage;
	@SerializedName("DateSent")
	private Date DateSent;
	@SerializedName("Status")
	private String Status;
	@SerializedName("IsImportant")
	private Boolean IsImportant;
	@SerializedName("ReadReceipt")
	private Boolean ReadReceipt;
	@SerializedName("AttachmentPaths")
	private ArrayList<String> AttachmentPaths;
	@SerializedName("ForceEmailFromShareFile")
	private Boolean ForceEmailFromShareFile;
	@SerializedName("MergeNames")
	private ArrayList<String> MergeNames;
	@SerializedName("MergeValues")
	private ArrayList<Object> MergeValues;
	@SerializedName("RecordSend")
	private Boolean RecordSend;
	@SerializedName("IsModelBased")
	private Boolean IsModelBased;

	public String getNotificationType() {
		return this.NotificationType;
	}

	public void setNotificationType(String notificationtype) {
		this.NotificationType = notificationtype;
	}
	public String getEventID() {
		return this.EventID;
	}

	public void setEventID(String eventid) {
		this.EventID = eventid;
	}
	public String getSenderID() {
		return this.SenderID;
	}

	public void setSenderID(String senderid) {
		this.SenderID = senderid;
	}
	public String getRecipientID() {
		return this.RecipientID;
	}

	public void setRecipientID(String recipientid) {
		this.RecipientID = recipientid;
	}
	public String getFromName() {
		return this.FromName;
	}

	public void setFromName(String fromname) {
		this.FromName = fromname;
	}
	public String getFromEmail() {
		return this.FromEmail;
	}

	public void setFromEmail(String fromemail) {
		this.FromEmail = fromemail;
	}
	public String getReplyTo() {
		return this.ReplyTo;
	}

	public void setReplyTo(String replyto) {
		this.ReplyTo = replyto;
	}
	public String getTo() {
		return this.To;
	}

	public void setTo(String to) {
		this.To = to;
	}
	public String getCC() {
		return this.CC;
	}

	public void setCC(String cc) {
		this.CC = cc;
	}
	public String getBCC() {
		return this.BCC;
	}

	public void setBCC(String bcc) {
		this.BCC = bcc;
	}
	public String getSubject() {
		return this.Subject;
	}

	public void setSubject(String subject) {
		this.Subject = subject;
	}
	public String getMessage() {
		return this.Message;
	}

	public void setMessage(String message) {
		this.Message = message;
	}
	public String getPlainTextMessage() {
		return this.PlainTextMessage;
	}

	public void setPlainTextMessage(String plaintextmessage) {
		this.PlainTextMessage = plaintextmessage;
	}
	public Date getDateSent() {
		return this.DateSent;
	}

	public void setDateSent(Date datesent) {
		this.DateSent = datesent;
	}
	public String getStatus() {
		return this.Status;
	}

	public void setStatus(String status) {
		this.Status = status;
	}
	public Boolean getIsImportant() {
		return this.IsImportant;
	}

	public void setIsImportant(Boolean isimportant) {
		this.IsImportant = isimportant;
	}
	public Boolean getReadReceipt() {
		return this.ReadReceipt;
	}

	public void setReadReceipt(Boolean readreceipt) {
		this.ReadReceipt = readreceipt;
	}
	public ArrayList<String> getAttachmentPaths() {
		return this.AttachmentPaths;
	}

	public void setAttachmentPaths(ArrayList<String> attachmentpaths) {
		this.AttachmentPaths = attachmentpaths;
	}
	public Boolean getForceEmailFromShareFile() {
		return this.ForceEmailFromShareFile;
	}

	public void setForceEmailFromShareFile(Boolean forceemailfromsharefile) {
		this.ForceEmailFromShareFile = forceemailfromsharefile;
	}
	public ArrayList<String> getMergeNames() {
		return this.MergeNames;
	}

	public void setMergeNames(ArrayList<String> mergenames) {
		this.MergeNames = mergenames;
	}
	public ArrayList<Object> getMergeValues() {
		return this.MergeValues;
	}

	public void setMergeValues(ArrayList<Object> mergevalues) {
		this.MergeValues = mergevalues;
	}
	public Boolean getRecordSend() {
		return this.RecordSend;
	}

	public void setRecordSend(Boolean recordsend) {
		this.RecordSend = recordsend;
	}
	public Boolean getIsModelBased() {
		return this.IsModelBased;
	}

	public void setIsModelBased(Boolean ismodelbased) {
		this.IsModelBased = ismodelbased;
	}

}