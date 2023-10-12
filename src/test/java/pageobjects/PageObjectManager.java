package pageobjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	
	
	public WebDriver driver;
	public LandingPage landingpage;
	public OfferPage offerpage;
	public CheckOutPage checkoutpage;
	

public PageObjectManager(WebDriver driver) {
	
	this.driver=driver;
}
public LandingPage getLandingpage() {
	landingpage =new LandingPage(driver);
	return landingpage;
}
public OfferPage getofferpage() {
	offerpage =new OfferPage(driver);
	return offerpage;
}

public CheckOutPage getcheckoutpage() {
	checkoutpage =new CheckOutPage(driver);
	return checkoutpage ;

}
}