package com.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.TestUtil;

public class TestBase {

public static WebDriver driver;
public static Properties prop;


	
	public TestBase()
	{
		
 prop = new Properties();

String s = "D:\\\\Personal\\\\WorkSpace2ForSelenium\\\\FreeCRM\\\\src\\\\main\\\\java\\\\com\\\\qa\\\\config\\\\config.properties";
		
		try {
			FileInputStream fi = new FileInputStream(s);
			prop.load(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
		e.printStackTrace();
		}
		
	}
	
	public static void laucnhBrowser()
	{
	//	prop.getProperty("browser");
System.setProperty("webdriver.chrome.driver","D:\\\\Personal\\Selenium files\\\\Eclisps standalone and extension fles\\\\Chrome extension 79 file\\\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Time, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Impicit_Wait, TimeUnit.SECONDS);
		
	driver.get(prop.getProperty("url"));
	//driver.get("https://freecrm.co.in/");
	}
		
		
		
		
		
		
	

}
