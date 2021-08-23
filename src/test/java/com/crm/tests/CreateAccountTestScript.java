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
import com.crm.services.AccountService;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.util.BaseListener;
import com.crm.validators.CreateAccountValidation;

public class CreateAccountTestScript extends BaseListener {

	LoginService loginService = null;
	HomeService homeService = null;
	AccountService accountService = null;
	CreateAccountValidation accountValidation = null;

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
		accountService = new AccountService();
		accountValidation = new CreateAccountValidation();

		crmLoginData = CrmTestData.getTestData();
		appData = crmLoginData.getCrmlogindata();

		InitializeViews.init();

		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication(appData.get(0).getUsername(), appData.get(0).getPassword());
		test = extent.createTest("Functional Test Cases");

	}

	/*@AfterClass
	public void tearDown() {
		BrowserDriver.getCurrentDriver().quit();
		extent.flush();
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			elogger.log(Status.FAIL, MarkupHelper
					.createLabel(result.getName() + "Test case FAILED due to below issues:", ExtentColor.RED));
			elogger.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			elogger.log(Status.PASS,
					MarkupHelper.createLabel(result.getName() + "Test Case PASSED", ExtentColor.GREEN));
		} else {
			elogger.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + "Test Case SKIPPED", ExtentColor.ORANGE));
			elogger.skip(result.getThrowable());
		}
	}*/

	@Test(description = "it Creates account with valid details", priority = 0)
	public void createAccountWithBillingAddress() throws IllegalArgumentException, InterruptedException {

		homeService.clickOnAccounts();
		accountService.clickOnCreateAccount();
		accountService.insertAccountName();
		accountService.insertAccountEmail(appData.get(0).getEmail());
		accountService.insertAccountWebSite(appData.get(0).getWebsite());
		accountService.insertAccountPhoneNumber(appData.get(0).getPhonenumber());
		accountService.insertAccountBillingAddress(appData.get(0).getBillingstreet(), appData.get(0).getBillingcity(),
				appData.get(0).getBillingstate(), appData.get(0).getBillingpostalcode(),
				appData.get(0).getBillingcountry());
		accountService.CopyBillingAddress();
		accountService.SaveTheDetails();
		elogger.pass("Test Case is Passed");

	}

	@Test(description = "Test case to edit the account details", priority = 1)
	public void editAccountDetails() throws InterruptedException {

		accountService.editAccountDetails();
		accountService.editAccountName(appData.get(0).getEditname());
		accountService.editAccountPhoneNumber(appData.get(0).getEditphonenumber());
		accountService.editAccountEmail(appData.get(0).getEditemail()).saveEditedDetails();

	}

//	@Test(description = "Test case to validate Account details", priority = 2)
	public void validateAccountDetails() {
		homeService.clickOnAccounts();
		accountValidation.validateAccountName(accountService);

	}

//	@Test(description = "Test case to delete Account details", priority = 3)

	public void deleteAccountDetails() {

		accountService.deleteCreatedAccount();
	}

}
