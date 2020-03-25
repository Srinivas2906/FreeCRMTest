package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class HomePage extends TestBase{

	
	@FindBy(xpath="//div[contains(text(),'Beta')]")
	WebElement confirmHome;
	
	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement cotactslink;
	
	@FindBy(xpath ="//span[contains(text(),'Calendar')]")
	WebElement calendarLink;
	
	@FindBy(xpath = "//span[contains(text(),'Email')]")
	WebElement emailLnk;
	
	@FindBy(xpath ="//span[contains(text(),'Cases')]")
	WebElement casesLink;
	
	@FindBy(xpath ="//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean confirmHomePage()
	{
		return confirmHome.isDisplayed();
	}
	
	public ContactsPage clickOnContacts()
	{
		cotactslink.click();	
		return new ContactsPage();
	}
	
	public CalendarPage clickOnCalendar()
	{
		calendarLink.click();	
		return new CalendarPage();
	}
	public EmailPage clickOnEmail()
	{
		emailLnk.click();
		return new EmailPage();
	}
	
	public CasesPage clickonCases()
	{
		casesLink.click();
		return new CasesPage();
	}
	
	public DealsPage clickonDeals()
	{
		dealsLink.click();
		return new DealsPage();
	}
}
