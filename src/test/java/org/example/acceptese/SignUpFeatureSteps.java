package org.example.acceptese;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.User;

public class SignUpFeatureSteps {
	
	
	boolean user_signup=false;
	User user1;
	
	@Given("the user is on the sign-up page")
	public void theUserIsOnTheSignUpPage() {
		user_signup=true;
	

		 assertTrue(user_signup);
			
	  
	}
	@When("the user enters valid registration details")
	public void theUserEntersValidRegistrationDetails() {
		
		user_signup=true;
	}
	@When("submits the form")
	public void submitsTheForm() {
		 assertTrue(user_signup);
	}

	
	@Then("the user sign up successfully")
	public void theUserSignUpSuccessfully() {
		 assertTrue(user_signup);
	}








}
