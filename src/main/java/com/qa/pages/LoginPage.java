package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.testbase.TestBase;

public class LoginPage extends TestBase{
	
	

	@FindBy(xpath="//a[@href='https://freecrm.com']//parent::div[@class='rd-navbar-brand']")
	WebElement Title;

	@FindBy(xpath ="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']/span[2]")
	WebElement loginButton;
	
	@FindBy(name ="email")
	WebElement userName;
	
	@FindBy(name ="password")
	WebElement passWord;
	
	@FindBy(xpath ="//div[@class='ui fluid large blue submit button']")
	WebElement Login;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public HomePage loginTo(String un, String pwd) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']/span[2]")));
		Thread.sleep(5000);	
		loginButton.click();
			
			Thread.sleep(2000);
			userName.sendKeys(un);
			passWord.sendKeys(pwd);
			
			Login.click();
			
			return new HomePage();
	}
	public String titleCheck()
	{
		return driver.getTitle();	}
}


