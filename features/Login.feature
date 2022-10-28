Feature: Test the login functionality
Background: 
Given User opens application and goes to login page
And the following users exists:

| username  |  password    | role    |
| daliakh   |  dnoife234   | admin   |
| ali24     |  pdws3499    | patient |
| alaa0     |  a346@88     | patient |
| mohammad  |  umie89273   | doctor  |
| sameer54  |  so2920k     | doctor  |
| ola983    |  mdw@09529   | doctor  |

Scenario: To login with valid username and valid password
When The user logs in with username "daliakh" and password  "dnoife234"
Then User should navigate to "admin" page

Scenario: To login with valid username and valid password
When The user logs in with username "ali24" and password  "pdws3499"
Then User should navigate to "patient" page

Scenario: To login with valid username and valid password
When The user logs in with username "sameer54" and password  "so2920k"
Then User should navigate to "doctor" page 

Scenario: To login with invalid username and valid password
When The user logs in with username "daliah" and password  "dnoife234"
Then The user should get the message "wrong username or password"

Scenario: To login with valid username and invalid password
When The user logs in with username "daliakh" and password  "doife234"
Then The user should get the message "wrong username or password"

  
Scenario: To login with invalid username and invalid password
When The user logs in with username "daliak" and password  "dnife234"
Then The user should get the message "wrong username or password"

















