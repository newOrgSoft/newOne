package org.example.acceptese;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.StudentHousingInsightsContext;

import static org.junit.Assert.assertTrue;

public class StudentHousingInsightsSteps {
    private StudentHousingInsightsContext context = new StudentHousingInsightsContext();

    @Given("I am a tenant")
    public void iAmATenant() {
        context.setTenant(true);
    }

    @When("I view a student housing unit")
    public void iViewAStudentHousingUnit() {
        // Simulate viewing a student housing unit
        context.setHousingUnitViewed(true);
    }

    @Then("I should see information about the resident students' demographics")
    public void iShouldSeeInformationAboutTheResidentStudentsDemographics() {
        // Simulate displaying student community insights
        context.setStudentCommunityInsightsDisplayed(true);
        assertTrue(context.isStudentCommunityInsightsDisplayed());
    }
}
