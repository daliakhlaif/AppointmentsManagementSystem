Feature: System Login

@tag
Scenario: logging in with empty fields 
Given I'm in the login page 
And the email field is empty
And the password field is empty 
When I click sign in
Then I should stay in the login page 
And the message Please enter your email and password should appear

@tag1
Scenario: logging in with empty email
Given I'm in the login page 
And the email field is empty
And the password field is not empty 
When I click sign in
Then I should stay in the login page 
And the message Please enter your email

@tag2
Scenario: logging in with empty password
Given I'm in the login page 
And the email field is not empty
And the password field is empty 
When I click sign in
Then I should stay in the login page 
And the message Please enter your password

@tag3
Scenario Outline: Successful Login
Given I'm in the login page 
And the email is <email> 
And the password is <password>
When I click sign in
Then I should go to <status> page
And the message welcome <status> should appear


Examples:
| email | password | status |
| dalia.2001.kh@gmail.com | dnoife234 | admin |
| masa.34@gmail.com | otma@604 | admin |
| marah342@gmail.com | 94802@ors | admin | 
| ali24@gmail.com | pdws3499 | user |

@tag4
Scenario Outline: Wrong Email
Given I'm in the login page 
And the email is not  <email> 
And the password is <password>
When I click sign in
Then I should stay in login age
And the message wrong email address or password should appear


Examples:
| email | password | status |
| dalia.2001.kh@gmail.com | dnoife234 | admin |
| masa.34@gmail.com | otma@604 | admin |
| marah342@gmail.com | 94802@ors | admin | 
| ali24@gmail.com | pdws3499 | user |

@tag5
Scenario Outline: Wrong Password
Given I'm in the login page 
And the email is  <email> 
And the password is not <password>
When I click sign in
Then I should stay in login age
And the message wrong email address or password should appear


Examples:
| email | password | status |
| dalia.2001.kh@gmail.com | dnoife234 | admin |
| masa.34@gmail.com | otma@604 | admin |
| marah342@gmail.com | 94802@ors | admin | 
| ali24@gmail.com | pdws3499 | user |