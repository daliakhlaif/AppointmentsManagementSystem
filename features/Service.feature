Feature: Add service
        Actors: Admin
        
Background:
   Given that the administrator is logged in
    And the clinic offers the following services:
   | Service Name            |  Doctor            | price | description |
   | Laser Surgery           |  Ali               |  2000 |  none       |
   | Eye Examamination       |  Mohammed          |  50   |  none       | 
   | Orthokeratology         |  Eyad              |  2000 |  none       |
   
   And in addition to extra services
  
   | Service Name          |  Provider         | price |
   | Eyeglasses            |  Linda Farrow     |  200  |
   | Blue Light Protection |  Linda Farrow     |  300  |
   
   
  
Scenario: Add a service successfully
 	Given there is a sevice called  "sunglasses" , provider  "Linda Farrow" and price "250"
 	When I add the service to the system
 	Then the concrete service is contained in the system
 	
Scenario: Add a service successfully
 	Given there is a sevice called  "Lasik Surgery" ,doctor "Mohammed" and price "2500"
 	When I add the service to the system
 	Then the medical service is contained in the system
 	
Scenario: Add a service that is already added	
 	Given there is a sevice called  "Eyeglasses" , provider  "Linda Farrow" and price "200"
 	When I add the service to the system
 	Then the concrete service isn't contained in the system
 	
 Scenario: Add a service successfully
 	Given there is a sevice called  "Eye Examamination" ,doctor "Mohammed" and price "50"
 	When I add the service to the system
 	Then the medical service isn't contained in the system
 	
 Scenario: Delete a service successfully
    Given there is a sevice called  "Laser Surgery" ,doctor "Ali" and price "2000"
 	When I delete the service from the system
 	Then the medical service should be removed	
 	
Scenario: Delete a service that doesn't exist 
 	Given there is a sevice called  "sunglasses" , provider  "Linda Farrow" and price "250"
 	When I delete the service from the system
 	Then I should get the message error 	
 	
Scenario: Edit service's provider
 	Given there is a sevice called  "Eyeglasses" , provider  "Linda Farrow" and price "200"
 	When I edit the service provider to "Channel"
 	Then the service provider should be editted to "Channel" 	
 	
Scenario: Edit service's price
 	Given there is a sevice called  "Eyeglasses" , provider  "Linda Farrow" and price "200"
 	When I edit the price to "300"
 	Then the price should be editted to "300" 	