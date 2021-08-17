package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;


import com.crm.config.BrowserDriver;
import com.crm.pages.OpportunitiesPageContainer;

public class OpportunityService {
	
	public static OpportunitiesPageContainer opportunitiesPageContainer;
	private static Logger log = Logger.getLogger(OpportunityService.class);
	
	
	public OpportunityService clcikOnCreateOpportunity() {
		opportunitiesPageContainer.getCreateOpportunity().click();
		return this;
	}
	
	public OpportunityService insertOpportunityName(String oname) {
		opportunitiesPageContainer.getTxtOpportunityName().sendKeys(oname);
		return this;
	}
	
	public OpportunityService enterAmount(String amount) {
		opportunitiesPageContainer.getTxtenterAmount().sendKeys(amount);
		return this;
	}
	
	
	public OpportunityService enterDate(String date) {
		opportunitiesPageContainer.getTxtenterDate().sendKeys(date);
		return this;
	}
	
	public OpportunityService saveTheDetails() throws InterruptedException {
		opportunitiesPageContainer.getTxtSaveTheDetails().click();
		log.info("Opportunity Created Successfully");
		//Thread.sleep(6000);
		return this;
	}
	
	public OpportunityService selectCreatedOpportunity() {
		opportunitiesPageContainer.getOpportunitiesPageOpportunityName().click();
		return this;
	}
	
	public OpportunityService editTheDetails() {
		opportunitiesPageContainer.getEditSelectedOpportunity().click();
		return this;
	}
	
	public OpportunityService editNameInSelectedOpportunity(String ename) {
		opportunitiesPageContainer.getTxtOpportunityName().clear();
		opportunitiesPageContainer.getTxtOpportunityName().sendKeys(ename);
		return this;
	}
	
	public OpportunityService editAmountInSelectedOpportunity(String eamount) {
		opportunitiesPageContainer.getTxtenterAmount().clear();
		opportunitiesPageContainer.getTxtenterAmount().sendKeys(eamount);
		return this;
	}
	
	public OpportunityService editProbabilityInSelectedOpportunity(String probability) {
		opportunitiesPageContainer.getEditProbability().clear();
		opportunitiesPageContainer.getEditProbability().sendKeys(probability);
		return this;
	}
	
	public OpportunityService selectEditedOpportunity() {
		opportunitiesPageContainer.getEditSelectedOpportunity().click();
		log.info("Opportunity Edited Successfully");
		return this;
	}
	
	public OpportunityService clickOnDropDown() {
		BrowserDriver.selectDropDownItem(opportunitiesPageContainer.getClickOnDropDown(), "Remove");
		return this;
	}
	
	public OpportunityService clickOnSelectedOpportunityCheckBox() {
		opportunitiesPageContainer.getClickOnCheckBox().click();
		return this;
	}
	
	public OpportunityService clickOnActionsDropDown() {
		BrowserDriver.selectDropDownItem(opportunitiesPageContainer.clickOnActionsDropDown, "Remove");
		opportunitiesPageContainer.getClickOnActionsDropDown().click();
		return this;
	}
	
	public OpportunityService actionsDropDrown() {
		opportunitiesPageContainer.clickOnActionsDropDown.click();
		opportunitiesPageContainer.selectRemove.click();
		opportunitiesPageContainer.confirmRemove.click();
		log.info("Opportunity Deleted Successfully");
		return this;
	}
	
	public String getCreatedOpportunity() {
		String oname = opportunitiesPageContainer.getOpportunitiesPageOpportunityName().getText();
				System.out.println("Opportunity Name: " +oname);
				log.info("Opportunity Validated Successfully");
				return oname;
			
	}
	
	public static void init() {
		opportunitiesPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), OpportunitiesPageContainer.class);
		
	}
	
}
