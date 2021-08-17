package com.crm.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.services.OpportunityService;
import com.crm.validators.CreateOpportunityValidation;

public class OppWithoutCloseDate {
	
	LoginService loginService = null;
	HomeService homeService = null;
	OpportunityService opportunityService = null;
	CreateOpportunityValidation opportunityValidation = null;

	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;

	@BeforeClass
	public void init() {

		loginService = new LoginService();
		homeService = new HomeService();
		opportunityService = new OpportunityService();
		opportunityValidation = new CreateOpportunityValidation();

		crmLoginData = CrmTestData.getTestData();
		appData = crmLoginData.getCrmlogindata();

		InitializeViews.init();

		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication(appData.get(0).getUsername(), appData.get(0).getPassword());
	}

	@Test(description = "it creates opportunity without name", priority = 0)
	public void createOpportunityWithValidDetails() throws InterruptedException {

		homeService.clickOnOpportunities();
		opportunityService.clcikOnCreateOpportunity();
		opportunityService.insertOpportunityName(appData.get(0).getOpportunityname());
		opportunityService.enterAmount(appData.get(0).getOpportunityamount());
//		opportunityService.enterDate(appData.get(0).getOpportunitydate()).saveTheDetails();

	}

}
