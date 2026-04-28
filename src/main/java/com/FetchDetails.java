package com;

import org.openqa.selenium.WebDriver;

public class FetchDetails{

	
	public void testOne(WebDriver driver) {
	
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.print(title);
	}
}
