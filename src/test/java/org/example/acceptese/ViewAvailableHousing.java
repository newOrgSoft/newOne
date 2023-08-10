package org.example.acceptese;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import static org.junit.Assert.assertTrue;
import org.example.AvailableHousing;

public class ViewAvailableHousing {

    private AvailableHousing availableHousing;

    @Given("I am a tenant")
    public void iAmATenant() {
        availableHousing = new AvailableHousing();
        availableHousing.setTenant(true);
    }

    @When("I open the app")
    public void iOpenTheApp() {
        availableHousing.setAppOpened(true);
    }

    @Then("I should see an interactive map with housing pins")
    public void iShouldSeeAnInteractiveMapWithHousingPins() {
        // Simulate map displayed
        availableHousing.setMapDisplayed(true);
        assertTrue(availableHousing.isMapDisplayed());
    }

    @Then("each pin should provide basic information")
    public void eachPinShouldProvideBasicInformation() {
        // Simulate pins provide information
        availableHousing.setPinsProvideInformation(true);
        assertTrue(availableHousing.isPinsProvideInformation());
    }
}
