Feature: Delete Service

Background:
Given that the administrator is logged in
And I have the following services:

   | Service Name    |  Provider     | price |
   | Eyeglasses      |  Linda Farrow |  200  |
   | Laser Surgery   |  none         |    1000 |
   | Lasik Surgery   |  none         |   1500 |
   | Eye Exams       |  Linda Farrow | 50 |
   | Orthokeratology |  none         | 2000 |
   | Blue Light Protection |  Linda Farrow |  300  |
   
   
Scenario: Delete a service successfully
 	Given there is a service called  "Eyeglasses" , provider company "Linda Farrow" and price "200"
 	When I delete the service from the system
 	Then the service with name "Eyeglasses" , provider company "Linda Farrow" and price "200" should be removed
 	
 	
Scenario: Delete a service that doesn't exist 
 	Given there is a service called  "sunglasses" , provider company "Linda Farrow" and price "250"
 	When I delete the service from the system
 	Then I should get the message error	