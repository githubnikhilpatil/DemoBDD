package Hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import StepDefinitions.BaseStepDefinition;
import Utilities.ScenarioContext;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberHooks extends  BaseStepDefinition {
	
	
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().clearDriverCache().setup();
		WebDriverManager.chromedriver().clearResolutionCache().setup();
		driver.set(new ChromeDriver());
		scenariocontext.set( new ScenarioContext());
		
	}
	
	

}
