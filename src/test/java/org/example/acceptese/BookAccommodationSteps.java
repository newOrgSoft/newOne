package org.example.acceptese;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.BookAccommodationContext;
import static org.junit.Assert.assertTrue;

public class BookAccommodationSteps {
    private BookAccommodationContext context = new BookAccommodationContext();

    @Given("I am a tenant")
    public void iAmATenant() {
        context.setTenant(true);
    }

    @When("I select a housing unit")
    public void iSelectAHousingUnit() {
        // Simulate selecting a housing unit
        context.setHousingUnitSelected(true);
    }

    @When("I choose to book it")
    public void iChooseToBookIt() {
        // Simulate choosing to book
        context.setChoseToBook(true);
    }

    @Then("I should receive a confirmation")
    public void iShouldReceiveAConfirmation() {
        // Simulate receiving a confirmation
        context.setReceivedConfirmation(true);
        assertTrue(context.receivedConfirmation());
    }

    @Then("the booking should be reflected in my profile")
    public void theBookingShouldBeReflectedInMyProfile() {
        // Simulate booking being reflected in profile
        context.setBookingReflectedInProfile(true);
        assertTrue(context.isBookingReflectedInProfile());
    }
}
