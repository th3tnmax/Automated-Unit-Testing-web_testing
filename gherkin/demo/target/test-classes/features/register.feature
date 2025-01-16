@RegisterSuccess
Feature: User SignIn

  @ValidCredentials
  Scenario Outline: Successful signIn
    Given the user is on the Sign in page
    When clicks on the sign up button
    When the user should see a sign up page
    And the user enters a name as "<username>"
    And the user enters a email as "<email>"
    And the user enters a Password as "<password>"
    And the user enters a confirmPwd as "<confirmPwd>"
    And clicks on the signIn button
    Then the user should see a successful signIn message

    Examples:
      | username    |email                  | password     | confirmPwd  |
      |achraf     | achraf12hadrich@gmail.com | 12345678 | 12345678    |
      # | tomsmith  | SuperSecretPassword!   |

  @InvalidCredentials
  Scenario Outline: Failed signIn
    Given the user is on the Sign in page
    When clicks on the sign up button
    When the user should see a sign up page
    And the user enters a name as "<username>"
    And the user enters a email as "<email>"
    And the user enters a Password as "<password>"
    And the user enters a confirmPwd as "<confirmPwd>"
    And clicks on the signIn button
    Then the user should see a signIn failure message

    Examples:
      | username    |email                  | password     | confirmPwd  |
      |achraf     | achraf1hadrich@gmail.com | 1234567 | 1234567   |
      # | invalidUser | SuperSecretPassword! |
      # | tomsmith   | WrongPassword!        |
