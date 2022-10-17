Feature: Customer Booking

Before going to the clinic, patients should book appointments according to their illness at the suitable doctor 

Background:
Given that the patient is logged in
And the clinic has the following working days, with the following working hours:
 | day         | working hours  | 
 | Sunday      | 8:00am-6:00pm  | 
 | Monday      | 8:00am-6:00pm  | 
 | Tuesday     | 9:00am-7:00pm  | 
 | Wednesday   | 9:00am-5:00pm  |
 | Thursday    | 9:00am-5:00pm  |
 
 And the each doctor has 1 day not present at the clinic:
 
 | doctor  | day       | 
 | Ali     |  Monday   |
 |Mohammed | Tuesday   |
 | Samer   | Wednesday |
 | Eyad    | Thursday  |
 
And the following upcoming appointments exist:

 | customer_id | customer_name  | appontment_date| start_time | end_time  | doctor   |  previous_visits  | Day |
 | 1           | Maher Amjad    |  10-11-2022    | 5:00pm     |  5:20pm   | mohammed |     1             |  Thursday |
 | 2           | Basema Mohammad|  10-11-2022    | 12:00pm    |  1:00pm   | ali      |     3             |  Thursday|
 | 3           | Osama Kamal    |  13-11-2022    | 12:00pm    |  12:30pm  | samer    |     0             |  Sunday     |
 
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
     
Scenario: change visit status
     When the user "Osama Kamal" arrives at the clinic 
     Then the visits number should be equal to "1" 
     
         
