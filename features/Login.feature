Feature: Test the login functionality
Background: 
Given User opens application and goes to login page
And the following users exists:

|         email           |   password   | role    |
| dalia.2001.kh@gmail.com |  dnoife234   | admin   |
| masa.34@gmail.com       |  otma@604    | admin   |
| marah342@gmail.com      |  94802@ors   | admin   | 
| ali24@gmail.com         |  pdws3499    | patient |
| alaa09@gmail.com        |  a346@88     | patient |
| mohammad.22@gmail.com   |  umie89273   | doctor  |
| sameer@gmail.com        |  so2920k     | doctor  |
| ola983@gmail.com        |  mdw@09529   | doctor  |

Scenario: To login with valid email and valid password
When The user logs in with email "dalia.2001.kh@gmail.com" and password  "dnoife234"
Then User should navigate to "admin" page

Scenario: To login with valid email and valid password
When The user logs in with email "alaa09@gmail.com " and password  "a346@88"
Then User should navigate to "patient" page

Scenario: To login with valid email and invalid password
When The user logs in with email "dalia.2001.kh@gmail.com" and password  "090890"
Then The user should get the message wrong email or paaword 

Scenario: To login with invalid email and valid password
When The user logs in with email "dalia.kh@gmail.com" and password  "dnoife234"
Then The user should get the message wrong email or paaword

Scenario: To login with invalid email and invalid password
When The user logs in with email "dalia.kh@gmail.com" and password  "090890"
Then The user should get the message wrong email or password

  
Scenario: To login with valid email and valid password
When The user logs in with email "sameer@gmail.com" and password  "so2920k"
Then User should navigate to "doctor" page


















