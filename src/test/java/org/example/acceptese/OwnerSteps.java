package org.example.acceptese;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Apartment;
import org.example.Building;
import org.example.Database;
import org.example.Main;
import org.example.Owner;
import org.example.User;

public class OwnerSteps {
	static List <Owner> dbowner   = new ArrayList <Owner> ();

	static boolean flag;
//    private static String storedOwnerEmail , storedOwnerPassword;
//	 private static final Logger logger = Logger.getLogger(Database.class.getName());
//
//	
//	
//    @Given("the owner signed up with new email and password")
//    public static void theOwnerSignedUp(String email, String password) {
//        Assert.assertTrue(email != null && !email.isEmpty());
//        Assert.assertTrue(password != null && !password.isEmpty());
//        storedOwnerEmail = email;
//        storedOwnerPassword = password;
//        assertTrue(flag);
//        
//        
//        
//    }
//    
//
//
//
//
////
////    @When("the owner enter valid information")
////    public static void theOwnerEnterValidInformation() {
////        Assert.assertTrue(storedOwnerEmail.contains("@"));
////        Assert.assertTrue(storedOwnerPassword.length() > 8);
////    }
////
////    @When("the owner enter invalid information")
////    public static void theOwnerEnterInvalidInformation(String idOrPhone) {
////        if (owner.idAndPhoneValidator(idOrPhone)) {
////            Assert.assertFalse(idOrPhone == null ||  idOrPhone.isEmpty());
////        }
////    }
////
////    @Then("the system store this owner")
////    public static void theSystemStoreThisOwner() {
////        Assert.assertTrue( storedOwnerEmail != null && !storedOwnerEmail.isEmpty());
////        Assert.assertTrue( storedOwnerPassword != null && !storedOwnerPassword.isEmpty());
////    }
////    
////
////	 @Given("the owner is logged in to the System")
////	 public void theOwnerIsLoggedInToTheSystem() {
////    	 assertTrue(flag);
////
////    	 
////	 }
////
////
////
////	 @Given("the owner has a choice list with two choices \\(add new appartment and dashboard)")
////	 public void theOwnerHasAChoiceListWithTwoChoicesAddNewAppartmentAndDashboard() {
////
////	 }
////	 @When("the owner selects {string}")
////	 public void theOwnerSelects(String string) {
////	    
////	 }
////	 @When("the system store this appartment")
////	 public void theSystemStoreThisAppartment() {
////	
////	 }
////
//
////
//
//
//
//	 @Given("the owner is logged in to the system")
//	 public void theOwnerIsLoggedInToTheSystem() {
//		 assertTrue(flag);
//	 }
//
//	 
//	 @When("the owner selects {string}")
//	 public void theOwnerSelects(String string) {
//	 }
//	 @When("the owner enter valid information")
//	 public void theOwnerEnterValidInformation() {
//		    Assert.assertTrue(storedOwnerEmail.contains("@"));
//	        Assert.assertTrue(storedOwnerPassword.length() > 8);
//	 }
//	 @When("the system store this appartment")
//	 public void theSystemStoreThisAppartment() {
//		   Assert.assertTrue( storedOwnerEmail != null && !storedOwnerEmail.isEmpty());
//	        Assert.assertTrue( storedOwnerPassword != null && !storedOwnerPassword.isEmpty());
//	 }
//	 
//
//	 @Given("add a photo with an invalid format")
//	 public void addAPhotoWithAnInvalidFormat() {
//    assertFalse(flag);
//}
//	 @Then("the system should display an error message")
//	 public void theSystemShouldDisplayAnErrorMessage() {
//	  logger.info("error");
//		 assertTrue(flag);
//	  
//	 }
//
//
//
//
//
//
//
//
//
//
//
Owner own=new Owner();

	@Given("the owner signed up")
	public void theOwnerSignedUp() {
		 User.signup(own);
	}
	




	@Then("the system store this owner")
	public void theSystemStoreThisOwner() {
		dbowner.add(own);
	}



}