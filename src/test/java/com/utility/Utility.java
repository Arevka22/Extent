package com.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.reports.ReportExtend;

public class Utility extends ReportExtend{
	
	
	public static String getScreenshot(WebDriver driver) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		String path = System.getProperty("user.dir")+"/FailedTestsScreenshots/"+System.currentTimeMillis()+".png";
		File destination = new File(path);	
	
		
		try {
			FileUtils.copyFile(src, destination);
			
		}catch(IOException e) {
			System.out.println("Capture Failed "+e.getMessage());
		}
		return path;
	}
	
	
	//Naveen I USE THIS
	public static String getScreenShot(WebDriver driver, String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyMMddhhmmss").format(new Date());
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String destination = System.getProperty("user.dir")+"/FailedTestsScreenshots/"+screenshotName+".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(scrFile, finalDestination);   
		return destination;
		
	}
	
	public static void takeScreenshotAtEndOfTest(String screenshotName) throws IOException {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/FailedTestsScreenshots/" + screenshotName + ".png"));
	}
	
	

}
