
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

package com.citrix.sharefile.api.entities.internal;

import com.citrix.sharefile.api.entities.*;
import com.citrix.sharefile.api.interfaces.ISFApiClient;
import com.citrix.sharefile.api.models.*;
import com.citrix.sharefile.api.models.internal.*;
import com.citrix.sharefile.api.SFApiQuery;
import com.citrix.sharefile.api.interfaces.ISFQuery;


import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
 
import com.google.gson.annotations.SerializedName;
import com.citrix.sharefile.api.enumerations.SFSafeEnum;
import com.citrix.sharefile.api.enumerations.SFSafeEnumFlags;

public class SFUsagePlansEntityInternal extends SFODataEntityBase
{
    public SFUsagePlansEntityInternal(ISFApiClient apiClient)
    {
        super(apiClient);
    }

	public ISFQuery<SFUsagePlan> get()
	{
		SFApiQuery<SFUsagePlan> sfApiQuery = new SFApiQuery<SFUsagePlan>(this.apiClient);
		sfApiQuery.setFrom("UsagePlans");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	public ISFQuery<SFODataFeed<SFUsagePlan>> getPlanNamesByPlanTrack(String planTrack)
	{
		SFApiQuery<SFODataFeed<SFUsagePlan>> sfApiQuery = new SFApiQuery<SFODataFeed<SFUsagePlan>>(this.apiClient);
		sfApiQuery.setFrom("UsagePlans");
		sfApiQuery.setAction("PlanNamesByPlanTrack");
		sfApiQuery.addQueryString("planTrack", planTrack);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	public ISFQuery<SFUsagePlan> update(SFUsagePlan plan)
	{
		SFApiQuery<SFUsagePlan> sfApiQuery = new SFApiQuery<SFUsagePlan>(this.apiClient);
		sfApiQuery.setFrom("UsagePlans");
		sfApiQuery.setBody(plan);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

	public ISFQuery<SFUsagePlan> calculateUsagePlanValues(SFUsagePlan plan)
	{
		SFApiQuery<SFUsagePlan> sfApiQuery = new SFApiQuery<SFUsagePlan>(this.apiClient);
		sfApiQuery.setFrom("UsagePlans");
		sfApiQuery.setAction("CalculateUsagePlanValues");
		sfApiQuery.setBody(plan);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

}
