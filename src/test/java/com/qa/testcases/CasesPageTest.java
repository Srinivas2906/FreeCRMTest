package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.CasesPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.testbase.TestBase;

public class CasesPageTest extends TestBase{
	
	LoginPage l;
	HomePage h;
	CasesPage ca;
	
	public CasesPageTest()
	{
		super();
	}

	
	@BeforeMethod
	public void initiate() throws InterruptedException
	{
		laucnhBrowser();
		
		h= new HomePage();
		l = new LoginPage();
		ca = new CasesPage();
		
		l.loginTo(prop.getProperty("username"), prop.getProperty("password"));
		h.clickonCases();
		//ca.createCase();
		Thread.sleep(2000);
		
	}
	@Test(priority = 2)
	public void logoDisplayTest()
	{
		Assert.assertTrue(ca.logoTest());
	}
	
	@Test(priority =1)
	public void titleofCaseTest() 
	{
		ca.createCase("case","selenium");
	
		
		/*
		ca.titleofCase();
		Thread.sleep(3000);
		ca.descriptionofcase();
		Thread.sleep(3000);
		ca.savedetailsCase();
		Thread.sleep(3000);
	*/
		}
	
	
	
	@AfterMethod()
	public void closeBrowser()
	{
		driver.quit();
	}
		
	}

