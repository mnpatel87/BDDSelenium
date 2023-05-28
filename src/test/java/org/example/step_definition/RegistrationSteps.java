package org.example.step_definition;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.RegistrationPage;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RegistrationSteps extends DriverManager {
    RegistrationPage registrationPage = new RegistrationPage();

    @When("^I click on Register button on homepage$")
    public void iClickOnRegisterButtonOnHomepage() {
        registrationPage.clickRegister();
    }

    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        registrationPage.clickRegButton();
    }

    @Then("^I should see Your Registration completed$")
    public void iShouldSeeRegistrationCompleted() {
        boolean check = registrationPage.checkRegistrationDone();
        assertTrue(check);
    }

    @And("^I should see continue button$")
    public void iShouldSeeContinueButton() {
        boolean check = registrationPage.isContinueVisible();
        assertEquals(true, check);
    }

    @When("^I enter first name \"([^\"]*)\" and last name \"([^\"]*)\"$")
    public void i_enter_Firstname_and_Lastname(String firstName, String lastName) throws Throwable {
        registrationPage.enterFirstName(firstName);
        registrationPage.enterLastName(lastName);
    }

    @When("^I enter valid email \"([^\"]*)\"$")
    public void i_enter_valid_Email(String email) throws Throwable {
        registrationPage.enterEmail(email);
    }

    @When("^I enter password \"([^\"]*)\" and confirm password \"([^\"]*)\"$")
    public void i_enter_password_and_confirm_password(String password, String confirmPassword) throws Throwable {
        registrationPage.enterRegPassword(password);
        registrationPage.enterConfirmPassword(confirmPassword);
    }

    @When("^I enter following details for registration$")
    public void i_enter_following_details_for_registration(DataTable dataTable) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        System.out.println(data);
        System.out.println(dataTable);
        //String myFirstName = data.get(0).get("firstName");
        registrationPage.enterRegistrationDetails(
                data.get(0).get("firstName"),
                data.get(0).get("lastName"),
                data.get(0).get("email"),
                data.get(0).get("password"),
                data.get(0).get("confirmPassword"));
    }
}
