package com.crm.validators;

import java.util.List;

import org.testng.Assert;

import com.crm.data.CrmLoginData;
import com.crm.data.CrmTestData;
import com.crm.data.LoginData;
import com.crm.services.AccountService;

public class CreateAddressVallidation {

	CrmLoginData crmLoginData = CrmTestData.getTestData();
	List<LoginData> appData = crmLoginData.getCrmlogindata();

	public void validateAccountName(AccountService accountService) {

		String insertedAccountName = "vijay p";
		String accountName = accountService.getCreatedAccountName();
		Assert.assertEquals(accountName, insertedAccountName);

	}

	public void validateAddress(AccountService accountService) {

		String insertedBillingStreet = "kousalya colony";
		String billingStreet = accountService.getBillingAddressStreet();
		Assert.assertEquals(billingStreet, insertedBillingStreet);

		String insertedBillingCity = "Hyderabad";
		String billingCity = accountService.getBillingAddressCity();
		Assert.assertEquals(billingCity, insertedBillingCity);

		String insertedBillingState = "Telangana";
		String billingState = accountService.getBillingAddressState();
		Assert.assertEquals(billingState, insertedBillingState);

		String insertedBillingCountry = "India";
		String billingCountry = accountService.getBillingAddressCountry();
		Assert.assertEquals(billingCountry, insertedBillingCountry);
	}

}
