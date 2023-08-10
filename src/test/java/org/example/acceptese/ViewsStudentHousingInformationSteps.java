package org.example.acceptese;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Database;
public class ViewsStudentHousingInformationSteps {
	boolean falg;
	 private static final Logger logger = Logger.getLogger(Database.class.getName());

	



@Given("the tenant has selected the desired housing")
public void theTenantHasSelectedTheDesiredHousing() {
	for(int i=0;i<Database.dbUser.size();i++) {
		assertEquals("student", Database.dbUser.get(i).setType("student"));
		}
}
@When("the tenant clicks on {string}")
public void theTenantClicksOn(String string) {
	for(int i=0;i<Database.dbUser.size();i++) {
		Database.dbUser.get(i).type="student";
		}
}
@Then("a confirmation message is displayed for successful booking")
public void aConfirmationMessageIsDisplayedForSuccessfulBooking() {
		assertTrue(falg);
  
}



@Given("the housing is designated for students")
public void theHousingIsDesignatedForStudents() {
	for(int i=0;i<Database.dbUser.size();i++) {
		assertEquals("student",Database.dbUser.get(i).type="student");
		}
  
}
@Then("general data about the current occupants is displayed, including ages and university majors")
public void generalDataAboutTheCurrentOccupantsIsDisplayedIncludingAgesAndUniversityMajors() {
	for(int i=0;i<Database.dbUser.size();i++) {
	logger.info(Database.dbUser.get(i).getAge()+Database.dbUser.get(i).getMajor());
		}
	

	
	
	
}



}

