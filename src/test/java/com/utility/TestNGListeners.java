package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.reports.ReportExtend;

public class TestNGListeners implements ITestListener, ISuiteListener {

	
  
    
    public void onTestFailure(ITestResult res) {
        System.out.println(res.getMethod().getMethodName() + " FAILURE !!! \n\n");
//        failed(res.getMethod().getMethodName());
        
        
        
//        try {
//			Utility.takeScreenshotAtEndOfTest(res.getName());
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
        
         
    }
    
    
  //Method in BASE   
//    public void failed(String testMethodName) {
//    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//    	try {
//		FileUtils.copyFile(scrFile, new File("./screenshots/" + testMethodName + ".jpg"));
//    	
//    	}catch (IOException e) {
//    	e.printStackTrace();
//    	}
//    }
//    
    
    
    
    
 
    
    public void onTestSkipped(ITestResult res) {
        System.out.println(res.getMethod().getMethodName() + " SKIPPED !!! \n\n");
         
    }
 
    
    public void onTestStart(ITestResult res) {
        System.out.println("Start test " + res.getMethod().getMethodName());
         
    }
 
    
    public void onTestSuccess(ITestResult res) {
        System.out.println(res.getMethod().getMethodName() + " PASSED !!!  \n\n");
         
    }
    
    
 
   
    public void onTestFailedButWithinSuccessPercentage(ITestResult res) {
        // TODO Auto-generated method stub
         
    }
    
 
    public void onFinish(ITestContext arg0) {
        System.out.println("----------FINISH ALL----------------\n\n");
         
    }
 
    @Override
    public void onStart(ITestContext arg0) {
        System.out.println("----------Start ALL----------------\n\n");
         
    }


	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
	}
 
	

}
