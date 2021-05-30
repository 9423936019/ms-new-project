package StepDefinition;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;

public class hooksBeforeStepAnnotation {

	@BeforeStep
	public void stepUp()
	{
		System.out.println("BeforeStep-----stepup1");
	}
	@AfterStep
	public void tearDown()
	{
		System.out.println("AfterStep------tearDown1");
	}

}
