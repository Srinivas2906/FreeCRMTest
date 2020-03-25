package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath="//button[@class='ui linkedin button']//i[@class='edit icon']")
	WebElement newContact;
	
	@FindBy(name ="first_name")
	WebElement fName;
	
	@FindBy(name ="last_name")
	WebElement lName;
	
	@FindBy(xpath="//div[@name='channel_type']")
	WebElement socialOption;
	
	@FindBy(xpath = "//span[contains(text(),'LinkedIn')]")
	WebElement selSocial;
	
	@FindBy(xpath ="//button[@class='ui linkedin button']")
	WebElement save;
	
	
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void createNewContact()
	{
		newContact.click();
	}
	public void enterDetails(String first, String last)
	{
		fName.sendKeys(first);
		lName.sendKeys(last);
	}
	public void selSocial()
	{
		socialOption.click();
		selSocial.click();
	}
	
	public void saveDetails()
	{
		save.click();
	}
	
}
