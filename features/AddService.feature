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
 	