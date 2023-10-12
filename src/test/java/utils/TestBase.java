package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public TestBase testbase;
	public WebDriver driver;
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\resources\\global.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String url=pro.getProperty("QAUrl");
	String browser_properties = pro.getProperty("browser");
		String browser_maven = System.getProperty("browser");
 
		String browser=browser_maven!=null ? browser_maven:browser_properties;
		if(driver==null) {
			
		
		if(browser.equalsIgnoreCase("chrome") )
		{
			
		System.setProperty("webdriver.chrome.driver","C:\\chrome driver\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("firefox") )
		{
			System.setProperty("webdriver.gecko.driver","C:\\firefox brower\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
	
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		}
return driver;


		
}
}