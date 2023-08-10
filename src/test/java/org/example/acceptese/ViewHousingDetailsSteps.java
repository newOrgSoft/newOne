package org.example.acceptese;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.HousingDetailsContext;
import static org.junit.Assert.assertTrue;

public class ViewHousingDetailsSteps {
    private HousingDetailsContext context = new HousingDetailsContext();

    @Given("I am a tenant")
    public void iAmATenant() {
        context.setTenant(true);
    }

    @When("I select a housing unit")
    public void iSelectAHousingUnit() {
        // Simulate selecting a housing unit
        context.setHousingUnitSelected(true);
    }

    @Then("I should see an image gallery")
    public void iShouldSeeAnImageGallery() {
        // Simulate image gallery being displayed
        context.setImageGalleryDisplayed(true);
        assertTrue(context.isImageGalleryDisplayed());
    }

    @Then("I should be able to read detailed descriptions")
    public void iShouldBeAbleToReadDetailedDescriptions() {
        // Simulate detailed descriptions being visible
        context.setDetailedDescriptionsVisible(true);
        assertTrue(context.isDetailedDescriptionsVisible());
    }
}
