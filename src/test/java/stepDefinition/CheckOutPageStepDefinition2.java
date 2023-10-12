package stepDefinition;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageobjects.CheckOutPage;
import pageobjects.LandingPage;
import utils.TestContextSetup;

public class CheckOutPageStepDefinition2 {
	public WebDriver driver;
	public String Landingpageproduct;
	public String offerpageproduct;
	TestContextSetup testcontextsetup;
    public CheckOutPage checkoutpage;
	public CheckOutPageStepDefinition2(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
		this.checkoutpage=testcontextsetup.pageobjectmanager.getcheckoutpage();
	}
	@Then("verify user ability to enter promocode and place the order")
	public void verify_user_ability_to_enter_promocode_and_place_the_order() {
	
		
		Assert.assertTrue(checkoutpage.verifypromo());
		Assert.assertTrue(checkoutpage.verifyplaceorder());
		
	}
	@Then("^user processed to checkout and validate the (.+) items in checkout page$")
	public void user_processed_to_checkout_and_validate_the_str_items_in_checkout_page(String name) {
		checkoutpage.chekoutItems();
	}
}
