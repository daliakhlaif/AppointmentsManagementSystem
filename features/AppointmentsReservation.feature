Feature: Book An Appointment

Before going to the clinic, patients should book appointments according to their illness at the suitable doctor 

Background:
Given that the adminstrator is logged in
And the clinic has the following working days, with the following working hours:

 | day         | opens    | closes   |
 | Sunday      | 08:00 AM | 06:00 PM |
 | Monday      | 08:00 AM | 06:00 PM |
 | Tuesday     | 09:00 AM | 07:00 PM |
 | Wednesday   | 09:00 AM | 05:00 PM |
 | Thursday    | 09:00 AM | 05:00 PM |
 
 And the clinic has the following doctors:
 
 | Name     |  Day-Off  | speciality                  |
 |  Ali     |  Monday   | Eye & LASIK Surgeries       |
 | Mohammed | Tuesday   | Corneal surgery and LASIK   |
 | Samer    | Wednesday | Retinal and vitreous surgery|
 |  Eyad    | Thursday  | Ophthalmology               |
 
 And the following patients
 
 |patient_name     |  DOB        | 
 |Maher Amjad      |  09-04-1990 |
 |Basema Mohammad  |  13-10-2000 |
 |Osama Kamal      |  03-09-1980 |
 
And the following upcoming appointments exist:

  | patient_name   | appontment_date| start_time  | end_time   | doctor   |  previous_visits  |  
  | Maher Amjad    |  10-11-2022    | 05:00 PM    | 05:20 PM   | mohammed |     1             |  
  | Basema Mohammad|  10-11-2022    | 12:00 PM    | 01:00 PM   | ali      |     3             | 
  | Osama Kamal    |  13-11-2022    | 12:00 PM    | 12:30 PM   | samer    |     0             |
 
 Scenario: scheduling conflict
      Given the user wants to book an appointment in "10-11-2022" at the doctor "mohammed"
      And the appointment starts at "5:15pm" and ends at "5:30pm"
      When the user tries to book the appointment 
      Then he should get the message "this time is not available, choose another one" 
      
      
 Scenario: booking on an unavailable day 
      Given the user wants to book an appointment on "Saturday"
      And the appointment starts at "10:10am" and ends at "10:30am"
      When the user tries to book the appointment 
      Then he should get the message "not available on this day"     
      
 Scenario: booking on an unavailable time
      Given the user wants to book an appointment in "13-11-2022"
      And the appointment starts at "8:00am" and ends at "8:30am"
      When the user tries to book the appointment 
      Then he should get the message "not available on this time"     
      
Scenario: booking on an appointment for new patients successfully
      Given given the new patient "sara sameer" wants to book an appointment in "8-12-2022"  on "Thursday" at the doctor "ali"
      And the appointment starts at "9:00am" and ends at "9:30am"
      When I add the appointment to the record 
      Then the patient appointment should be booked successfully
      And  the visits number should be equal to "0" 
      
Scenario: booking appointment when doctor not availabe
     Given the user wants to book an appointment on "Thursday" in "10-12-2022" at the doctor "Eyad"
     And the appointment starts at "9:00am" and ends at "9:30am"
     When I add the appointment to the record
     Then I should get the message "doctor isn't available on this day"

Scenario: delete an appointment
     Given the user "Maher Amjad" wants to delete his upcoming appointment
     When I click on delete 
     Then I should get the message "appointmet deleted"
     
Scenario: search for patient appointment time
     Given the patient "Maher Amjad" upcoming appointment
     When I search for this patient  
     Then I should see the date "10-11-2022"
     And the start time "5:00pm" , end time "5:20pm"
     And  the number of visits "1"
     
Scenario: view a doctor's appointments list
     Given the doctor "mohammed"
     When I search for his upcoming appointments 
     Then I should see the patient "Maher Amjad" on "10-11-2022"
     And the start time "5:00pm" , end time "5:20pm" 
     And the previous visits "1"
 
       
      
      