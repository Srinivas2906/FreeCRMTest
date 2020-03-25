package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class CasesPage extends TestBase{

	@FindBy(xpath="//button[@class ='ui linkedin button']//i[@class='edit icon']")
	WebElement newCasebutton;
	
	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
	WebElement casesLogo;
	
	@FindBy(name = "title")
	WebElement titleField;
	
	@FindBy(name ="description")
	WebElement descriptionField;
	
	@FindBy(xpath="//button[@class='ui linkedin button']//i[@class='save icon']")
	WebElement saveDetails;
	
	
	public CasesPage()
	{
		PageFactory.initElements(driver,this);
	}

	public boolean logoTest()
	{
	return casesLogo.isDisplayed();
	
	}


	/*
	public void titleofCase()
	{
		titleField.sendKeys("CaseTest");
	}
	
	public void descriptionofcase()
	{
		descriptionField.sendKeys("selenium");
	}

	public void savedetailsCase()
	{
		saveDetails.click();
	}
	*/

	public void createCase(String title, String des) {
		newCasebutton.click();
		titleField.sendKeys(title);
		descriptionField.sendKeys(des);
		saveDetails.click();
		
	}

	


	
}
