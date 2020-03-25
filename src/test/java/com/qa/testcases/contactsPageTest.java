package com.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.ContactsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.testbase.TestBase;

public class contactsPageTest extends TestBase{
	WebDriver driver;
	LoginPage l;
	HomePage h;
	ContactsPage c;
	
	public contactsPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		
		h = new HomePage();
		 c = new ContactsPage();
		 l = new LoginPage();
		laucnhBrowser();
		Thread.sleep(5000);
		//h = l.loginTo(prop.getProperty("srinivas60.yerala@gmail.com"), prop.getProperty("srinu@2906"));
		//h= l.loginTo("srinivas60.yerala@gmail.com", "srinu@2906");
		l.loginTo(prop.getProperty("username"), prop.getProperty("password"));
		h.clickOnContacts();
		
	}
	
	@Test(priority=1)
	public void createNewConactTest()
	{
		c.createNewContact();
	}
	
	@Test(priority=1)
	public void enterDetailsTest()
	{
		c.enterDetails(prop.getProperty("fisrtName"), prop.getProperty("lastName"));
	}
	@Test(priority=2)
	public void selectSocialTest()
	{
		c.selSocial();
	}
	@Test(priority=3)
	public void saveTest()
	{
		c.saveDetails();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
