package com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRunnerUsingTest {
	public WebDriver driver;
	
	@BeforeTest
	public void t() {
		  LaunchBrowser browser = new LaunchBrowser();
	      driver = browser.test();
	      driver.get("https://www.google.com/");
	}
	
	@Test
	public void te() {
		 System.out.println("Test Class");
	        FetchDetails details = new FetchDetails();
	        details.testOne(driver); 
	}
	
	@AfterTest
	public void tee() {
		driver.quit();
	}

}
