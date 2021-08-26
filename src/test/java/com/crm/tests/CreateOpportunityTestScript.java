package com.crm.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.services.OpportunityService;
import com.crm.util.BaseListener;
import com.crm.validators.CreateOpportunityValidation;

public class CreateOpportunityTestScript extends BaseListener {
	
	LoginService loginService = null;
	HomeService homeService = null;
	OpportunityService opportunityService = null;
	CreateOpportunityValidation opportunityValidation = null;
	
	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;
	
	static ExtentTest elogger;
	static ExtentReports extent = new ExtentReports();
	
	@BeforeClass
	public void init() {
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("Reports//crm-test-result.html");

		extent.setSystemInfo("OS Name", "Windows");
		extent.setSystemInfo("Enviroment", "QA");
		reporter.config().setDocumentTitle("Crm automation test report for QA enviroment");
		extent.attachReporter(reporter);
		elogger = extent.createTest("Crm automation test cases");
	
		loginService = new LoginService();
		homeService = new HomeService();
		opportunityService = new OpportunityService();
		opportunityValidation = new CreateOpportunityValidation();
		
		crmLoginData = CrmTestData.getTestData();
		appData = crmLoginData.getCrmlogindata();
		
		InitializeViews.init();
		
		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication(appData.get(0).getUsername(), appData.get(0).getPassword());
		test = extent.createTest("Functional Test Cases");
	}
		
		@Test(description = "it creates opportunity with valid details", priority=0)
		public void createOpportunityWithValidDetails() throws InterruptedException {
			
			
			homeService.clickOnOpportunities();
			opportunityService.clcikOnCreateOpportunity();
			opportunityService.insertOpportunityName(appData.get(0).getOpportunityname());
		opportunityService.enterAmount(appData.get(0).getOpportunityamount());
			opportunityService.enterDate(appData.get(0).getOpportunitydate()).saveTheDetails();
			
		}
		
	@Test(description = "Test Case to edit and opportunity", priority=1)
		public void editOpportunityWithValidDetails() throws InterruptedException {
		
			opportunityService.editTheDetails();
			opportunityService.editNameInSelectedOpportunity(appData.get(0).getEditopportunityname());
			opportunityService.editAmountInSelectedOpportunity(appData.get(0).getEditopportunityamount());
			opportunityService.editProbabilityInSelectedOpportunity(appData.get(0).getEditopportunityprobability()).saveTheDetails();
			
			
		}
		
		@Test(description = "Test case to validate opportunity", priority=2)
		
		public void validateOpportunityDetails() throws InterruptedException {
			homeService.clickOnOpportunities();
			opportunityValidation.validateOpportunityName(opportunityService);
		}
		
		@Test(description = "Test Case to delete opportunity", priority=3)
		
		public void deleteOpportunity() {
			
			opportunityService.clickOnSelectedOpportunityCheckBox().actionsDropDrown();
			
			
		}

}
