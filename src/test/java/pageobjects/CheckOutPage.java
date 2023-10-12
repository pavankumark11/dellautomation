package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
public 	WebDriver driver;
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
	}

	
	By cartbag=By.xpath("//img[@alt='Cart']");
	
	By processedtocheckout=By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");
	By promobtn=By.xpath("//button[@class='promoBtn']");
	By placeorder=By.xpath("//button[text()='Place Order']");
	
	

public void chekoutItems() {
	driver.findElement(cartbag).click();
	driver.findElement(processedtocheckout).click();
	
}
public boolean verifypromo() {
	 return driver.findElement(promobtn).isDisplayed();
	
	
}
public boolean verifyplaceorder() {
	 return driver.findElement(placeorder).isDisplayed();
}
}