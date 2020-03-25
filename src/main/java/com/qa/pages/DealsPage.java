package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class DealsPage extends TestBase{
	
	@FindBy(xpath="//button[@class='ui linkedin button']//i[@class= 'edit icon']")
	WebElement newDeal;
	
	@FindBy(name = "title")
	WebElement titleofDeal;
	
	@FindBy(name ="description")
	WebElement desofDeal;
	
	@FindBy(name ="probability")
	WebElement probofDeal;
	
	@FindBy(xpath ="//button[@class='ui linkedin button']//i[@class ='save icon']")
	WebElement saveDeal;
	
	
	public DealsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void newDealData(String title, String des, String prob)
	{
		newDeal.click();
		titleofDeal.sendKeys(title);
		desofDeal.sendKeys(des);
		probofDeal.sendKeys(prob);
		saveDeal.click();
	}
}
