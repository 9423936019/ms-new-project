package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver;

	@Given("User open Orange HRM url")
	public void user_open_orange_hrm_url() {
		System.out.println("User open Orange HRM url");
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumTesting\\chrome90\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	@When("User enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	@Then("User is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	}
	@Then("Validate url")
	public void validate_url() {
	    System.out.println(driver.getCurrentUrl());
	    driver.close();
	}
	@When("we can create new user")
	public void we_can_create_new_user() {
		System.out.println("we can create new user");
	}

	@Then("Validate newly created user")
	public void validate_newly_created_user() {
		System.out.println("Validate newly created user");
	}

	@When("here check employee status")
	public void here_check_employee_status() {
		System.out.println("here check employee status");
	}

	@When("here check Leave Status")
	public void here_check_leave_status() {
		System.out.println("here check Leave Status");
		
	}
}
