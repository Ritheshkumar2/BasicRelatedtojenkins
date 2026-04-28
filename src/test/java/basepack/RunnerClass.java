package basepack;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Dropdownvalues;

public class RunnerClass extends WebDriverInitialization{
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		setUpDriver();
		driver=WebDriverInitialization.getDriver();
	}
	
	@Test
	public void testone() {
		driver.get("https://testautomationpractice.blogspot.com/");
		Dropdownvalues object=new Dropdownvalues(driver);
		object.dropdownvalues();
	}

	@AfterClass
	public void teardown() {
		removeDriver();
	}
}
