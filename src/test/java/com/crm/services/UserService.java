package com.crm.services;

import org.openqa.selenium.support.PageFactory;

import com.crm.config.BrowserDriver;
import com.crm.pages.UserPageContainer;
import com.crm.util.CommonUtil;

public class UserService {
	
	public static UserPageContainer userPageContainer;
	
	
	public UserService createUser() {
		userPageContainer.getClickOnAdministration().click();
		userPageContainer.getClickOnUsers().click();
		userPageContainer.getClickOnCreateUser().click();
		return this;
	}
	
	public UserService insertUserName(String nuname) {
		userPageContainer.getInsertUserName().sendKeys(nuname);
		return this;
	}
	
	public UserService insertName(String fname, String lname) {
		BrowserDriver.selectDropDownItem(userPageContainer.getSelectNameTitle(), "Mr.");
		userPageContainer.getInsertFirstName().sendKeys(fname);
		userPageContainer.getInsertLastName().sendKeys(lname);
		return this;
	}
	
	public UserService insertTitle(String title) {
		userPageContainer.getInsertTitle().sendKeys(title);
		return this;
	}
	
	public UserService insertEmail(String email) {
		userPageContainer.getInsertEmail().sendKeys(email);
		return this;
	}
	
	public UserService insertPhoneNumber (String pnum) {
		String num = Integer.toString(CommonUtil.generateRandomNumber());
		userPageContainer.getInsertPhoneNumber().sendKeys(num);
		return this;
	}
	
	public UserService selectGender() {
		BrowserDriver.selectDropDownItem(userPageContainer.getSelectGender(), "Male");
		return this;
	}
	
	public UserService insertPassword(String pword, String cpword) {
		userPageContainer.getInsertPassword().sendKeys(pword);
		userPageContainer.getInsertConfrimePassword().sendKeys(cpword);
		return this;
	}
	
	public UserService saveDetails() {
		userPageContainer.getClickOnSaveButton().click();
		return this;
	}
	
	public UserService Logout() {
		userPageContainer.getClickOnLogout().click();
		return this;
	}
	
	public static void init() {
		userPageContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), UserPageContainer.class);
		
	}


}
