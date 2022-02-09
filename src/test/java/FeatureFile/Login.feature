Feature: Checking Login functionality of the application.

Scenario: Checking Login functionalty with valid login credentials.

Given user is on login page
Then user enters username in username textfield
Then user enters password in password textfield
Then user clicks on Login button
Then user is on Home Page


#Data Table
#Feature: Checking Login functionality of the application.

#Scenario: Checking Login functionalty with valid login credentials.

#Given user is on login page
#When enters the username and enters the password
#| username | password |
#| ad | admin |
#| Admin | admin123 |
#Then click on login button

@SmokeTest

Scenario Outline: Checking Login functionalty with valid login credentials.
Given user is on login page
Then enters "<username>" and enters the "<password>" 
Then click on login button

Examples:
| username | password |
| admin | admin |
| Admin | admin123 |