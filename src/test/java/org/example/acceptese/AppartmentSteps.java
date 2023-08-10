package org.example.acceptese;

import static org.example.User.*;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;
import java.util.logging.Logger;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Apartment;
import org.example.Building;
import org.example.Admin;
import org.example.Main;
import org.example.Owner;
import org.example.User;
public class AppartmentSteps {
    static boolean b = false;
    static boolean flag;
    
   

	Owner own=new Owner();
    @Given("the Owner is logged in to the system with email and password")
    public void theOwnerIsLoggedInToTheSystemWithEmailAndPassword() {
    
Owner.checkOwner(own.email, own.getPassword());
    }




    @Given("the Owner is logged in to the System")
    public void theOwnerIsLoggedInToTheSystem() {
       User.signup(own);
       
 	 

    }


    @Then("the system should read a new input")
    public void theSystemShouldReadANewInput() {
       // Assert.assertTrue(Main.addNewApartmentChoice); 

    }



   



    @Given("the Owner enter invalid numeric input")
    public void theOwnerEnterInvalidNumericInput() {
        // Write code here that turns the phrase above into concrete actions
        //Assert.assertTrue(Main.addNewApartmentChoice); 
    }


    

    @Given("the dashboard will be printed")
    public void theDashboardWillBePrinted() {
    	Main.tenantDashboard();
    }




  
    @Given("the Owner has a choice list with two choices \\(add new appartment and dashboard)")
    public void theOwnerHasAChoiceListWithTwoChoicesAddNewAppartmentAndDashboard() {
        
    }
    @When("the Owner selects {string}")
    public void theOwnerSelects(String string) {
      if(string.equals("add")) {
    	  Apartment.addApartment();
      }
      else
    	  Main.tenantDashboard();
    }
    @When("the system store this appartment")
    public void theSystemStoreThisAppartment() {
    
    }






    @When("the Owner selects add new apartment")
    public static void theOwnerSelectsAddNewApartment() {
        Assert.assertTrue(Main.addNewApartmentChoice); 
    }
 
    @And("add a photo with an invalid format")
    public static void addAPhotoWithAnInvalidFormat() {
        Assert.assertFalse(flag);
    }

    @And("enter invalid numeric input")
    public static void enterInvalidNumericInput(String s) {
        Assert.assertFalse(Owner.digitsValidator(s));
    }
         
    @And("enter invalid yesNo input")
    public static void enterInvalidYesNoInput(String s) {
        Assert.assertFalse(Owner.yesNoValidator(s));
    }       
    
    @And("the Owner enter valid information")
    public static void theOwnerEnterValidInformation() {
        Assert.assertTrue(Main.validInformation = true );
    }    
    


    @Then("the system should display an error message")
    public void theSystemShouldDisplayAnErrorMessage() {
    	Assert.assertFalse(flag);
    }



    @When("the Owner selects Dashboard")
    public static void theOwnerSelectsDashboard() {
        Assert.assertTrue(Main.dashboardChoice= true );
    }

   @When("the Owner selects modify")
    public static void theOwnerSelectsModify() {
       Assert.assertTrue(Main.modifyChoice= true );
    }   












}






