package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(features="src/main/resources/features", 
			plugin = {"pretty"},
				
					
//				"html:target/testResult1.html"
			glue= {"com/saucedemo/steps"}
	)
	public class Testrunner extends AbstractTestNGCucumberTests {
}
