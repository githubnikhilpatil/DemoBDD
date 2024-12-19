package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Utilities.ScenarioContext;

public class BaseStepDefinition {
	
	public static ThreadLocal<WebDriver> driver= new ThreadLocal<WebDriver>();
	public static ThreadLocal<ScenarioContext> scenariocontext = new ThreadLocal<ScenarioContext>();


}
