package com.verifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.launcher.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_007 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test=report.startTest("TC_007");
		test.log(LogStatus.INFO, "Initializing properties file......");
		
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Opened browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url : " + childProperty.getProperty("amazonurl"));
		
		
		String expectedLink = "New Release";
		
		if(!verifyLink(expectedLink))
		{
			reportfailure("Both links are not equal");
		}
		else
		{
			reportsuccess("Both links are equal");
		}
		
		report.endTest(test);
		report.flush();
	}

	

}
