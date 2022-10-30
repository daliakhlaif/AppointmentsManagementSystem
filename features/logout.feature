Feature: Logout

Scenario: user logging out from the system
Given that the user with username "Asma23" and password "0987223" is logged in 
When the user click on log out 
Then the user should return to main page
