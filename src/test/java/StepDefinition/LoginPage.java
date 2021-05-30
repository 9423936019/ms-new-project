package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {

	@When("user open url")
	public void user_open_url() {
		System.out.println("user open url");
	}

	@Given("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("user enter username and password");
	}

	@Then("user in on home Page")
	public void user_in_on_home_page() {
		System.out.println("user in on home Page");
	}

	@Given("user enetr username and password")
	public void user_enetr_username_and_password() {
		System.out.println("user enetr username and password");
	}

	@Then("user is on Homepage")
	public void user_is_on_homepage() {
	    System.out.println("user is on Homepage");
	}
}
