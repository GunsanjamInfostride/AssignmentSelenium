
Feature: Checking Login functionality of the application.

Scenario: Checking Login functionalty with valid login credentials.

Given user is on login page
Then user enters username in username textfield
Then user enters password in password textfield
Then user clicks on Login button
Then user is on Home Page
