
Feature: Login feature

  Scenario Outline: Login feature test
    Given user is in login page
    And user enters valid <username> and <password> 
  	Then user clicks on login button

 Examples:
 |username|password|
 |standard_user|secret_sauce|