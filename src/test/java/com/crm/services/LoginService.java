package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;


import com.crm.config.BrowserDriver;
import com.crm.pages.LoginPageContainer;

public class LoginService {

	public static LoginPageContainer loginPageContainer;
	private static Logger log = Logger.getLogger(LoginService.class);

	public void loginToApplication(String uname, String pword) {
		loginPageContainer.getTxtFieldUserName().sendKeys(uname);
		loginPageContainer.getTxtFieldPassword().sendKeys(pword);
		loginPageContainer.getLoginButton().click();
		log.info("User Logged into Crm Application");
		
	}
	
	public void loginWithNewUser(String nuname, String npword) {
		loginPageContainer.getTxtFieldUserName().sendKeys(nuname);
		loginPageContainer.getTxtFieldPassword().sendKeys(npword);
		loginPageContainer.getLoginButton().click();
	}

	public static void init() {
		loginPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPageContainer.class);
	}

}
