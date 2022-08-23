#After Adding Cucumber dependies in pom.xml
#we need to add cucumber plugin from eclipse marketplace
Feature: feature to test login functionality

  @Smoketest
  Scenario: Check login is sucessful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
