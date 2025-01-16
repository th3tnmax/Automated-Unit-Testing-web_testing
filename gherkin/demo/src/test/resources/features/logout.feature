@LogoutSuccess
Feature: User Login
  Background: 
    Given the user is on the login page
    When the user enters a username as "achraf1hadrich@gmail.com"
    And the user enters a password as "12345678"
    And clicks on the login button
    Then the user should see a successful login message

  @ValidCredentials
  Scenario Outline: logout successful
    When the user clicks on the acount button
    Then the user clicks on the logout button
    Then the user should see a logout successful message

