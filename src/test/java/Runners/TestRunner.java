package Runners;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.cucumber.testng.Pickle;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
		features="src/test/resources/Features/order.feature",
	
		glue = {"StepDefinitions","Hooks"},
		dryRun=false
		
)

public class TestRunner 

{
	
	
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
	    return testNGCucumberRunner.provideScenarios();
	}
	
	 private TestNGCucumberRunner testNGCucumberRunner;

	    @BeforeSuite(alwaysRun=true)
	    public void setUpClass() {
	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    }
	    
	    
	    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
	    public void runCucumberTest(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
	        // Run the scenario using TestNGCucumberRunner
	        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
	    }
	    
	    
	    @AfterClass
	    public void tearDownClass() {
	        if (testNGCucumberRunner != null) {
	            testNGCucumberRunner.finish();
	        }
	    }
	    
	    

}