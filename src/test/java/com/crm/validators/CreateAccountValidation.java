package com.crm.validators;

import java.util.List;

import org.testng.Assert;

import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountService;

public class CreateAccountValidation {
	
	CrmLoginData crmLoginData = CrmTestData.getTestData();
	List<LoginData> appData = crmLoginData.getCrmlogindata();
	
	public void validateAccountName(AccountService accountService) {
		
		
		
		String insertedAccountName = appData.get(0).getValidatorname();
	    String accountName = accountService.getCreatedAccountName();
		Assert.assertEquals(accountName, insertedAccountName);
	
	}
	
	public void validateBillingAddress(AccountService accountService) {

		String xmlStreet = appData.get(0).getValidatorbstreet();
		String xmlState = appData.get(0).getValidatorbstate();
		String xmlCity = appData.get(0).getValidatorbcity();
		String xmlPostalCode = appData.get(0).getValidatorpcode();
		String xmlCountry = appData.get(0).getValidatorbcountry();
		
		String billingAddress = accountService.selectBillingAddressFromWebPage();
		
		String line[]= billingAddress.split("\\r?\\n");
		
		String[] lineIn = line[1].split(" ");
		
		
		String removeCom = lineIn[0].replace(",", "");
		
		Assert.assertEquals(xmlStreet, line[0]);
		Assert.assertEquals(xmlState, lineIn[1]);
		Assert.assertEquals(xmlCity, removeCom);
		Assert.assertEquals(xmlCountry, line[2]);
		Assert.assertEquals(xmlPostalCode, lineIn[2]);
		
	}
	
	public void validateShippingAddress(AccountService accountService) {

		String xmlShippingStreet = appData.get(0).getValidatorsstreet();
		String xmlShippingState = appData.get(0).getValidatorsstate();
		String xmlShippingCity = appData.get(0).getValidatorscity();
		String xmlShippingPostalCode = appData.get(0).getValidatorspcode();
		String xmlShippingCountry = appData.get(0).getValidatorscountry();
		
		String shippingAddress = accountService.selectShippingAddressFromWebPage();
		
		String line[]= shippingAddress.split("\\r?\\n");
		
		String[] lineIn = line[1].split(" ");
		
		
		String removeCom = lineIn[0].replace(",", "");
		
		Assert.assertEquals(xmlShippingStreet, line[0]);
		Assert.assertEquals(xmlShippingState, lineIn[1]);
		Assert.assertEquals(xmlShippingCity, removeCom);
		Assert.assertEquals(xmlShippingPostalCode, lineIn[2]);
		Assert.assertEquals(xmlShippingCountry, line[2]);
		
	}



}
