package com.crm.tests;

import org.openqa.selenium.WebDriver;

import com.crm.config.BrowserDriver;
import com.crm.services.AccountService;
import com.crm.services.HomeService;
import com.crm.services.LoginService;
import com.crm.services.OpportunityService;
import com.crm.services.UserService;

public class InitializeViews {
	
	public static WebDriver driver = null;

	public static void init() {
		
		driver = BrowserDriver.getCurrentDriver();
		LoginService.init();
		HomeService.init();
		AccountService.init();
		UserService.init();
		OpportunityService.init();
		
		
	}
	

}
