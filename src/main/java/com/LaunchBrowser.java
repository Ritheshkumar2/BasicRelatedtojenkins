package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LaunchBrowser {
	
	public WebDriver driver;
	public WebDriver test() {
		
		driver =new ChromeDriver();
		return driver;
	
	}

}
