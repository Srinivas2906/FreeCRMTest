package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.DealsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.testbase.TestBase;

public class DealsPageTest extends TestBase{
	LoginPage l;
	HomePage h;
	DealsPage d;
	
	public DealsPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void initiate() throws InterruptedException
	{
		l= new LoginPage();
		h = new HomePage();
		d = new DealsPage();
		laucnhBrowser();
		h= l.loginTo(prop.getProperty("username"), prop.getProperty("password"));
		h.clickonDeals();
	}
	@Test
	public void createDealTest() throws InterruptedException
	{
		d.newDealData("dealtest", "SeleniumPractise", "once");
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
