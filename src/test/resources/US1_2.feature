Feature: As a user, I should be able to log in.

  Background:For the scenarios in the feature file, user is expected to be on login page
    Given  user on the login page TryCloud

  @wip
  Scenario Outline: Verify login with valid credentials
    When user enter valid "<username>" and "<password>"
    And user click the login button
    Then verify the user should be at the dashboard page
    Examples:
      | username | password    |
      | user1    | Userpass123 |
      | user31   | Userpass123 |
      | user61   | Userpass123 |
      | user91   | Userpass123 |


  Scenario Outline: Verify user login fail with invalid credentials
    When user enter invalid "<username>" and "<password>"
    And user click the login button
    Then verify "<message>" message should be displayed
    Examples:
      | username | password    | message                     |
      | User91   | Wrong       | Wrong username or password. |
      | Wrong    | Userpass123 | Wrong username or password. |
      | Wrong    | Wrong       | Wrong username or password. |





