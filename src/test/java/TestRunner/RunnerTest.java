package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	         
	       features= {"AllFeaturesFiles"},
	    	glue= {"StepDefination"},
	    	dryRun=false
	
	
)

public class RunnerTest extends AbstractTestNGCucumberTests {

}
