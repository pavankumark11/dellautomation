package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failed_scenarios.txt",glue="stepDefinition",monochrome=true,


plugin={"html:target/cucumber.html","json:target/cucumber.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
      })
		

		

public class FailedTestNgRunner2 extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel=true)
	public Object [][] scenarios()
	{
		return super.scenarios();
	}
}
//" html:target/cucumber.html" ,"json:target/cucumber.json",

//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"