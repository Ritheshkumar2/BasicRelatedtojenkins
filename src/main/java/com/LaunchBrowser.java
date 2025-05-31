package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class LaunchBrowser {
	
	public WebDriver driver;
	public void test() {
		
		driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println("=="+driver.getCurrentUrl());
		
		driver.close();
	}

}
