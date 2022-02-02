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


import com.utility.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReportExtend2 {
		
	WebDriver driver;
	
	

	
	
//*******************************************//		
	
		@BeforeMethod
		public void setUp() {
			
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("window-size=1400,800");
			options.addArguments("headless");
			driver = new ChromeDriver(options);
			driver.get("http://www.arevka.com");
			}
		

//*******************************************//	
		
		
		@Test
		public void fifthTest() {
			
			
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(5,5);	
			
		}
		
		@Test
		public void sixthTest() {
			
			Assert.assertEquals(1, 1);
		}
		
		@Test
		public void seventhTest() {
			
			Assert.assertEquals(2, 2);
		}

//*******************************************//		
		
		@AfterMethod
		public void tearDown(ITestResult result) throws IOException {
			if(result.getStatus()==ITestResult.FAILURE) {
				Utility.getScreenShot(driver,result.getName());
			}
			
			driver.quit();
		}
		
}
