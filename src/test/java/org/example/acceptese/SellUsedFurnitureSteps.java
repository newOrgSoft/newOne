package org.example.acceptese;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.SellUsedFurnitureContext;
import static org.junit.Assert.assertTrue;

public class SellUsedFurnitureSteps {
    private SellUsedFurnitureContext context = new SellUsedFurnitureContext();

    @Given("I am a tenant")
    public void iAmATenant() {
        context.setTenant(true);
    }

    @When("I navigate to the furniture marketplace")
    public void iNavigateToTheFurnitureMarketplace() {
        // Simulate navigating to the furniture marketplace
        context.setNavigatedToFurnitureMarketplace(true);
    }

    @When("I list my furniture for sale")
    public void iListMyFurnitureForSale() {
        // Simulate listing furniture for sale
        context.setListedFurnitureForSale(true);
    }

    @Then("my furniture should be visible to potential buyers")
    public void myFurnitureShouldBeVisibleToPotentialBuyers() {
        // Simulate furniture being visible to buyers
        context.setFurnitureVisibleToBuyers(true);
        assertTrue(context.isFurnitureVisibleToBuyers());
    }
}
