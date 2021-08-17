package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;


import com.crm.config.BrowserDriver;
import com.crm.pages.HomePageContainer;

public class HomeService {
	
	public static HomePageContainer homePageContainer;
	private static Logger log = Logger.getLogger(HomeService.class);
	
	
	public HomeService clickOnAccounts() {
		homePageContainer.getHomePageAccountsTab().click();
		log.info("Accounts page opened");
		return this;
	}
	
	public HomeService clickOnOpportunities() throws InterruptedException {
		homePageContainer.getHomePageOpportunitiesTab().click();
		log.info("Opportunities page opened");
		Thread.sleep(6000);
		return this;
	}
	
	public HomeService clickOnMenuButton() {
		homePageContainer.clickOnMenuBotton.click();
		return this;
	}
	
	
	public static void init() {
		homePageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), HomePageContainer.class);
	}
	

}
