package basepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInitialization {
	
	private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	
	public static void setUpDriver() {
		driver.set(new ChromeDriver());
	}
	
	public static WebDriver getDriver() {
		return driver.get();
		
	}
	
	public static void removeDriver() {
		
		driver.get().quit();
		driver.remove();
	}

}
