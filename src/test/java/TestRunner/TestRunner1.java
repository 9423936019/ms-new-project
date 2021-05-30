package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features"},
		glue= {"StepDefinition"},
		//display the output in proper reable format
		monochrome=true,
		plugin= {"html:target/abc.html","json:target/cucumberjson.json",
				"junit:target/cucumberxml.xml","pretty:target/cucumbertext.txt"},
		// to check mapping between feature file and step defination 
		dryRun=false,
		// it will check if any step is not defined in step defination file.
		strict=true
		)
public class TestRunner1 {

}			