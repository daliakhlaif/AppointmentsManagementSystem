Feature: Logout

Scenario: user logging out from the system
Given that the user is logged in
When the user click on log out 
Then the user should return to main page
