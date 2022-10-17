Feature: Add service
        Actors: Admin
        
Background:
   Given that the administrator is logged in
   And I have the following services:
   | Service Name    |  Provider     | price |
   | Eyeglasses      |  Linda Farrow |  200  |
   | Laser Surgery   |  none |       1000 |
   | Lasik Surgery   |  none |   1500 |
   | Eye Exams       |  Linda Farrow | 50 |
   | Orthokeratology |  none | 2000 |
   | Blue Light Protection |  Linda Farrow |  300  |
   
   
Scenario: Add a service successfully
 	Given there is a sevice called  "sunglasses" , provider company "Linda Farrow"
 	When I add the service to the system
 	Then the service with name "sunglasses" , provider company "Linda Farrow" is contained in the system
 	

Scenario: Add a service that is already added	
 	Given there is a sevice called  "Eyeglasses" , provider company "Linda Farrow"
 	When I add the service to the system
 	Then I should see error message