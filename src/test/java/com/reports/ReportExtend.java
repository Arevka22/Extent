package com.reports;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.ITestResult;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import com.utility.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReportExtend {
	
	public static WebDriver driver;
	
	
	
	

//*******************************************//		
	
	@BeforeMethod
	public void setUp() {
		
	
		
		
		WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("window-size=1400,800");
		//options.addArguments("headless");
		//driver = new ChromeDriver(options);
		driver = new ChromeDriver();
		driver.get("http://www.arevka.com");
		}
	

//*******************************************//	
	@Test
	public void oneTest() {
		
		 
		
	System.out.println(driver.getTitle());
	Assert.assertEquals(driver.getTitle(), "AREVKA IN FASHION");	
	}
	
	
	
	
	@Test
	public void secondTest() {
		
		Assert.assertEquals(2, 2);	
	}
	
	
	@Test
	public void thirdTest() {
		
		Assert.assertEquals(3, 3);		
	}
	
//*******************************************//		
	
	
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException  {
		if(result.getStatus()==ITestResult.FAILURE) {
			Utility.getScreenShot(driver,result.getName());
		}
		
		
		
		driver.quit();
						}
	
	
}
