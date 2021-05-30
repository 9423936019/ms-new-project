package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.BaseLayer.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginPageTest1 extends BaseClass{

	@Given("user on login Page")
	public void user_on_login_page() {
	  
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="OrangeHRM";
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		
	}
	//{String} means our cucumber expression
	@When("user enter valid {string} and valid {string}")
	public void user_enter_valid_and_valid(String username, String password) throws InterruptedException {
		
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
	//	driver.findElement(By.name("Submit")).click();   
	//	Thread.sleep(2000);
	}

	@Then("User is on Homepage and validate url of page and Logo")
	public void user_is_on_homepage_and_validate_url_of_page_and_logo() {
	
		String AUrl=driver.getCurrentUrl();
		String EUrl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(AUrl,EUrl);
		
		Boolean LogoStatus=driver.findElement(By.xpath("//img[@alt='OrangeHRM']")).isDisplayed();
		Assert.assertTrue(true);
	}

	@Then("Validate Title of Web Page")
	public void validate_title_of_web_page() {
	   
		String ATitle=driver.getTitle();
		String ETitle="OrangeHRM";
		Assert.assertEquals(ATitle,ETitle);
	}
}