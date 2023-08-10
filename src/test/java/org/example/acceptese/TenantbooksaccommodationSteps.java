package org.example.acceptese;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Building;
import org.example.Main;
public class TenantbooksaccommodationSteps {

boolean flag;
	@Given("the tenant has selected  the desired housing")
	public void theTenantHasSelectedTheDesiredHousing() {
	     Building bu = new Building();
         bu.getBuildingId();
	}
	@When("the tenant clicks on  {string}")
	public void theTenantClicksOn(String string) {
		if(string.equals("book")) {
			Main.tenantDashboard();
			assertTrue(flag);
		}
		else {
			assertFalse(flag);
		}

	}
	@Then("a confirmation message is displayed for successful  booking")
	public void aConfirmationMessageIsDisplayedForSuccessfulBooking() {
		assertFalse(flag);

	}




}
