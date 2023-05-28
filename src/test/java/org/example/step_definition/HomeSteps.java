package org.example.step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;

public class HomeSteps extends DriverManager {

    HomePage homePage = new HomePage();

    @Given("^I am on Homepage$")
    public void i_am_on_Homepage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    }

    @When("^I click on Login button on homepage$")
    public void i_click_on_Login_button_on_homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }}