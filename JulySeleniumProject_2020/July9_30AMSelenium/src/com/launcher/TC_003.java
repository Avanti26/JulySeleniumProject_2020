package com.launcher;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;


public class TC_003 extends BaseTest
{
	
	private static final Logger log = Logger.getLogger(TC_003.class);
	
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Initializing properties file......");
		
		launch("chromebrowser");
		log.info("Opened browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to url : " + childProperty.getProperty("amazonurl"));
		
		selectOption("amazondropdown_id","Books");
		log.info("Selected the option books by using locator : " + or.getProperty("amazondropdown_id"));
		
		typeText("amazonsearchtext_xpath","Harry Potter");
		log.info("Entered the text Harry Potter by using locator : " + or.getProperty("amazonsearchtext_xpath"));
		
		clickElement("amazonsearchbutton_class");
		log.info("Clicked on search "
				+ "button by using locator : " + or.getProperty("amazonsearchbutton_class"));
		
		
		/*WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		loc.sendKeys("Books");*/
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
		//driver.findElement(By.className("nav-input")).click();
	}

	

}
