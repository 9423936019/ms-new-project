package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features"},
		glue= {"StepDefinition"},
		monochrome=true,
		dryRun=false//
	//	tags="@EndToEnd"
		)
public class TestRunner {

}
