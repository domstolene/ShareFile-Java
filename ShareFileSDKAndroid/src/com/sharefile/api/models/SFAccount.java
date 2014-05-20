
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

import java.util.Date;
import java.util.Map;

public class SFAccount extends SFODataObject {

	private String CompanyName;
	private SFUser BillingContact;
	private SFUser TechnicalContact;
	private SFUser AccountManager;
	private String PlanName;
	private String PlanTrack;
	private String PlanTrackEnum;
	private String BillingType;
	private String BillingCycle;
	private Double BillingRate;
	private Double BaseBillingRate;
	private Integer BaseBandwidth;
	private Integer BaseDiskSpace;
	private Integer BaseUsers;
	private Integer AdditionalBandwidth;
	private Integer AdditionalDiskSpace;
	private Integer AdditionalUsers;
	private Double AdditionalBandwidthRate;
	private Double AdditionalDiskSpaceRate;
	private Double AdditionalUserRate;
	private Integer UserMax;
	private Integer DiskSpaceMax;
	private Integer BandwidthMax;
	private Boolean HasPowerTools;
	private Boolean HasEncryption;
	private Double PowerToolsRate;
	private Double EncryptionRate;
	private String Address1;
	private String Address2;
	private String City;
	private String State;
	private String Zip;
	private String Country;
	private String Phone;
	private Date LastBillingDate;
	private Date NextBillingDate;
	private Boolean UseAdvancedCustomBranding;
	private String AdvancedCustomBrandingFolderName;
	private Map<String, String> BrandingStyles;
	private String LogoURL;
	private SFItem RootItem;
	private Date CreationDate;
	private Boolean IsFreeTrial;
	private Boolean IsCancelled;
	private Date CancellationDate;
	private SFSSOAccountProvider SSO;
	private SFAccountPreferences Preferences;
	private SFProductDefaults ProductDefaults;
	private String Subdomain;
	private SFMobileSecuritySettings MobileSecuritySettings;
	private SFAccessControlDomains LoginAccessControlDomains;
	private SFAccessControlDomains FolderAccessControlDomains;
	private Integer StorageQuotaPerUser;

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyname) {
		CompanyName = companyname;
	}
	public SFUser getBillingContact() {
		return BillingContact;
	}

	public void setBillingContact(SFUser billingcontact) {
		BillingContact = billingcontact;
	}
	public SFUser getTechnicalContact() {
		return TechnicalContact;
	}

	public void setTechnicalContact(SFUser technicalcontact) {
		TechnicalContact = technicalcontact;
	}
	public SFUser getAccountManager() {
		return AccountManager;
	}

	public void setAccountManager(SFUser accountmanager) {
		AccountManager = accountmanager;
	}
		/**
		* Basic, Professional, Enterprise
		*/
	public String getPlanName() {
		return PlanName;
	}

		/**
		* Basic, Professional, Enterprise
		*/
	public void setPlanName(String planname) {
		PlanName = planname;
	}
	public String getPlanTrack() {
		return PlanTrack;
	}

	public void setPlanTrack(String plantrack) {
		PlanTrack = plantrack;
	}
	public String getPlanTrackEnum() {
		return PlanTrackEnum;
	}

	public void setPlanTrackEnum(String plantrackenum) {
		PlanTrackEnum = plantrackenum;
	}
		/**
		* Credit Card, Invoice, Comp
		*/
	public String getBillingType() {
		return BillingType;
	}

		/**
		* Credit Card, Invoice, Comp
		*/
	public void setBillingType(String billingtype) {
		BillingType = billingtype;
	}
		/**
		* Monthly, Quarterly, Annually
		*/
	public String getBillingCycle() {
		return BillingCycle;
	}

		/**
		* Monthly, Quarterly, Annually
		*/
	public void setBillingCycle(String billingcycle) {
		BillingCycle = billingcycle;
	}
	public Double getBillingRate() {
		return BillingRate;
	}

	public void setBillingRate(Double billingrate) {
		BillingRate = billingrate;
	}
	public Double getBaseBillingRate() {
		return BaseBillingRate;
	}

	public void setBaseBillingRate(Double basebillingrate) {
		BaseBillingRate = basebillingrate;
	}
		/**
		* Bandwidth included in plan in megabytes
		*/
	public Integer getBaseBandwidth() {
		return BaseBandwidth;
	}

		/**
		* Bandwidth included in plan in megabytes
		*/
	public void setBaseBandwidth(Integer basebandwidth) {
		BaseBandwidth = basebandwidth;
	}
		/**
		* Disk space included in megabytes
		*/
	public Integer getBaseDiskSpace() {
		return BaseDiskSpace;
	}

		/**
		* Disk space included in megabytes
		*/
	public void setBaseDiskSpace(Integer basediskspace) {
		BaseDiskSpace = basediskspace;
	}
		/**
		* Users included in plan
		*/
	public Integer getBaseUsers() {
		return BaseUsers;
	}

		/**
		* Users included in plan
		*/
	public void setBaseUsers(Integer baseusers) {
		BaseUsers = baseusers;
	}
		/**
		* Additional bandwidth purchased for account
		*/
	public Integer getAdditionalBandwidth() {
		return AdditionalBandwidth;
	}

		/**
		* Additional bandwidth purchased for account
		*/
	public void setAdditionalBandwidth(Integer additionalbandwidth) {
		AdditionalBandwidth = additionalbandwidth;
	}
		/**
		* Additional disk space purchased for account
		*/
	public Integer getAdditionalDiskSpace() {
		return AdditionalDiskSpace;
	}

		/**
		* Additional disk space purchased for account
		*/
	public void setAdditionalDiskSpace(Integer additionaldiskspace) {
		AdditionalDiskSpace = additionaldiskspace;
	}
		/**
		* Additional users purchased for account
		*/
	public Integer getAdditionalUsers() {
		return AdditionalUsers;
	}

		/**
		* Additional users purchased for account
		*/
	public void setAdditionalUsers(Integer additionalusers) {
		AdditionalUsers = additionalusers;
	}
		/**
		* Additional rate for extra bandwidth. NOTE: This is specified in gigbytes, not megabytes.
		*/
	public Double getAdditionalBandwidthRate() {
		return AdditionalBandwidthRate;
	}

		/**
		* Additional rate for extra bandwidth. NOTE: This is specified in gigbytes, not megabytes.
		*/
	public void setAdditionalBandwidthRate(Double additionalbandwidthrate) {
		AdditionalBandwidthRate = additionalbandwidthrate;
	}
		/**
		* Additional rate for extra diskspace. NOTE: This is specified in gigbytes, not megabytes.
		*/
	public Double getAdditionalDiskSpaceRate() {
		return AdditionalDiskSpaceRate;
	}

		/**
		* Additional rate for extra diskspace. NOTE: This is specified in gigbytes, not megabytes.
		*/
	public void setAdditionalDiskSpaceRate(Double additionaldiskspacerate) {
		AdditionalDiskSpaceRate = additionaldiskspacerate;
	}
		/**
		* Additional rate for extra users
		*/
	public Double getAdditionalUserRate() {
		return AdditionalUserRate;
	}

		/**
		* Additional rate for extra users
		*/
	public void setAdditionalUserRate(Double additionaluserrate) {
		AdditionalUserRate = additionaluserrate;
	}
	public Integer getUserMax() {
		return UserMax;
	}

	public void setUserMax(Integer usermax) {
		UserMax = usermax;
	}
		/**
		* Maximum disk space for the account in megabtyes
		*/
	public Integer getDiskSpaceMax() {
		return DiskSpaceMax;
	}

		/**
		* Maximum disk space for the account in megabtyes
		*/
	public void setDiskSpaceMax(Integer diskspacemax) {
		DiskSpaceMax = diskspacemax;
	}
		/**
		* Maximum bandwidth for the account in megabtyes
		*/
	public Integer getBandwidthMax() {
		return BandwidthMax;
	}

		/**
		* Maximum bandwidth for the account in megabtyes
		*/
	public void setBandwidthMax(Integer bandwidthmax) {
		BandwidthMax = bandwidthmax;
	}
	public Boolean getHasPowerTools() {
		return HasPowerTools;
	}

	public void setHasPowerTools(Boolean haspowertools) {
		HasPowerTools = haspowertools;
	}
	public Boolean getHasEncryption() {
		return HasEncryption;
	}

	public void setHasEncryption(Boolean hasencryption) {
		HasEncryption = hasencryption;
	}
		/**
		* Additional rate for adding PowerTools.
		*/
	public Double getPowerToolsRate() {
		return PowerToolsRate;
	}

		/**
		* Additional rate for adding PowerTools.
		*/
	public void setPowerToolsRate(Double powertoolsrate) {
		PowerToolsRate = powertoolsrate;
	}
		/**
		* Additional rate for stored file encryption
		*/
	public Double getEncryptionRate() {
		return EncryptionRate;
	}

		/**
		* Additional rate for stored file encryption
		*/
	public void setEncryptionRate(Double encryptionrate) {
		EncryptionRate = encryptionrate;
	}
	public String getAddress1() {
		return Address1;
	}

	public void setAddress1(String address1) {
		Address1 = address1;
	}
	public String getAddress2() {
		return Address2;
	}

	public void setAddress2(String address2) {
		Address2 = address2;
	}
	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}
	public String getZip() {
		return Zip;
	}

	public void setZip(String zip) {
		Zip = zip;
	}
	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}
	public Date getLastBillingDate() {
		return LastBillingDate;
	}

	public void setLastBillingDate(Date lastbillingdate) {
		LastBillingDate = lastbillingdate;
	}
	public Date getNextBillingDate() {
		return NextBillingDate;
	}

	public void setNextBillingDate(Date nextbillingdate) {
		NextBillingDate = nextbillingdate;
	}
	public Boolean getUseAdvancedCustomBranding() {
		return UseAdvancedCustomBranding;
	}

	public void setUseAdvancedCustomBranding(Boolean useadvancedcustombranding) {
		UseAdvancedCustomBranding = useadvancedcustombranding;
	}
	public String getAdvancedCustomBrandingFolderName() {
		return AdvancedCustomBrandingFolderName;
	}

	public void setAdvancedCustomBrandingFolderName(String advancedcustombrandingfoldername) {
		AdvancedCustomBrandingFolderName = advancedcustombrandingfoldername;
	}
	public Map<String, String> getBrandingStyles() {
		return BrandingStyles;
	}

	public void setBrandingStyles(Map<String, String> brandingstyles) {
		BrandingStyles = brandingstyles;
	}
	public String getLogoURL() {
		return LogoURL;
	}

	public void setLogoURL(String logourl) {
		LogoURL = logourl;
	}
	public SFItem getRootItem() {
		return RootItem;
	}

	public void setRootItem(SFItem rootitem) {
		RootItem = rootitem;
	}
	public Date getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(Date creationdate) {
		CreationDate = creationdate;
	}
	public Boolean getIsFreeTrial() {
		return IsFreeTrial;
	}

	public void setIsFreeTrial(Boolean isfreetrial) {
		IsFreeTrial = isfreetrial;
	}
	public Boolean getIsCancelled() {
		return IsCancelled;
	}

	public void setIsCancelled(Boolean iscancelled) {
		IsCancelled = iscancelled;
	}
	public Date getCancellationDate() {
		return CancellationDate;
	}

	public void setCancellationDate(Date cancellationdate) {
		CancellationDate = cancellationdate;
	}
	public SFSSOAccountProvider getSSO() {
		return SSO;
	}

	public void setSSO(SFSSOAccountProvider sso) {
		SSO = sso;
	}
	public SFAccountPreferences getPreferences() {
		return Preferences;
	}

	public void setPreferences(SFAccountPreferences preferences) {
		Preferences = preferences;
	}
	public SFProductDefaults getProductDefaults() {
		return ProductDefaults;
	}

	public void setProductDefaults(SFProductDefaults productdefaults) {
		ProductDefaults = productdefaults;
	}
	public String getSubdomain() {
		return Subdomain;
	}

	public void setSubdomain(String subdomain) {
		Subdomain = subdomain;
	}
	public SFMobileSecuritySettings getMobileSecuritySettings() {
		return MobileSecuritySettings;
	}

	public void setMobileSecuritySettings(SFMobileSecuritySettings mobilesecuritysettings) {
		MobileSecuritySettings = mobilesecuritysettings;
	}
	public SFAccessControlDomains getLoginAccessControlDomains() {
		return LoginAccessControlDomains;
	}

	public void setLoginAccessControlDomains(SFAccessControlDomains loginaccesscontroldomains) {
		LoginAccessControlDomains = loginaccesscontroldomains;
	}
	public SFAccessControlDomains getFolderAccessControlDomains() {
		return FolderAccessControlDomains;
	}

	public void setFolderAccessControlDomains(SFAccessControlDomains folderaccesscontroldomains) {
		FolderAccessControlDomains = folderaccesscontroldomains;
	}
	public Integer getStorageQuotaPerUser() {
		return StorageQuotaPerUser;
	}

	public void setStorageQuotaPerUser(Integer storagequotaperuser) {
		StorageQuotaPerUser = storagequotaperuser;
	}
}