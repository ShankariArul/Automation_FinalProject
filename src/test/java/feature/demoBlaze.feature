@runall
Feature: Testing the DemoBlaze functionality

  Scenario: List of steps run before each of the scenarios
    Given Open browser
    When launch Url

  @testcase1
  Scenario: HomePage functionality
    Then Verify title

  @testcase2
  Scenario: Login functionality
    And Login to account
    Then Verify greetings
    And Logout app

  @testcase3
  Scenario: Cart functionality
    And Select laptop
    Then order macbookpro
    And verify cart
