package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.pages.CalendarPage;
import com.qa.pages.ContactsPage;
import com.qa.pages.EmailPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.testbase.TestBase;

public class HomePageTest extends TestBase{
	LoginPage l;
	HomePage h;
	ContactsPage c;
	EmailPage e;
	CalendarPage cl;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		laucnhBrowser();
		l = new LoginPage();
		h = new HomePage();
		c = new ContactsPage();
		e = new EmailPage();
		cl = new CalendarPage();
			
		h = l.loginTo(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority =1)
	public void homePageValidate()
	{
		Assert.assertTrue(h.confirmHomePage());
	}

	@Test(priority =4)
	public void contactslinkPage()
	{
		c = h.clickOnContacts();
	}
	
	@Test(priority =2)
	public void emailLinkPage()
	{
		e = h.clickOnEmail();
	}
	@Test(priority =3)
	public void calendarLinkPage()
	{
		cl = h.clickOnCalendar();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
