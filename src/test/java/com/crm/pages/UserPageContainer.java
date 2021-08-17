package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPageContainer {
	
	@FindBy (xpath = "//a[@title='Menu']")
	public WebElement clickOnMenuBotton;
	
	@FindBy (xpath = "//a[normalize-space()='Administration']")
	public WebElement clickOnAdministration;
	
	@FindBy (xpath = "//a[text()='Users']")
	public WebElement clickOnUsers;
	
	@FindBy (xpath = "//a[@data-name='create']")
	public WebElement clickOnCreateUser;
	
	@FindBy (xpath = "//input[@data-name='userName']")
	public WebElement insertUserName;
	
	@FindBy (xpath = "//select[@data-name='salutationName']")
	public WebElement selectNameTitle;
	
	@FindBy (xpath = "//input[@data-name='firstName']")
	public WebElement insertFirstName;
	
	@FindBy (xpath = "//input[@data-name='lastName']")
	public WebElement insertLastName;
	
	@FindBy (xpath = "//input[@data-name='title']")
	public WebElement insertTitle;
	
	@FindBy (xpath = "//input[@autocomplete='espo-emailAddress']")
	public WebElement insertEmail;
	
	@FindBy (xpath = "//input[@autocomplete='espo-phoneNumber']")
	public WebElement insertPhoneNumber;
	
	@FindBy (xpath = "//select[@data-name='gender']")
	public WebElement selectGender;
	
	@FindBy (xpath = "//input[@data-name='password']")
	public WebElement insertPassword;
	
	@FindBy (xpath = "//input[@data-name='passwordConfirm']")
	public WebElement insertConfrimePassword;
	
	@FindBy (xpath = "//button[@data-action='save']")
	public WebElement clickOnSaveButton;
	
	@FindBy (xpath = "//a[@data-action='logout']")
	public WebElement clickOnLogout;

	public WebElement getClickOnMenuBotton() {
		return clickOnMenuBotton;
	}

	public void setClickOnMenuBotton(WebElement clickOnMenuBotton) {
		this.clickOnMenuBotton = clickOnMenuBotton;
	}

	public WebElement getClickOnAdministration() {
		return clickOnAdministration;
	}

	public void setClickOnAdministration(WebElement clickOnAdministration) {
		this.clickOnAdministration = clickOnAdministration;
	}

	public WebElement getClickOnUsers() {
		return clickOnUsers;
	}

	public void setClickOnUsers(WebElement clickOnUsers) {
		this.clickOnUsers = clickOnUsers;
	}

	public WebElement getClickOnCreateUser() {
		return clickOnCreateUser;
	}

	public void setClickOnCreateUser(WebElement clickOnCreateUser) {
		this.clickOnCreateUser = clickOnCreateUser;
	}

	public WebElement getInsertUserName() {
		return insertUserName;
	}

	public void setInsertUserName(WebElement insertUserName) {
		this.insertUserName = insertUserName;
	}

	public WebElement getSelectNameTitle() {
		return selectNameTitle;
	}

	public void setSelectNameTitle(WebElement selectNameTitle) {
		this.selectNameTitle = selectNameTitle;
	}

	public WebElement getInsertFirstName() {
		return insertFirstName;
	}

	public void setInsertFirstName(WebElement insertFirstName) {
		this.insertFirstName = insertFirstName;
	}

	public WebElement getInsertLastName() {
		return insertLastName;
	}

	public void setInsertLastName(WebElement insertLastName) {
		this.insertLastName = insertLastName;
	}

	public WebElement getInsertTitle() {
		return insertTitle;
	}

	public void setInsertTitle(WebElement insertTitle) {
		this.insertTitle = insertTitle;
	}

	public WebElement getInsertEmail() {
		return insertEmail;
	}

	public void setInsertEmail(WebElement insertEmail) {
		this.insertEmail = insertEmail;
	}

	public WebElement getInsertPhoneNumber() {
		return insertPhoneNumber;
	}

	public void setInsertPhoneNumber(WebElement insertPhoneNumber) {
		this.insertPhoneNumber = insertPhoneNumber;
	}

	public WebElement getSelectGender() {
		return selectGender;
	}

	public void setSelectGender(WebElement selectGender) {
		this.selectGender = selectGender;
	}

	public WebElement getInsertPassword() {
		return insertPassword;
	}

	public void setInsertPassword(WebElement insertPassword) {
		this.insertPassword = insertPassword;
	}

	public WebElement getInsertConfrimePassword() {
		return insertConfrimePassword;
	}

	public void setInsertConfrimePassword(WebElement insertConfrimePassword) {
		this.insertConfrimePassword = insertConfrimePassword;
	}

	public WebElement getClickOnSaveButton() {
		return clickOnSaveButton;
	}

	public void setClickOnSaveButton(WebElement clickOnSaveButton) {
		this.clickOnSaveButton = clickOnSaveButton;
	}

	public WebElement getClickOnLogout() {
		return clickOnLogout;
	}

	public void setClickOnLogout(WebElement clickOnLogout) {
		this.clickOnLogout = clickOnLogout;
	}

}
