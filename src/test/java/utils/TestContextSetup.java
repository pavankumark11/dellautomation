package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageobjects.PageObjectManager;



public class TestContextSetup {
	public TestBase testbase;
	public WebDriver driver;
	public String Landingpageproduct;
    public GenericUtils genericUtils;
	public PageObjectManager pageobjectmanager;
	public TestContextSetup() throws IOException {
		 testbase=new  TestBase();
		pageobjectmanager=new PageObjectManager(testbase.WebDriverManager());
		genericUtils =new GenericUtils(testbase.WebDriverManager());
	}
}
