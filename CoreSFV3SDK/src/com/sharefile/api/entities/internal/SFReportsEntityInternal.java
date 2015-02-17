
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2015 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.sharefile.api.entities.internal;

import com.sharefile.api.entities.*;
import com.sharefile.api.models.*;
import com.sharefile.api.models.internal.*;
import com.sharefile.api.SFApiQuery;
import com.sharefile.api.interfaces.ISFQuery;


import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
 
import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.enumerations.SFSafeEnumFlags;

public class SFReportsEntityInternal extends SFODataEntityBase
{
    /**
	* Get Reports for Current Account
	* Returns all reports for the current account.
	* @return Reports for current account
    */
	public ISFQuery<SFODataFeed<SFReport>> get()
	{
		SFApiQuery<SFODataFeed<SFReport>> sfApiQuery = new SFApiQuery<SFODataFeed<SFReport>>();
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get Report by ID
	* Returns a single report.
	* @param url 	
	* @return Single Report
    */
	public ISFQuery<SFReport> get(URI url)
	{
		SFApiQuery<SFReport> sfApiQuery = new SFApiQuery<SFReport>();
		sfApiQuery.setFrom("Reports");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get recent reports
	* Returns the last 10 reports run
	* @return List of reports
    */
	public ISFQuery<SFODataFeed<SFReport>> getRecent()
	{
		SFApiQuery<SFODataFeed<SFReport>> sfApiQuery = new SFApiQuery<SFODataFeed<SFReport>>();
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setAction("Recent");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get recurring reports
	* Returns all recurring reports
	* @return List of reports
    */
	public ISFQuery<SFODataFeed<SFReport>> getRecurring()
	{
		SFApiQuery<SFODataFeed<SFReport>> sfApiQuery = new SFApiQuery<SFODataFeed<SFReport>>();
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setAction("Recurring");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get Report Record by ID
	* Returns a single record.
	* @param id 	
	* @return Single Record
    */
	public ISFQuery<SFReportRecord> getRecord(String id)
	{
		SFApiQuery<SFReportRecord> sfApiQuery = new SFApiQuery<SFReportRecord>();
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setAction("Record");
		sfApiQuery.addActionIds(id);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get all Records by Report ID
	* Returns all records for a report.
	* @param url 	
	* @return Records for a Report
    */
	public ISFQuery<SFODataFeed<SFReportRecord>> getRecords(URI url)
	{
		SFApiQuery<SFODataFeed<SFReportRecord>> sfApiQuery = new SFApiQuery<SFODataFeed<SFReportRecord>>();
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setAction("Records");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Create Report
    * {
    * "Id": "rs24f83e-b147-437e-9f28-e7d03634af42"
    * "Title": "Usage Report",
    * "ReportType": "Activity",
    * "ObjectType": "Account",
    * "ObjectId": "a024f83e-b147-437e-9f28-e7d0ef634af42",
    * "DateOption": "Last30Days",
    * "SaveFormat": "Excel"
    * }
	* Creates a new report.
	* @param report 	
	* @param runOnCreate 	
	* @return the created report
    */
	public ISFQuery<SFReport> create(SFReport report, Boolean runOnCreate)
	{
		SFApiQuery<SFReport> sfApiQuery = new SFApiQuery<SFReport>();
		sfApiQuery.setFrom("Reports");
		sfApiQuery.addQueryString("runOnCreate", runOnCreate);
		sfApiQuery.setBody(report);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Update Report
    * {
    * "Title": "Usage Report",
    * "ReportType": "Activity",
    * "ObjectType": "Account",
    * "ObjectId": "a024f83e-b147-437e-9f28-e7d03634af42",
    * "DateOption": "Last30Days",
    * "Frequency": "Once"
    * }
	* Updates an existing report
	* @param report 	
	* @return the updated report
    */
	public ISFQuery<SFReport> update(SFReport report)
	{
		SFApiQuery<SFReport> sfApiQuery = new SFApiQuery<SFReport>();
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setBody(report);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

    /**
	* Delete Report
	* Removes a report
	* @param url 	
    */
	public ISFQuery delete(URI url)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Reports");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

    /**
	* Run Report
	* Run a report and get the run id.
	* @return ReportRecord
    */
	public ISFQuery<SFReportRecord> getRun(URI url)
	{
		SFApiQuery<SFReportRecord> sfApiQuery = new SFApiQuery<SFReportRecord>();
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setAction("Run");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get JSON Data
	* Get the JSON data for a report
	* @param id 	
	* @return JSON Formatted Report Results
    */
	public ISFQuery getJsonData(String id)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setAction("Records");
		sfApiQuery.addActionIds(id);
		sfApiQuery.addSubAction("JsonData");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Save a folder to a folder location
	* @param reportUrl 	
	* @param folderId 	
    */
	public ISFQuery move(URI reportUrl, String folderId)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setAction("Move");
		sfApiQuery.addIds(reportUrl);
		sfApiQuery.addQueryString("folderId", folderId);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Get Excel Data
	* Get the Excel data for a report
	* @param id 	
	* @return Excel Formatted Report Results
    */
	public ISFQuery getExcelData(String id)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("Reports");
		sfApiQuery.setAction("Records");
		sfApiQuery.addActionIds(id);
		sfApiQuery.addSubAction("ExcelData");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

}

