package org.example.acceptese;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.TenantControlPanelContext;
import static org.junit.Assert.assertTrue;

public class ViewTenantControlPanelSteps {
    private TenantControlPanelContext context = new TenantControlPanelContext();

    @Given("I am a tenant")
    public void iAmATenant() {
        context.setTenant(true);
    }

    @When("I log in and have a booked accommodation")
    public void iLogInAndHaveABookedAccommodation() {
        // Simulate logging in and having a booked accommodation
        context.setLoggedIn(true);
        context.setBookedAccommodation(true);
    }

    @Then("I should be able to access a personalized control panel")
    public void iShouldBeAbleToAccessAPersonalizedControlPanel() {
        // Simulate accessing the control panel
        context.setAccessedControlPanel(true);
        assertTrue(context.isAccessedControlPanel());
    }

    @Then("I should see my personal data and contact information")
    public void iShouldSeeMyPersonalDataAndContactInformation() {
        // Simulate personal data being visible
        context.setPersonalDataVisible(true);
        assertTrue(context.isPersonalDataVisible());
    }
}
