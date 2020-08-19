
package com.launcher;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

public class TC_004 extends BaseTest
{
	
	public static void main(String[] args) throws Exception 
	{
		
		init();
		test = report.startTest("TC_004");
		test.log(LogStatus.INFO, "Initializing properties file......");
		
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Opened browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url : " + childProperty.getProperty("amazonurl"));
		
		selectOption("amazondropdown_id","Books");
		test.log(LogStatus.FAIL, "Selected the option books by using locator : " + or.getProperty("amazondropdown_id"));
		
		typeText("amazonsearchtext_xpath","Harry Potter");
		test.log(LogStatus.SKIP, "Entered the text Harry Potter by using locator : " + or.getProperty("amazonsearchtext_xpath"));
		
		clickElement("amazonsearchbutton_class");
		test.log(LogStatus.PASS, "Clicked on search " + "button by using locator : " + or.getProperty("amazonsearchbutton_class"));
		
		report.endTest(test);
		report.flush();
		
		
	}

	

}
