package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseLayer.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks1 extends BaseClass  {
	
	@Before
	public void setup()
	{
		
		BaseClass.initialiazation();
	}
	@After
	public void tearDown()
	{
		driver.close();
	}
}
