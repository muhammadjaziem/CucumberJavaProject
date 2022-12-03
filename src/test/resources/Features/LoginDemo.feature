Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is opens
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to home page

    Examples: 
      | username | password |
      | Adam     |    12345 |
      | Ariff    |    12345 |
