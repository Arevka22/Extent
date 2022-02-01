package com.reports;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import com.utility.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReportExtend3 {
	WebDriver driver;
	ExtentTest logger;
	
	
	
//*************************************************//		
	
		@BeforeMethod
		public void setUp() {
			
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("window-size=1400,800");
			options.addArguments("headless");
			driver = new ChromeDriver(options);
			driver.get("http://www.arevka.com");
			}
		

//****************************************************//	
	
	@Test
	public void tenTest() {
		
		
		System.out.println(driver.hashCode());
		Assert.assertEquals(555, 555);	
	}
	
	@Test
	public void ellevenTest() {
		
		Assert.assertEquals(3, 3);
	}
	@Test
	public void twelveTest() {
		
		Assert.assertEquals(55, 55);
	}
//*******************************************//		
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
																			 
		
		driver.quit();
	}
	

}
