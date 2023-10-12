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
import utils.TestContextSetup;

public class LandindPageStepDefinition {
	public WebDriver driver;
	public String Landingpageproduct;
	public String offerpageproduct;
	TestContextSetup testcontextsetup;
	LandingPage landingpage;
	public LandindPageStepDefinition(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		 this.landingpage=testcontextsetup.pageobjectmanager.getLandingpage();
	}
	
	@Given("user is on Greencart Landing page")
	public void user_is_on_greencart_landing_page() {

	//Assert.assertTrue(landingpage.getTitle().contains("Greenkart"));
	   
	}
	@When("^user searched with shortname (.+) and extracted actual item of product$")
	public void user_searched_with_shortname_and_extracted_actual_item_of_product(String shortName) {
		//testcontextsetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		 LandingPage landingpage=testcontextsetup.pageobjectmanager.getLandingpage();
		 landingpage.searchItems(shortName);
	testcontextsetup.Landingpageproduct =landingpage.getproductName().split("-")[0].trim();
		//testcontextsetup.Landingpageproduct = testcontextsetup.driver.findElement(By.xpath("//h4[@class='product-name']")).getText().split("-")[0].trim();
	System.out.println(testcontextsetup.Landingpageproduct);
	
	}

@When("Added {string} items of the selected product to cart")
public void added_items_of_the_selected_product_to_cart(String quantity) {
	 landingpage.incrementbtn(Integer.parseInt(quantity));
	 landingpage.Addtocart();
}
}
