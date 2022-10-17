Feature: Edit Service

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
   
 Scenario: Edit service's provider
 	Given there is a service called  "Eyeglasses" , provider company "Linda Farrow" and price "200"
 	When I edit the service provider to "Channel"
 	Then the service provider should be editted to "Channel"
 	
Scenario: Edit service's price
 	Given there is a service called  "Eyeglasses" , provider company "Linda Farrow" and price "200"
 	When I edit the price to "300"
 	Then the price should be editted to "300"