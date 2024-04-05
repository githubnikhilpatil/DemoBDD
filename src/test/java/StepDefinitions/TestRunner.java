package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\nikhi\\DemoBDD\\DemoBDD\\src\\test\\resources\\Features\\order.feature"
		,glue = {"StepDefinitions"}
		
		,plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
				
		
		//,plugin = {"pretty","html:target/cucumber-reports/reports_html.html"}
)
public class TestRunner {

}