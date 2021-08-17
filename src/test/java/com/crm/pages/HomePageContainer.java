package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageContainer {
	
	@FindBy(xpath= "//span[text()='Accounts']")
	public WebElement homePageAccountsTab;
	
	@FindBy(xpath = "//span[text()='Opportunities']")
	public WebElement homePageOpportunitiesTab;
	
	@FindBy (xpath = "//a[@title='Menu']")
	public WebElement clickOnMenuBotton;

	public WebElement getHomePageAccountsTab() {
		return homePageAccountsTab;
	}

	public void setHomePageAccountsTab(WebElement homePageAccountsTab) {
		this.homePageAccountsTab = homePageAccountsTab;
	}

	public WebElement getHomePageOpportunitiesTab() {
		return homePageOpportunitiesTab;
	}

	public void setHomePageOpportunitiesTab(WebElement homePageOpportunitiesTab) {
		this.homePageOpportunitiesTab = homePageOpportunitiesTab;
	}

	public WebElement getClickOnMenuBotton() {
		return clickOnMenuBotton;
	}

	public void setClickOnMenuBotton(WebElement clickOnMenuBotton) {
		this.clickOnMenuBotton = clickOnMenuBotton;
	}
	

	
	
	
	

}
