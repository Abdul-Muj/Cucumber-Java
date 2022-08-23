#Parameterization concept
Feature: Test login functionality

  Scenario Outline: Check login is sucessfull with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And Clicks on Login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Ele      |    12345 |
