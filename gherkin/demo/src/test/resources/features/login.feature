@LoginSuccess
Feature: User Login

  @ValidCredentials
  Scenario Outline: Successful login
    Given the user is on the login page
    When the user enters a username as "<username>"
    And the user enters a password as "<password>"
    And clicks on the login button
    Then the user should see a successful login message

    Examples:
      | username              | password     |
      | achraf1hadrich@gmail.com | 12345678 |
      # | tomsmith  | SuperSecretPassword!   |
      

  @InvalidCredentials
  Scenario Outline: Failed login
    Given the user is on the login page
    When the user enters a username as "<username>"
    And the user enters a password as "<password>"
    And clicks on the login button
    Then the user should see a login failure message

    Examples:
      | username              | password    |
      | achraf1hadrich@gmail.com | 123456789 |
      # | invalidUser | SuperSecretPassword! |
      # | tomsmith   | WrongPassword!        |
