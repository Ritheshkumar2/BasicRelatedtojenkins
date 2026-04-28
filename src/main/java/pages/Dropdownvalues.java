package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdownvalues {
	
	WebDriver driver;
	
	public Dropdownvalues(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='country']//option")
	List<WebElement> val;
	
	public void dropdownvalues() {
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfAllElements(val));
		
		List<String> list=new ArrayList<>();
		
		for(WebElement ele:val) {
			list.add(ele.getText());
		}
		System.out.println(list);
	}

}
