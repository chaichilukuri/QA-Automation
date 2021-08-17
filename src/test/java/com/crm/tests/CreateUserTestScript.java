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
import com.crm.services.UserService;
import com.crm.validators.CreateAccountValidation;

public class CreateUserTestScript {

	LoginService loginService = null;
	HomeService homeService = null;
	AccountService accountService = null;
	UserService userService = null;
	CreateAccountValidation accountValidation = null;

	CrmLoginData crmLoginData = null;
	List<LoginData> appData = null;

	@BeforeClass
	public void init() {

		loginService = new LoginService();
		homeService = new HomeService();
		accountService = new AccountService();
		userService = new UserService();
		accountValidation = new CreateAccountValidation();

		crmLoginData = CrmTestData.getTestData();
		appData = crmLoginData.getCrmlogindata();
		

		InitializeViews.init();

		BrowserDriver.getCurrentDriver().get(PropertyLoader.getUrl());
		loginService.loginToApplication(appData.get(0).getUsername(), appData.get(0).getPassword());

	}
	
	@Test(description = "Test case to create new user", priority = 0)
	public void createNewUser() throws InterruptedException {
		homeService.clickOnMenuButton();
		userService.createUser();
		userService.insertUserName(appData.get(0).getNewusername());
		userService.insertName(appData.get(0).getFirstname(), appData.get(0).getLastname());
		userService.insertTitle(appData.get(0).getTitle());
		userService.insertEmail(appData.get(0).getNewemail());
		userService.insertPhoneNumber(appData.get(0).getNewphonenumber());
		userService.insertPassword(appData.get(0).getNewpassword(), appData.get(0).getConfirmpassword());
		userService.saveDetails();
		homeService.clickOnMenuButton();
		userService.Logout();
		loginService.loginWithNewUser(appData.get(0).getNewusername(), appData.get(0).getNewpassword());
		
	}
	
	
	
	
	

}
