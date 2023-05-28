@Test
Feature: login feature
  As a user
  I want to add login functionality
  So that customer can use it

  @Test1
  Scenario: Validating sign in text on login page
    Given I am on Homepage
    When I click on Login button on homepage
    Then I should see "Welcome, Please Sign In!" text
    And the URL should contain "/login"

  @Test2
  Scenario: Login with valid credentials
    Given I am on Homepage
    When I click on Login button on homepage
    When I enter valid email and valid password
    And I click on Login button on login page
    Then I should see log out button
    And I should see My Account button

  @Test3
  Scenario: Login with invalid credentials
    Given I am on Homepage
    When I click on Login button on homepage
    When I enter invalid credentials
    Then I should see Error message "Login was unsuccessful. Please correct the errors and try again. No customer account found"

# given is precondition,when is action and then is validation
#    IMPORTANCE OF PLUGINS:
# Gherkin Plugin - Tells Intellij what is, Given When Then format - Provides coding assistance for step definitions
# Cucumber Java - English language to background java language combination work - Provides coding assistance for step definitions. Adds a dedicated run/debug configuration type
# Cucumber + - The best Cucumber user experience to run, edit, print Gherkin features... and develop with Java, Kotlin, Scala...
#  Login feature - Steps missing (Undefined steps) -> How to resolve :
#  1) Go to Runcukes and run,it will give missing steps error text - Copy Paste in Login feature file the missing steps
#  2) Click for which step is missing - Click bulb - Create stepdef - Click respective location Eg. Login Steps etc (Remove pending exception if not needed
# Features (Scenarios) -> StepDef (Link locator method & Asserts) -> Pages (Locators & Action)

#  HOOKS - Before and After step
#  RunCukes - All methods for Before and After Steps of JUnit added in DriverManager
#  Dependencies - Essential for Making or running a Framework or test - JUnit, Webdriver manager, HamCrest
#  Plugins - To make things easier, organise.
