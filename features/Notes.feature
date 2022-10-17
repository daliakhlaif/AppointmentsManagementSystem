Feature: Patient's notes on each visit

 
Background:
 Given the following patients with the following number of visits
 | customer_id |   previous_visits  |  Notes   |
 | 1           |     1              |  none    |
 | 2           |     3              |  none    |
 | 3           |     0              | none     |


Scenario: Patient writes a note successfully
Given that the patient is logged in
When the patient with id "2" arrives at the clinic
Then he can add a note on the visit 
 
Scenario: Patient can not write a note
Given that the patient is logged in
When the patient with id "3" arrives at the clinic
Then he can't add a note on the visit  

