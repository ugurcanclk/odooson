Feature: sales module automate
@sales
  Scenario:User click create button
    When the user is on the login page
    And the user enters the sales manager information
    And user is on the "Sales" page
    Given click create button
    Then create page open