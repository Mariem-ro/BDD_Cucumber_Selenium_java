package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;




import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@CucumberOptions(
		features={".//Features/CustomerFeature.feature"},
		glue="StepDefinition",
		dryRun = false,
		monochrome = true,
		tags = "@regression",
		plugin = { "pretty", "json:target/cucumber-reports/cucumber.json","html:target/cucumber-reports/cucumberreport.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//		plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
		)
public class Run extends AbstractTestNGCucumberTests{
	/*This class will be empty*/
	
	
}
