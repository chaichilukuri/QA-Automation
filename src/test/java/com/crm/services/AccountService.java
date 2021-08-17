package com.crm.services;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pages.AccountsPageContainer;
import com.crm.util.CommonUtil;

public class AccountService {

	public static AccountsPageContainer accountsPageContainer;
	private static Logger log = Logger.getLogger(AccountService.class);

	public AccountService clickOnCreateAccount() {
		accountsPageContainer.getCreateAccount().click();

		return this;
	}

	public AccountService insertAccountName() {
		accountsPageContainer.getTxtAccountName().sendKeys(CommonUtil.generateRandomName());
		return this;

	}

	public AccountService insertNewAccountName(String newname) {
		accountsPageContainer.getNewAccountName().sendKeys(newname);
		return this;
	}

	public AccountService insertAccountEmail(String email) {
		accountsPageContainer.getTxtAccountEmail().sendKeys(email);

		return this;

	}

	public AccountService insertAccountWebSite(String website) {
		accountsPageContainer.getTxtAccountWebsite().sendKeys(website);
		return this;
	}
	
	public AccountService inesrtPhoneNumber(String phonenum) {
		accountsPageContainer.invalidPhoneNumber.sendKeys(phonenum);
		return this;
	}
	

	public AccountService insertAccountPhoneNumber(String PhoneNumber) {
		String num = Integer.toString(CommonUtil.generateRandomNumber());
		BrowserDriver.selectDropDownItem(accountsPageContainer.getPhoneDropDown(), "Mobile");
		accountsPageContainer.getTxtAccountPhoneNumber().sendKeys(num);
		return this;
	}

	public AccountService insertAccountBillingAddress(String billingStreet, String billingCity, String billingState,
			String billingPostalCode, String billingCountry) {

		accountsPageContainer.getTxtAccountBillingStreet().sendKeys(billingStreet);
		accountsPageContainer.getTxtAccountBillingCity().sendKeys(billingCity);
		accountsPageContainer.getTxtAccountBillingState().sendKeys(billingState);
		accountsPageContainer.getTxtAccountBillingPostalCode().sendKeys(billingPostalCode);
		accountsPageContainer.getTxtAccountBillingCountry().sendKeys(billingCountry);

		return this;

	}

	public AccountService CopyBillingAddress() {
		BrowserDriver.waitForPageElement(accountsPageContainer.getTxtCopyBillingAddress(), 45);
		accountsPageContainer.getTxtCopyBillingAddress().click();
		return this;

	}

	public AccountService SaveTheDetails() throws InterruptedException {
		accountsPageContainer.getTxtSaveTheDetails().click();
		log.info("Account Created Successfully");
		Thread.sleep(5000);
		return this;
	}

	public AccountService selectCreatedAccount() {
		accountsPageContainer.getSelectCreatedAccount().click();
		return this;
	}

	public AccountService editAccountDetails() {
		accountsPageContainer.getClickOnEditButon().click();
		return this;
	}

	public AccountService editAccountName(String ename) {
		accountsPageContainer.getTxtAccountName().clear();
		accountsPageContainer.getTxtAccountName().sendKeys(ename);
		return this;
	}

	public AccountService editAccountPhoneNumber(String ephonenumber) {
		accountsPageContainer.getTxtAccountPhoneNumber().clear();
		String num = Integer.toString(CommonUtil.generateRandomNumber());
		accountsPageContainer.getTxtAccountPhoneNumber().sendKeys(num);
		return this;
	}

	public AccountService editAccountEmail(String eemail) {
		accountsPageContainer.getTxtAccountEmail().clear();
		accountsPageContainer.getTxtAccountEmail().sendKeys(eemail);
		return this;
	}

	public AccountService saveEditedDetails() throws InterruptedException {
		accountsPageContainer.getSaveEditedDetails().click();
		log.info("Account Edited Successfully");
		Thread.sleep(5000);
		return this;
	}

	public String getCreatedAccountName() {
		String aname = accountsPageContainer.getAccountNameAccountPage().getText();
		System.out.println("Account Name:" + aname);
		log.info("Account Validated Successfully");
		return aname;
	}

	public String getInsertedAccountName(String validatorname) {
		String vname = accountsPageContainer.getAccountNameAccountPage().getText();
		System.out.println("Inserted Account Name: " + vname);
		log.info("Account Validated Successfully");
		return vname;
	}

	public String getBillingAddressStreet() {
		String bstreet = accountsPageContainer.getTxtAccountBillingStreet().getText();
		System.out.println("Billing Street: " + bstreet);
		log.info("Billing Street Validated Successfully");
		return bstreet;

	}

	public String getInsertedBillingStreet(String Valbstreet) {
		String vbstreet = accountsPageContainer.getTxtAccountBillingStreet().getText();
		System.out.println("Inserted Billing Street: " + vbstreet);
		log.info("Billing Street Validated Successfully");
		return vbstreet;

	}

	public String getBillingAddressCity() {
		String bcity = accountsPageContainer.getTxtAccountBillingCity().getText();
		System.out.println("Billing City: " + bcity);
		log.info("Billing City Validated Successfully");
		return bcity;
	}

	public String getBillingAddressState() {
		String bstate = accountsPageContainer.getTxtAccountBillingState().getText();
		System.out.println("Billing State: " + bstate);
		log.info("Billing State Validated Successfully");
		return bstate;
	}

	public String getBillingAddressCountry() {
		String acountry = accountsPageContainer.getTxtAccountBillingState().getText();
		System.out.println("Billing Country: " + acountry);
		log.info("Billing Country Validated Successfully");
		return acountry;
	}

	public AccountService optionsDropDown() {
		BrowserDriver.selectDropDownItem(accountsPageContainer.getOptoinsDropDown(), "Remove");
		accountsPageContainer.getOptoinsDropDown().click();
		return this;
	}

	public AccountService deleteCreatedAccount() {
		accountsPageContainer.clickOnCheckBox.click();
		accountsPageContainer.clickOnActionsDropDown.click();
		accountsPageContainer.selectRemove.click();
		accountsPageContainer.confirmRemove.click();
		log.info("Account Deleted Successfully");
		return this;
	}

	public String selectBillingAddressFromWebPage() {
		String str = accountsPageContainer.selectBaddressFromWebPage.getText();
		System.out.println(str);
		return str;
	}

	public String selectShippingAddressFromWebPage() {
		String str = accountsPageContainer.selectSaddressFromWebPage.getText();
		System.out.println(str);
		return str;
	}

	public static void init() {
		accountsPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), AccountsPageContainer.class);

	}

}
