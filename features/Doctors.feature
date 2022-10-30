Feature: Manage doctors

Background: 
Given the adminstrator is logged in 
And the following Doctors personal information:

 | first name  | last name     | Email               | username   | phone number | City    |gender| Speciality            | dayoff |
 | Ali         |  Amjad        | maheram@gmail.com   | maheramjad | 7865091276   | Ramallah|  M   |  Eye & LASIK Surgeries| Monday |
 | Mohammed    |  Radwan       | m@gmail.com         | maheramjad | 7865091276   | Ramallah|  F   |   Corneal surgery     | Tuesday|


Scenario: Change doctor's speciality 
Given I want to change email for patient "Maher Amjad" to "maher.87d@gmail.com"
When I change it
Then I should see it changed to "maher.87d@gmail.com"

Scenario: Change phone number
Given I want to change phone number for patient "Maher Amjad" to "5640971245"
When I change it 
Then I should see it changed to "5640971245"

Scenario: Change city
Given I want to change city for patient "Maher Amjad" to "Nablus"
When I change it
Then I should see it changed to "Nablus"

Scenario: search for patient
Given the patient "Basema Mohammad"
When I search for this name 
Then I should see the user's first name "Basema" last name "Mohammad" date of birth "07-11-1990" gender "F" , email "m@gmail.com" ,phone number "7865091276" , and city  "Ramallah"

Scenario: add patient 
Given the patient with first name "Omar" and last name "Adel" with email address "omar123@gmail.com" ,date of birth "05-08-1980 " phone number "7865091276" ,gender "M" username "omar_a2" and city "Jenin"
When I add this patient 
Then patient "Omar Adel" is added to the list of patients

Scenario: delete patient 
Given the patient with name "Bsema Mohammad"
When I delete the patient record
Then patient "Bsema Mohammad" is deleted from the list of patients