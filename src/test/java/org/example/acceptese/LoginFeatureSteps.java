package org.example.acceptese;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;	
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertFalse;


import org.example.Admin;
import org.example.User;
import org.example.Owner;
public class LoginFeatureSteps {

          Admin adm;
          Owner own;
		  
		 static User user1;
		
		static boolean flag_login;

		public LoginFeatureSteps(Admin adm1,User user2,Owner own1) {
			adm=adm1;
			user1=user2;
			own=own1;
			
		}
		
		@Given("that an admin is not logged in")
		public void that_an_admin_is_not_logged_in() {
			 flag_login=false ;
		}

		@Given("I check for the email  and pass email {string} pass {string}")
		public void i_check_for_the_email_and_pass_email_pass(String string1, String string2) {
			adm.setEmail(string1);
			adm.setPassword(string2);
			if( adm.check(string1,string2)==1) {
				 flag_login=true;
			}
			if( adm.check(string1,string2)==0) {
				 flag_login=false;
			}
		}

		@Then("the admin login")
		public void the_admin_login() {
			 assertFalse(flag_login);
		}

		@Given("that the admin is not logged in")
		public void that_the_admin_is_not_logged_in() {
			 flag_login=false ;
		}

		@Given("I check for the email  and pass {string}{string}")
		public void i_check_for_the_email_and_pass(String string1, String string2) {
			adm.setEmail(string1);
			adm.setPassword(string2);
			if( adm.check(string1,string2)==1) {
				 flag_login=true;
			}
			if( adm.check(string1,string2)==0) {
				 flag_login=false;
			}	
		}

		@Then("the admin login is  success")
		public void the_admin_login_is_success() {
			 assertTrue(flag_login);
		}

		@Then("the admin login is  Fail")
		public void the_admin_login_is_fail() {
			assertTrue(flag_login);
		}



		static boolean flag_user;
		

	@Given("that the user is not logged in")
	public void that_the_user_is_not_logged_in() {
		flag_user=false;
	}
	

	
	@Given("I chek for email and   password is {string} {string}")
	public void iChekForEmailAndPasswordIs(String string, String string2) {
		user1.email=string;
		user1.password=string2;
		if( user1.checkuser(string, string2)==1) {
			flag_user=true;

		}
		if( user1.checkuser(string,string2)==0) {
			flag_user=false;
			
		}	

	}

	@Then("the user log in succeeds")
	public void the_user_log_in_succeeds() {
		
		 assertTrue(flag_user);
	}



	@Then("the user log in fails")
	public void the_user_log_in_fails() {
		 assertTrue(!flag_user);

	}

	@Given("that the admin is logged in")
	public void that_the_admin_is_logged_in() {
		flag_login=true;
	}

	@When("the admin logs out")
	public void the_admin_logs_out() {
		flag_login=false;  
	}

	@Then("the admin is logged out")
	public void the_admin_is_logged_out() {
		assertTrue(!flag_login);
	}

	@Given("that the user is logged in")
	public void that_the_user_is_logged_in() {
		flag_user=true;
	}

	@When("the user logs out")
	public void the_user_logs_out() {
		flag_user=false;
	}

	@Then("the user is logged out")
	public void the_user_is_logged_out() {
		 assertTrue(!flag_user);
	}
	
	
	
	
	
	
	
	
	static boolean flag_owner;
	
	

	
	@Given("that the owner is not logged in")
	public void thatTheOwnerIsNotLoggedIn() {
	   
		flag_owner=false;
	}
	@Then("the owner log in fails")
	public void theOwnerLogInFails() {
		 assertTrue(!flag_owner);

	  
	}


	@Given("that the owner is logged in")
	public void thatTheOwnerIsLoggedIn() {
		flag_owner=true;
	}
	@When("the owner logs out")
	public void theOwnerLogsOut() {
		flag_owner=false;
	
	}
	@Then("the owner is logged out")
	public void theOwnerIsLoggedOut() {
		assertTrue(!flag_owner);
	}






		}
		









