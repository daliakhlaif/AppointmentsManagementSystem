Feature: Patient's notes on each visit

 
Background:
 Given the following patients with the following number of visits
 | patient  |   visits  |  Notes   |
 | Ahmed    |    01     |  none    |
 | Asmaa    |    03     |  none    |
 | Ola      |    00     |  none    |


Scenario: Patient writes a note successfully
Given that the patient is logged in
When the patient  "Ahmed" arrives at the clinic
Then he can add a note on the visit 
 
Scenario: Patient can not write a note
Given that the patient is logged in
When the patient "Ola" doesn't arrive at the clinic
Then he can't add a note on the visit  