Feature: Registration feature
  As a user
  I want add registration functionality
  so  that customer can use it

  @Test01
  Scenario:  Registration with multiple details
    Given I am on Homepage
    When I click on Register button on homepage
    And I enter first name "Mehul" and last name "Patel"
    And I enter valid email "mnp@gmail.com"
    And I enter password "123456" and confirm password "123456"
    And I click on Register button
    Then I should see Your Registration completed
    And I should see continue button

  @Test02
  Scenario:  Registration with data table for one registration
    Given I am on Homepage
    When I click on Register button on homepage
    And I enter following details for registration
      | firstName | lastName | email         | password | confirmPassword |
      | Mehul     | Patel    | mnp@gmail.com | 123456   | 123456          |
#  And I enter first name "Mehul" and last name "Patel"
#  And I enter valid email "mnp@gmail.com"
#  And I enter password "123456" and confirm password "123456"
    And I click on Register button
    Then I should see Your Registration completed
    And I should see continue button

  @Test03
  Scenario Outline:  Registration with data table with outline
    Given I am on Homepage
    When I click on Register button on homepage
    And I enter following details for registration
      | firstName    | lastName    | email    | password    | confirmPassword    |
      | <firstName1> | <lastName1> | <email1> | <password1> | <confirmPassword1> |
#  And I enter first name "Mehul" and last name "Patel"
#  And I enter valid email "mnp@gmail.com"
#  And I enter password "123456" and confirm password "123456"
    And I click on Register button
    Then I should see Your Registration completed
    And I should see continue button

    Examples:
      | firstName1 | lastName1 | email1        | password1 | confirmPassword1 |
      | Mehul      | Patel     | mnp@gmail.com | 123456    | 123456           |
      | Mehul      | Patel     | mnp@gmail.com | 123456    | 123456           |
      | Mehul      | Patel     | mnp@gmail.com | 123456    | 123456           |
      | Mehul      | Patel     | mnp@gmail.com | 123456    | 123456           |

  @Test04
  Scenario Outline: Registration with multiple details
    Given I am on Homepage
    When I click on Register button on homepage
    And I enter first name "<firstName>" and last name "<lastName>"
    And I enter valid email "<email>"
    And I enter password "<password>" and confirm password "<confirmPassword>"
    And I click on Register button
    Then I should see Your Registration completed
    And I should see continue button
    Examples:
      | firstName | lastName | email         | password | confirmPassword |
      | Mehul     | Patel    | mnp@gmail.com | 123456   | 123456          |

