Feature: Manage patients

Background: 
Given the adminstrator is logged in 
And the following patients exist:

| patient_id | patient_name  | Date of Birth | Email | username | phone number | City|
|  1         |  Maher Amjad  | 19-01-2000    |  maheram@gmail.com| maheramjad| 7865091276| Ramallah|
|  2        |  Basema Mohammad  | 7-11-1990    |  m@gmail.com| maheramjad| 7865091276| Ramallah|


Scenario: Change email address
Given I want to change email for patient "Maher Amjad"
When I change it to "maheramjad@gmail.com"
Then I should see the change in patient record

Scenario: Change phone number
Given I want to change phone number for patient "Maher Amjad"
When I change it to "5640971245"
Then I should see the change in patient record

Scenario: Change city
Given I want to change city for patient "Maher Amjad"
When I change it to "Nablus"
Then I should see the change in patient record

Scenario: search for patient
Given the user "Basema Mohammad"
When I search for this name 
Then I should see the user's date of birth, email ,phone number, and city

Scenario: add patient 
Given the user "Omar Adel" with email address "omar123@gmail.com" ,date of birth "5-08-1980 " phone number "0975564339" , username "omar_a2" and city "Jenin"
When I add this patient 
Then patient should be added to the list of patients
