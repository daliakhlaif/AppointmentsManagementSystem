Feature: user invoice for each visit
Background: 
Given User is on invoice page
And the following services exists:

|       service                   |  price   | 
| Eye examination                 |  50      | 
| Eyeglasses                      |  200     | 
| Sunglasses                      |  500     | 
| Lenses                          |  250     | 
| Laser                           |  1000    | 
Scenario: checkout successfull 
When when the user purchases "Eye examination" 
Then user get "50"



Scenario: checkout successfull 
When The user purchases "Eye examination" and "Eyeglasses" 
Then the total price should be  "250"
