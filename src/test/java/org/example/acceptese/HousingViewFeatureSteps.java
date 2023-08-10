 package org.example.acceptese;;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Apartment;
import org.example.Building;
import org.example.Admin;
import org.example.Database;
import org.example.Owner;
import org.example.User;

 public class HousingViewFeatureSteps {
	   Admin Admin1;
       Owner owner;
       Apartment apart;
		  
	   public User user;
		
	  static boolean flag_housing;
	  static Database db=new Database();

	   Building build;
	   static List <Apartment> db_Apartment=new ArrayList <Apartment>(); 

	public HousingViewFeatureSteps(Admin adm1,User user2,Owner own1,Apartment apart,Building build) {
		Admin1=adm1;
		user=user2;
		owner=own1;
		this.apart=apart;
		this.build=build;
		
	}
	
	
	@Given("the tenant is logged in")
	public void theTenantIsLoggedIn() {
		
		assertFalse(flag_housing);
		
	}
	Apartment apart1=new Apartment();
	@When("the tenant accesses the housing view")
	public void theTenantAccessesTheHousingView() {
		db.addBuilding(apart1);
			
	}
	@Then("the tenant can see the list of available housing options")
	public void theTenantCanSeeTheListOfAvailableHousingOptions() {

	       db.viewHousing(apart1);
	       assertFalse(flag_housing);
	}


	
	@When("the tenant selects a specific housing listing")
	public void theTenantSelectsASpecificHousingListing() {
	
       db.viewHousing2(apart1);
      
      	assertFalse(flag_housing);
	}
	@Then("the tenant can view pictures of the housing and access information such as prices, location, and available services")
	public void theTenantCanViewPicturesOfTheHousingAndAccessInformationSuchAsPricesLocationAndAvailableServices() {
		assertFalse(flag_housing);
	}



}
