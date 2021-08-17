package com.crm.tests;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.config.BrowserDriver;
import com.crm.config.PropertyLoader;
import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountService;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.validators.CreateAccountValidation;
import com.crm.validators.CreateAddressVallidation;

public class AccountsAddTestScript {
	
	LoginService loginService = null;
	HomeService homeService = null;
	AccountService accountService = null;
	CreateAccountValidation accountValidation = null;
	CreateAddressVallidation addressValidation = null;

	
	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;

	@BeforeClass
	public void init() {

		loginService = new LoginService();
		homeService = new HomeService();
		accountService = new AccountService();
		accountValidation = new CreateAccountValidation();
		addressValidation = new CreateAddressVallidation();

		crmLoginData = CrmTestData.getTestData();
		appData = crmLoginData.getCrmlogindata();

		InitializeViews.init();

		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication(appData.get(0).getUsername(), appData.get(0).getPassword());

	}
	
	

	@Test(description = "it Creates account with Random Name", priority = 0)
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
		accountValidation.validateBillingAddress(accountService);
		accountValidation.validateShippingAddress(accountService);
		
	}
	
//	@Test(description = "Test case to validate Account details", priority = 1)
	public void validateAccountDetails() {
		homeService.clickOnAccounts();
//		addressValidation.validateAccountName(accountService);
		accountValidation.validateAccountName(accountService);

		

	}
	
//	@Test(description = "Test case to validate Address details", priority = 2)
	public void validateAddressDetails() {
		homeService.clickOnAccounts();
		addressValidation.validateAddress(accountService);
		
	
		

	}


}
