package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	@Before(order=1)
	public void StepUp1()
	{
		System.out.println("Before hooks----StepUp1");
	}
	@Before(order=2)
	public void StepUp2()
	{
		System.out.println("Before hooks----StepUp2");
	}
	@After(order=2)
	public void tearDown()
	{
		System.out.println("After hook----tearDown2");
	}
	@After(order=1)
	public void tearDown2()
	{
		System.out.println("After hook-----tearDown1");
	}
}
