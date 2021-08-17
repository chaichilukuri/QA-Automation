package com.crm.validators;

import java.util.List;

import org.testng.Assert;

import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.OpportunityService;

public class CreateOpportunityValidation {
	
	CrmLoginData crmLoginData = CrmTestData.getTestData();
	List<LoginData> appData = crmLoginData.getCrmlogindata();
	
	public void validateOpportunityName(OpportunityService opportunityService) {
		String insertedOpportunityName = "vijay M";
		
		String opportunityName = opportunityService.getCreatedOpportunity();
		
		Assert.assertEquals(insertedOpportunityName, opportunityName);
	}

}
