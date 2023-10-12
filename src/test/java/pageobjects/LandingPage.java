package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
public 	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	
	By search=By.xpath("//input[@type='search']");
	
	By productName=By.xpath("//h4[normalize-space()='Strawberry - 1/4 Kg']");
	By topDeals=By.linkText("Top Deals");
	By increment=By.cssSelector(".increment");
	By add=By.xpath("//button[normalize-space()='ADD TO CART']");

public void searchItems(String name) {
	driver.findElement(search).sendKeys(name);
}
public void getsearchText() {
	driver.findElement(search).getText();
}
public String getproductName() {
	return driver.findElement(productName).getText();
}
public void SelectTopDealpage() {
	driver.findElement(topDeals).click();
}
public String getTitle() {
	return driver.getTitle();
}
public void incrementbtn(int quantity) {
	int i=quantity-1;

	while(i>0) {
	
		driver.findElement(increment).click();
		i--;
	}	
}
public void Addtocart() {
	driver.findElement(add).click();
}
}
