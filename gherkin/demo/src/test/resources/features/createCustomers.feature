@CreateCustomer
Feature: User Login
  Background: 
    Given the user is on the login page
    When the user enters a username as "achraf1hadrich@gmail.com"
    And the user enters a password as "12345678"
    And clicks on the login button
    Then the user should see a successful login message

  @ValidCredentials
  Scenario Outline: Create Customer successful
    When the user clicks on the customer button
    Then the user clicks on the new customer button
    Then the user should see Create Customer interface
    Then the user enters a customer name as "<name>"
    And the user enters a customer phone as "<phone>"
    And the user enters a customer email as "<email>"
    And the user clicks on customer gender 
    Then the user clicks a customer gender option
    Then the user clicks create  
    Then the user should see a successful create message

    Examples:
      | name     | phone   | email             |
      | ffggttrr |  12345678 |hhhffgfggh@gmail.com |

# /html/body/div[1]/div[1]/main/div/section/div/div/form/div[1]/div[1]/section/div/div/div/div[5]/div/div/div[2]/div/div/select/option[2]