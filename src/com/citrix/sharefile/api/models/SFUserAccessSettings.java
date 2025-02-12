
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

public class SFUserAccessSettings extends SFODataObject {

	@SerializedName("CanCreateFolders")
	private Boolean CanCreateFolders;
	@SerializedName("CanUseFileBox")
	private Boolean CanUseFileBox;
	@SerializedName("CanManageUsers")
	private Boolean CanManageUsers;
	@SerializedName("CanAdminSharedAddressBook")
	private Boolean CanAdminSharedAddressBook;
	@SerializedName("CanChangePassword")
	private Boolean CanChangePassword;
	@SerializedName("CanManageMySettings")
	private Boolean CanManageMySettings;
	@SerializedName("AddToSharedAddressBook")
	private Boolean AddToSharedAddressBook;
	@SerializedName("CanSelectFolderZone")
	private Boolean CanSelectFolderZone;
	@SerializedName("CreateNetworkShareConnectors")
	private Boolean CreateNetworkShareConnectors;
	@SerializedName("CreateSharePointConnectors")
	private Boolean CreateSharePointConnectors;
	@SerializedName("CanAdminAccountSettings")
	private Boolean CanAdminAccountSettings;
	@SerializedName("CanAdminBranding")
	private Boolean CanAdminBranding;
	@SerializedName("CanAdminFileBoxAccess")
	private Boolean CanAdminFileBoxAccess;
	@SerializedName("CanAdminEmailMessages")
	private Boolean CanAdminEmailMessages;
	@SerializedName("CanAdminManageEmployees")
	private Boolean CanAdminManageEmployees;
	@SerializedName("CanAdminRemoteUploadForms")
	private Boolean CanAdminRemoteUploadForms;
	@SerializedName("CanAdminReporting")
	private Boolean CanAdminReporting;
	@SerializedName("CanAdminCreateSharedGroups")
	private Boolean CanAdminCreateSharedGroups;
	@SerializedName("CanAdminSharedDistGroups")
	private Boolean CanAdminSharedDistGroups;
	@SerializedName("CanAdminViewReceipts")
	private Boolean CanAdminViewReceipts;
	@SerializedName("CanAdminBilling")
	private Boolean CanAdminBilling;
	@SerializedName("CanAdminChangePlan")
	private Boolean CanAdminChangePlan;
	@SerializedName("CanAdminSSO")
	private Boolean CanAdminSSO;
	@SerializedName("CanAdminSuperGroup")
	private Boolean CanAdminSuperGroup;
	@SerializedName("CanAdminDelegate")
	private Boolean CanAdminDelegate;
	@SerializedName("CanAdminZones")
	private Boolean CanAdminZones;
	@SerializedName("CanAdminConnectors")
	private Boolean CanAdminConnectors;
	@SerializedName("CanAdminCanAdministerCustomerAccount")
	private Boolean CanAdminCanAdministerCustomerAccount;
	@SerializedName("CanManageAccountPolicies")
	private Boolean CanManageAccountPolicies;
	@SerializedName("CanUseFileDrops")
	private Boolean CanUseFileDrops;
	@SerializedName("CanManageFileDrops")
	private Boolean CanManageFileDrops;
	@SerializedName("CanManageFolderTemplates")
	private Boolean CanManageFolderTemplates;
	@SerializedName("CanPerformArchivedSearch")
	private Boolean CanPerformArchivedSearch;
	@SerializedName("CanAdminCustomWorkflows")
	private Boolean CanAdminCustomWorkflows;
	@SerializedName("CanSendDocumentsForSignature")
	private Boolean CanSendDocumentsForSignature;
	@SerializedName("CanViewSignatureDocuments")
	private Boolean CanViewSignatureDocuments;
	@SerializedName("CanManageSignatureTemplates")
	private Boolean CanManageSignatureTemplates;

		/**
		* Create root-level folders
		*/
	public Boolean getCanCreateFolders() {
		return this.CanCreateFolders;
	}

		/**
		* Create root-level folders
		*/
	public void setCanCreateFolders(Boolean cancreatefolders) {
		this.CanCreateFolders = cancreatefolders;
	}
		/**
		* Use Personal File Box
		*/
	public Boolean getCanUseFileBox() {
		return this.CanUseFileBox;
	}

		/**
		* Use Personal File Box
		*/
	public void setCanUseFileBox(Boolean canusefilebox) {
		this.CanUseFileBox = canusefilebox;
	}
		/**
		* Manage Client Users
		*/
	public Boolean getCanManageUsers() {
		return this.CanManageUsers;
	}

		/**
		* Manage Client Users
		*/
	public void setCanManageUsers(Boolean canmanageusers) {
		this.CanManageUsers = canmanageusers;
	}
		/**
		* Edit the shared address book
		*/
	public Boolean getCanAdminSharedAddressBook() {
		return this.CanAdminSharedAddressBook;
	}

		/**
		* Edit the shared address book
		*/
	public void setCanAdminSharedAddressBook(Boolean canadminsharedaddressbook) {
		this.CanAdminSharedAddressBook = canadminsharedaddressbook;
	}
		/**
		* Change his/her password
		*/
	public Boolean getCanChangePassword() {
		return this.CanChangePassword;
	}

		/**
		* Change his/her password
		*/
	public void setCanChangePassword(Boolean canchangepassword) {
		this.CanChangePassword = canchangepassword;
	}
		/**
		* See the ‘My settings’ link on the top navigation bar
		*/
	public Boolean getCanManageMySettings() {
		return this.CanManageMySettings;
	}

		/**
		* See the ‘My settings’ link on the top navigation bar
		*/
	public void setCanManageMySettings(Boolean canmanagemysettings) {
		this.CanManageMySettings = canmanagemysettings;
	}
		/**
		* Whether or not a user created with this policy assigned should be added to shared company address book
		*/
	public Boolean getAddToSharedAddressBook() {
		return this.AddToSharedAddressBook;
	}

		/**
		* Whether or not a user created with this policy assigned should be added to shared company address book
		*/
	public void setAddToSharedAddressBook(Boolean addtosharedaddressbook) {
		this.AddToSharedAddressBook = addtosharedaddressbook;
	}
		/**
		* Select storage zone for root-level folders
		*/
	public Boolean getCanSelectFolderZone() {
		return this.CanSelectFolderZone;
	}

		/**
		* Select storage zone for root-level folders
		*/
	public void setCanSelectFolderZone(Boolean canselectfolderzone) {
		this.CanSelectFolderZone = canselectfolderzone;
	}
		/**
		* Create Network Share Connectors
		*/
	public Boolean getCreateNetworkShareConnectors() {
		return this.CreateNetworkShareConnectors;
	}

		/**
		* Create Network Share Connectors
		*/
	public void setCreateNetworkShareConnectors(Boolean createnetworkshareconnectors) {
		this.CreateNetworkShareConnectors = createnetworkshareconnectors;
	}
		/**
		* Create SharePoint Connectors
		*/
	public Boolean getCreateSharePointConnectors() {
		return this.CreateSharePointConnectors;
	}

		/**
		* Create SharePoint Connectors
		*/
	public void setCreateSharePointConnectors(Boolean createsharepointconnectors) {
		this.CreateSharePointConnectors = createsharepointconnectors;
	}
		/**
		* Modify account-wide Settings
		*/
	public Boolean getCanAdminAccountSettings() {
		return this.CanAdminAccountSettings;
	}

		/**
		* Modify account-wide Settings
		*/
	public void setCanAdminAccountSettings(Boolean canadminaccountsettings) {
		this.CanAdminAccountSettings = canadminaccountsettings;
	}
		/**
		* Edit Account Appearance
		*/
	public Boolean getCanAdminBranding() {
		return this.CanAdminBranding;
	}

		/**
		* Edit Account Appearance
		*/
	public void setCanAdminBranding(Boolean canadminbranding) {
		this.CanAdminBranding = canadminbranding;
	}
		/**
		* Access other users' File Boxes and Sent Items
		*/
	public Boolean getCanAdminFileBoxAccess() {
		return this.CanAdminFileBoxAccess;
	}

		/**
		* Access other users' File Boxes and Sent Items
		*/
	public void setCanAdminFileBoxAccess(Boolean canadminfileboxaccess) {
		this.CanAdminFileBoxAccess = canadminfileboxaccess;
	}
		/**
		* View all emails
		*/
	public Boolean getCanAdminEmailMessages() {
		return this.CanAdminEmailMessages;
	}

		/**
		* View all emails
		*/
	public void setCanAdminEmailMessages(Boolean canadminemailmessages) {
		this.CanAdminEmailMessages = canadminemailmessages;
	}
		/**
		* Manage employee users
		*/
	public Boolean getCanAdminManageEmployees() {
		return this.CanAdminManageEmployees;
	}

		/**
		* Manage employee users
		*/
	public void setCanAdminManageEmployees(Boolean canadminmanageemployees) {
		this.CanAdminManageEmployees = canadminmanageemployees;
	}
		/**
		* Manage remote upload forms
		*/
	public Boolean getCanAdminRemoteUploadForms() {
		return this.CanAdminRemoteUploadForms;
	}

		/**
		* Manage remote upload forms
		*/
	public void setCanAdminRemoteUploadForms(Boolean canadminremoteuploadforms) {
		this.CanAdminRemoteUploadForms = canadminremoteuploadforms;
	}
		/**
		* Access account-wide reporting
		*/
	public Boolean getCanAdminReporting() {
		return this.CanAdminReporting;
	}

		/**
		* Access account-wide reporting
		*/
	public void setCanAdminReporting(Boolean canadminreporting) {
		this.CanAdminReporting = canadminreporting;
	}
		/**
		* Create shared distribution groups
		*/
	public Boolean getCanAdminCreateSharedGroups() {
		return this.CanAdminCreateSharedGroups;
	}

		/**
		* Create shared distribution groups
		*/
	public void setCanAdminCreateSharedGroups(Boolean canadmincreatesharedgroups) {
		this.CanAdminCreateSharedGroups = canadmincreatesharedgroups;
	}
		/**
		* Edit shared distribution groups
		*/
	public Boolean getCanAdminSharedDistGroups() {
		return this.CanAdminSharedDistGroups;
	}

		/**
		* Edit shared distribution groups
		*/
	public void setCanAdminSharedDistGroups(Boolean canadminshareddistgroups) {
		this.CanAdminSharedDistGroups = canadminshareddistgroups;
	}
		/**
		* View receipts/invoices
		*/
	public Boolean getCanAdminViewReceipts() {
		return this.CanAdminViewReceipts;
	}

		/**
		* View receipts/invoices
		*/
	public void setCanAdminViewReceipts(Boolean canadminviewreceipts) {
		this.CanAdminViewReceipts = canadminviewreceipts;
	}
		/**
		* Edit billing information
		*/
	public Boolean getCanAdminBilling() {
		return this.CanAdminBilling;
	}

		/**
		* Edit billing information
		*/
	public void setCanAdminBilling(Boolean canadminbilling) {
		this.CanAdminBilling = canadminbilling;
	}
		/**
		* Request plan changes
		*/
	public Boolean getCanAdminChangePlan() {
		return this.CanAdminChangePlan;
	}

		/**
		* Request plan changes
		*/
	public void setCanAdminChangePlan(Boolean canadminchangeplan) {
		this.CanAdminChangePlan = canadminchangeplan;
	}
		/**
		* Configure single sign-on settings
		*/
	public Boolean getCanAdminSSO() {
		return this.CanAdminSSO;
	}

		/**
		* Configure single sign-on settings
		*/
	public void setCanAdminSSO(Boolean canadminsso) {
		this.CanAdminSSO = canadminsso;
	}
		/**
		* Manage Super User Group membership
		*/
	public Boolean getCanAdminSuperGroup() {
		return this.CanAdminSuperGroup;
	}

		/**
		* Manage Super User Group membership
		*/
	public void setCanAdminSuperGroup(Boolean canadminsupergroup) {
		this.CanAdminSuperGroup = canadminsupergroup;
	}
		/**
		* Delegate admin privileges to other employee users
		*/
	public Boolean getCanAdminDelegate() {
		return this.CanAdminDelegate;
	}

		/**
		* Delegate admin privileges to other employee users
		*/
	public void setCanAdminDelegate(Boolean canadmindelegate) {
		this.CanAdminDelegate = canadmindelegate;
	}
		/**
		* Create and manage Zones
		*/
	public Boolean getCanAdminZones() {
		return this.CanAdminZones;
	}

		/**
		* Create and manage Zones
		*/
	public void setCanAdminZones(Boolean canadminzones) {
		this.CanAdminZones = canadminzones;
	}
		/**
		* Create and manage Connectors
		*/
	public Boolean getCanAdminConnectors() {
		return this.CanAdminConnectors;
	}

		/**
		* Create and manage Connectors
		*/
	public void setCanAdminConnectors(Boolean canadminconnectors) {
		this.CanAdminConnectors = canadminconnectors;
	}
		/**
		* Manage Tenants
		*/
	public Boolean getCanAdminCanAdministerCustomerAccount() {
		return this.CanAdminCanAdministerCustomerAccount;
	}

		/**
		* Manage Tenants
		*/
	public void setCanAdminCanAdministerCustomerAccount(Boolean canadmincanadministercustomeraccount) {
		this.CanAdminCanAdministerCustomerAccount = canadmincanadministercustomeraccount;
	}
		/**
		* Create and manage account policies
		*/
	public Boolean getCanManageAccountPolicies() {
		return this.CanManageAccountPolicies;
	}

		/**
		* Create and manage account policies
		*/
	public void setCanManageAccountPolicies(Boolean canmanageaccountpolicies) {
		this.CanManageAccountPolicies = canmanageaccountpolicies;
	}
		/**
		* Can be added to file drops (drop box)
		*/
	public Boolean getCanUseFileDrops() {
		return this.CanUseFileDrops;
	}

		/**
		* Can be added to file drops (drop box)
		*/
	public void setCanUseFileDrops(Boolean canusefiledrops) {
		this.CanUseFileDrops = canusefiledrops;
	}
		/**
		* Create and manage file drops (drop box)
		*/
	public Boolean getCanManageFileDrops() {
		return this.CanManageFileDrops;
	}

		/**
		* Create and manage file drops (drop box)
		*/
	public void setCanManageFileDrops(Boolean canmanagefiledrops) {
		this.CanManageFileDrops = canmanagefiledrops;
	}
		/**
		* Create and manage folder templates
		*/
	public Boolean getCanManageFolderTemplates() {
		return this.CanManageFolderTemplates;
	}

		/**
		* Create and manage folder templates
		*/
	public void setCanManageFolderTemplates(Boolean canmanagefoldertemplates) {
		this.CanManageFolderTemplates = canmanagefoldertemplates;
	}
		/**
		* Perform archived search
		*/
	public Boolean getCanPerformArchivedSearch() {
		return this.CanPerformArchivedSearch;
	}

		/**
		* Perform archived search
		*/
	public void setCanPerformArchivedSearch(Boolean canperformarchivedsearch) {
		this.CanPerformArchivedSearch = canperformarchivedsearch;
	}
		/**
		* Create and manage custom workflows
		*/
	public Boolean getCanAdminCustomWorkflows() {
		return this.CanAdminCustomWorkflows;
	}

		/**
		* Create and manage custom workflows
		*/
	public void setCanAdminCustomWorkflows(Boolean canadmincustomworkflows) {
		this.CanAdminCustomWorkflows = canadmincustomworkflows;
	}
		/**
		* Can send documents for signature in RightSignature
		*/
	public Boolean getCanSendDocumentsForSignature() {
		return this.CanSendDocumentsForSignature;
	}

		/**
		* Can send documents for signature in RightSignature
		*/
	public void setCanSendDocumentsForSignature(Boolean cansenddocumentsforsignature) {
		this.CanSendDocumentsForSignature = cansenddocumentsforsignature;
	}
		/**
		* Can view all RightSignature documents
		*/
	public Boolean getCanViewSignatureDocuments() {
		return this.CanViewSignatureDocuments;
	}

		/**
		* Can view all RightSignature documents
		*/
	public void setCanViewSignatureDocuments(Boolean canviewsignaturedocuments) {
		this.CanViewSignatureDocuments = canviewsignaturedocuments;
	}
		/**
		* Can manage RightSignature templates
		*/
	public Boolean getCanManageSignatureTemplates() {
		return this.CanManageSignatureTemplates;
	}

		/**
		* Can manage RightSignature templates
		*/
	public void setCanManageSignatureTemplates(Boolean canmanagesignaturetemplates) {
		this.CanManageSignatureTemplates = canmanagesignaturetemplates;
	}

}