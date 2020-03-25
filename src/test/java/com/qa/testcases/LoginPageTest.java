package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.ContactsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.testbase.TestBase;

public class LoginPageTest extends TestBase{
	
	LoginPage l ;
	HomePage h;
	ContactsPage c;
	public LoginPageTest()
	{
		super();
	}
	

	@BeforeMethod
	public void loginPageTest()
	{
		laucnhBrowser();
		h = new HomePage();
		l = new LoginPage();
		c = new ContactsPage();
		
	}
	
	@Test(priority =1)
	public void validateTitle()
	{
	String title= 	l.titleCheck();
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
	}
	
	@Test(priority =2)
	public void loginTest() throws InterruptedException
	{
	//	l.loginTo("srinivas60.yerala@gmail.com", "srinu@2906");
		h =l.loginTo(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	
	
	@AfterMethod
	public void closeBrowser()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
