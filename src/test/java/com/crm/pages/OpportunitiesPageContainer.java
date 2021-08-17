package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpportunitiesPageContainer {

	@FindBy(xpath = "//a[@data-name='create']")
	public WebElement createOpportunity;

	@FindBy(xpath = "//input[@data-name='name']")
	public WebElement txtOpportunityName;

	@FindBy(xpath = "//input[@data-name='amount']")
	public WebElement txtenterAmount;

	@FindBy(xpath = "//input[@data-name='closeDate']")
	public WebElement txtenterDate;

	@FindBy(xpath = "//button[@data-action='save']")
	public WebElement txtSaveTheDetails;

	@FindBy(xpath = "//td[@data-name='name']")
	public WebElement opportunitiesPageOpportunityName;

	@FindBy(xpath = "//a[text()='Pranay Kaza']")
	public WebElement selectEditedOpportunity;

	@FindBy(xpath = "//button[@data-action='edit']")
	public WebElement editSelectedOpportunity;

	@FindBy(xpath = "//input[@data-name='probability']")
	public WebElement editProbability;

	@FindBy(xpath = "//span[@class='fas fa-ellipsis-h']")
	public WebElement clickOnDropDown;

	@FindBy(xpath = "//input[@class='record-checkbox']")
	public WebElement clickOnCheckBox;

	@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle actions-button']")
	public WebElement clickOnActionsDropDown;

	@FindBy(xpath = "//a[@data-action='remove']")
	public WebElement selectRemove;

	@FindBy(xpath = "//button[@data-name='confirm']")
	public WebElement confirmRemove;

	@FindBy(xpath = "//a[@title='Menu']")
	public WebElement clickonMenuBotton;

	public WebElement getCreateOpportunity() {
		return createOpportunity;
	}

	public void setCreateOpportunity(WebElement createOpportunity) {
		this.createOpportunity = createOpportunity;
	}

	public WebElement getTxtOpportunityName() {
		return txtOpportunityName;
	}

	public void setTxtOpportunityName(WebElement txtOpportunityName) {
		this.txtOpportunityName = txtOpportunityName;
	}

	public WebElement getTxtenterAmount() {
		return txtenterAmount;
	}

	public void setTxtenterAmount(WebElement txtenterAmount) {
		this.txtenterAmount = txtenterAmount;
	}

	public WebElement getTxtenterDate() {
		return txtenterDate;
	}

	public void setTxtenterDate(WebElement txtenterDate) {
		this.txtenterDate = txtenterDate;
	}

	public WebElement getTxtSaveTheDetails() {
		return txtSaveTheDetails;
	}

	public void setTxtSaveTheDetails(WebElement txtSaveTheDetails) {
		this.txtSaveTheDetails = txtSaveTheDetails;
	}

	public WebElement getOpportunitiesPageOpportunityName() {
		return opportunitiesPageOpportunityName;
	}

	public void setOpportunitiesPageOpportunityName(WebElement opportunitiesPageOpportunityName) {
		this.opportunitiesPageOpportunityName = opportunitiesPageOpportunityName;
	}

	public WebElement getSelectEditedOpportunity() {
		return selectEditedOpportunity;
	}

	public void setSelectEditedOpportunity(WebElement selectEditedOpportunity) {
		this.selectEditedOpportunity = selectEditedOpportunity;
	}

	public WebElement getEditSelectedOpportunity() {
		return editSelectedOpportunity;
	}

	public void setEditSelectedOpportunity(WebElement editSelectedOpportunity) {
		this.editSelectedOpportunity = editSelectedOpportunity;
	}

	public WebElement getEditProbability() {
		return editProbability;
	}

	public void setEditProbability(WebElement editProbability) {
		this.editProbability = editProbability;
	}

	public WebElement getClickOnDropDown() {
		return clickOnDropDown;
	}

	public void setClickOnDropDown(WebElement clickOnDropDown) {
		this.clickOnDropDown = clickOnDropDown;
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

	public WebElement getClickonMenuBotton() {
		return clickonMenuBotton;
	}

	public void setClickonMenuBotton(WebElement clickonMenuBotton) {
		this.clickonMenuBotton = clickonMenuBotton;
	}

}
