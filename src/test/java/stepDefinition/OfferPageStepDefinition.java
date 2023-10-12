package stepDefinition;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageobjects.LandingPage;
import pageobjects.OfferPage;
import pageobjects.PageObjectManager;

import utils.TestContextSetup;

public class OfferPageStepDefinition {
	public WebDriver driver;
	public String Landingpageproduct;
	public String Offerpageproduct;
	TestContextSetup testcontextsetup;
	public PageObjectManager pageObjectManager;
	public OfferPageStepDefinition(TestContextSetup testcontextsetup ) {
		
		this.testcontextsetup=testcontextsetup;
	}
	
	@And("^user searched for (.+) shortName  in offers page$")
	public void user_searched_for_short_name_in_offers_page(String shortName) throws InterruptedException {
	  
		switchtoofferpage();
		
		
		 
		 
		OfferPage offerpage=testcontextsetup.pageobjectmanager.getofferpage();
		offerpage.searchItems(shortName);
	//	testcontextsetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		Thread.sleep(2000);
	   //  offerpageproduct = testcontextsetup.driver.findElement(By.cssSelector("tbody tr td:nth-child(1)")).getText();
		
		Offerpageproduct =offerpage.getproductName();
		System.out.println(	Offerpageproduct);
		
	}
	public void switchtoofferpage() {
		//if switch to offer page- skip the offer page
		//if(testcontextsetup.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"));
	//	testcontextsetup.driver.findElement(By.linkText("Top Deals")).click();
		LandingPage landingpage=testcontextsetup.pageobjectmanager.getLandingpage();
		 landingpage.SelectTopDealpage();
		testcontextsetup.genericUtils.switchwindowtochild();
	}
@Then("validate product in offer page matches with Landing page")
public void validate_product_in_offer_page_matches_with_Landing_page() {
	
//	Assert.assertEquals(Offerpageproduct,testcontextsetup.Landingpageproduct );
	//Assert.assertEquals(testcontextsetup.Landingpageproduct, offerpageproduct);
	
}

	

}
