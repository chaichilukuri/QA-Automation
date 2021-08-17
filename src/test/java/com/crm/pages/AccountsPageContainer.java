package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPageContainer {

	@FindBy(xpath = "//a[@data-name='create']")
	public WebElement createAccount;

	@FindBy(xpath = "//input[@data-name='name']")
	public WebElement txtAccountName;
	
	@FindBy(xpath = "//input[@data-name='name']")
	public WebElement newAccountName;

	@FindBy(xpath = "//input[@type='email']")
	public WebElement txtAccountEmail;

	@FindBy(xpath = "//input[@data-name='website']")
	public WebElement txtAccountWebsite;

	@FindBy(xpath = "//select[@data-property-type='type']")
	public WebElement phoneDropDown;

	@FindBy(xpath = "//input[@autocomplete='espo-phoneNumber']")
	public WebElement txtAccountPhoneNumber;

	@FindBy(xpath = "//textarea[@placeholder='Street']")
	public WebElement txtAccountBillingStreet;

	@FindBy(xpath = "//input[@data-name='billingAddressCity']")
	public WebElement txtAccountBillingCity;

	@FindBy(xpath = "//input[@data-name='billingAddressState']")
	public WebElement txtAccountBillingState;

	@FindBy(xpath = "//input[@data-name='billingAddressPostalCode']")
	public WebElement txtAccountBillingPostalCode;

	@FindBy(xpath = "//input[@data-name='billingAddressCountry']")
	public WebElement txtAccountBillingCountry;

	@FindBy(xpath = "//button[normalize-space()='Copy Billing']")
	public WebElement txtCopyBillingAddress;

	@FindBy(xpath = "//button[@data-action='save']")
	public WebElement txtSaveTheDetails;

	@FindBy(xpath = "//td[@data-name='name']")
	public WebElement accountNameAccountPage;

	@FindBy(xpath = "//a[@title='Pranay']")
	public WebElement selectCreatedAccount;

	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement clickOnEditButon;
	
	@FindBy(xpath = "//input[@autocomplete='espo-phoneNumber']")
	public WebElement editPhoneNumber;
	
	 @FindBy(xpath = "//input[@type='email']") 
	 public WebElement editAccountEmail;
	 
	  @FindBy(xpath = "//button[@data-action='save']") 
	  public WebElement saveEditedDetails;
	
	@FindBy(xpath ="//button[@class='btn btn-default dropdown-toggle dropdown-item-list-button']" ) 
	public WebElement optoinsDropDown;
	
	@FindBy (xpath = "//input[@class='record-checkbox']")
	public WebElement clickOnCheckBox;
	
	@FindBy (xpath = "//button[@class='btn btn-default dropdown-toggle actions-button']")
	public WebElement clickOnActionsDropDown;
	
	@FindBy (xpath = "//a[@data-action='remove']")
	public WebElement selectRemove;
	
	@FindBy (xpath = "//button[@data-name='confirm']")
	public WebElement confirmRemove;
	  
	 @FindBy (xpath = "//div[@class='field' and @data-name='billingAddress']")
	 public WebElement selectBaddressFromWebPage;
	 
	 @FindBy (xpath = "//div[@class='field' and @data-name='shippingAddress']")
	 public WebElement selectSaddressFromWebPage;
	 
	 @FindBy (xpath = "//button[@data-action='cancel']")
	 public WebElement clickOnCancelButton;
	 
	 @FindBy(xpath = "//input[@autocomplete='espo-phoneNumber']")
		public WebElement invalidPhoneNumber;

	public WebElement getCreateAccount() {
		return createAccount;
	}

	public void setCreateAccount(WebElement createAccount) {
		this.createAccount = createAccount;
	}

	public WebElement getTxtAccountName() {
		return txtAccountName;
	}

	public void setTxtAccountName(WebElement txtAccountName) {
		this.txtAccountName = txtAccountName;
	}

	public WebElement getNewAccountName() {
		return newAccountName;
	}

	public void setNewAccountName(WebElement newAccountName) {
		this.newAccountName = newAccountName;
	}

	public WebElement getTxtAccountEmail() {
		return txtAccountEmail;
	}

	public void setTxtAccountEmail(WebElement txtAccountEmail) {
		this.txtAccountEmail = txtAccountEmail;
	}

	public WebElement getEditAccountEmail() {
		return editAccountEmail;
	}

	public void setEditAccountEmail(WebElement editAccountEmail) {
		this.editAccountEmail = editAccountEmail;
	}

	public WebElement getSaveEditedDetails() {
		return saveEditedDetails;
	}

	public void setSaveEditedDetails(WebElement saveEditedDetails) {
		this.saveEditedDetails = saveEditedDetails;
	}

	public WebElement getTxtAccountWebsite() {
		return txtAccountWebsite;
	}

	public void setTxtAccountWebsite(WebElement txtAccountWebsite) {
		this.txtAccountWebsite = txtAccountWebsite;
	}

	public WebElement getPhoneDropDown() {
		return phoneDropDown;
	}

	public void setPhoneDropDown(WebElement phoneDropDown) {
		this.phoneDropDown = phoneDropDown;
	}

	public WebElement getTxtAccountPhoneNumber() {
		return txtAccountPhoneNumber;
	}

	public void setTxtAccountPhoneNumber(WebElement txtAccountPhoneNumber) {
		this.txtAccountPhoneNumber = txtAccountPhoneNumber;
	}

	public WebElement getTxtAccountBillingStreet() {
		return txtAccountBillingStreet;
	}

	public void setTxtAccountBillingStreet(WebElement txtAccountBillingStreet) {
		this.txtAccountBillingStreet = txtAccountBillingStreet;
	}

	public WebElement getTxtAccountBillingCity() {
		return txtAccountBillingCity;
	}

	public void setTxtAccountBillingCity(WebElement txtAccountBillingCity) {
		this.txtAccountBillingCity = txtAccountBillingCity;
	}

	public WebElement getTxtAccountBillingState() {
		return txtAccountBillingState;
	}

	public void setTxtAccountBillingState(WebElement txtAccountBillingState) {
		this.txtAccountBillingState = txtAccountBillingState;
	}

	public WebElement getTxtAccountBillingPostalCode() {
		return txtAccountBillingPostalCode;
	}

	public void setTxtAccountBillingPostalCode(WebElement txtAccountBillingPostalCode) {
		this.txtAccountBillingPostalCode = txtAccountBillingPostalCode;
	}

	public WebElement getTxtAccountBillingCountry() {
		return txtAccountBillingCountry;
	}

	public void setTxtAccountBillingCountry(WebElement txtAccountBillingCountry) {
		this.txtAccountBillingCountry = txtAccountBillingCountry;
	}

	public WebElement getTxtCopyBillingAddress() {
		return txtCopyBillingAddress;
	}

	public void setTxtCopyBillingAddress(WebElement txtCopyBillingAddress) {
		this.txtCopyBillingAddress = txtCopyBillingAddress;
	}

	public WebElement getTxtSaveTheDetails() {
		return txtSaveTheDetails;
	}

	public void setTxtSaveTheDetails(WebElement txtSaveTheDetails) {
		this.txtSaveTheDetails = txtSaveTheDetails;
	}

	public WebElement getAccountNameAccountPage() {
		return accountNameAccountPage;
	}

	public void setAccountNameAccountPage(WebElement accountNameAccountPage) {
		this.accountNameAccountPage = accountNameAccountPage;
	}

	public WebElement getSelectCreatedAccount() {
		return selectCreatedAccount;
	}

	public void setSelectCreatedAccount(WebElement selectCreatedAccount) {
		this.selectCreatedAccount = selectCreatedAccount;
	}

	public WebElement getClickOnEditButon() {
		return clickOnEditButon;
	}

	public void setClickOnEditButon(WebElement clickOnEditButon) {
		this.clickOnEditButon = clickOnEditButon;
	}

	public WebElement getEditPhoneNumber() {
		return editPhoneNumber;
	}

	public void setEditPhoneNumber(WebElement editPhoneNumber) {
		this.editPhoneNumber = editPhoneNumber;
	}

	public WebElement getOptoinsDropDown() {
		return optoinsDropDown;
	}

	public void setOptoinsDropDown(WebElement optoinsDropDown) {
		this.optoinsDropDown = optoinsDropDown;
	}

	public WebElement getClickOnCheckBox() {
		return clickOnCheckBox;
	}

	public void setClickOnCheckBox(WebElement clickOnCheckBox) {
		this.clickOnCheckBox = clickOnCheckBox;
	}

	public WebElement getClickOnActionsDropDown() {
		return clickOnActionsDropDown;
	}

	public void setClickOnActionsDropDown(WebElement clickOnActionsDropDown) {
		this.clickOnActionsDropDown = clickOnActionsDropDown;
	}

	public WebElement getSelectRemove() {
		return selectRemove;
	}

	public void setSelectRemove(WebElement selectRemove) {
		this.selectRemove = selectRemove;
	}

	public WebElement getConfirmRemove() {
		return confirmRemove;
	}

	public void setConfirmRemove(WebElement confirmRemove) {
		this.confirmRemove = confirmRemove;
	}

	public WebElement getSelectBaddressFromWebPage() {
		return selectSaddressFromWebPage;
	}

	public void setSelectBaddressFromWebPage(WebElement selectBaddressFromWebPage) {
		selectSaddressFromWebPage = selectBaddressFromWebPage;
	}

	public WebElement getSelectSaddressFromWebPage() {
		return selectBaddressFromWebPage;
	}

	public void setSelectSaddressFromWebPage(WebElement selectSaddressFromWebPage) {
		selectBaddressFromWebPage = selectSaddressFromWebPage;
	}

	public WebElement getClickOnCancelButton() {
		return clickOnCancelButton;
	}

	public void setClickOnCancelButton(WebElement clickOnCancelButton) {
		this.clickOnCancelButton = clickOnCancelButton;
	}

	public WebElement getInvalidPhoneNumber() {
		return invalidPhoneNumber;
	}

	public void setInvalidPhoneNumber(WebElement invalidPhoneNumber) {
		this.invalidPhoneNumber = invalidPhoneNumber;
	}


	 

}
