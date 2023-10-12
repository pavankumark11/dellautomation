package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

	
	public 	WebDriver driver;
	public OfferPage(WebDriver driver) {
		this.driver=driver;
	}

	
	By search=By.xpath("//input[@type='search']");
	By productName=By.cssSelector("tbody tr td:nth-child(1)");
	

public void searchItems(String name) {
	driver.findElement(search).sendKeys(name);
}
	
	public String getproductName() {
		return driver.findElement(productName).getText();
	}
	
}
