Feature: Book An Appointment

Before going to the clinic, patients should book appointments according to their illness at the suitable doctor 

Background:
Given that the adminstrator is logged in
And the clinic works from Sunday till Thursday, from time "08:00" till "18:00"

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
 |Sara Sameer      |  04-11-1989 |
 
And the following upcoming appointments exist:

  | patient_name   | appontment_date  | doctor   | start_time  | end_time |
  | Maher Amjad    |  10-11-2022      | Mohammed |   09:00     | 09:20    | 
  | Basema Mohammad|  08-12-2022      | Ali      |   12:00     | 13:00    |
  | Osama Kamal    |  13-11-2022      | Samer    |   12:00     | 12:30    |
 
 
   
Scenario: Booking Appointment Successfully
      Given given the patient "Sara Sameer" wants to book an appointment in "08-01-2023" at the doctor "Ali" , the appointment starts at "17:15" and ends at "17:30"
      When I add the appointment to the record 
      Then the patient appointment should be booked successfully
 
Scenario: Schedueling Conflict
      Given given the patient "Sara Sameer" wants to book an appointment in "10-11-2022" at the doctor "Mohammed" , the appointment starts at "09:15" and ends at "09:30"
      When I add the appointment to the record 
      Then an error message should appear  

Scenario: Booking on Unavailable Day
      Given given the patient "Sara Sameer" wants to book an appointment in "24-12-2022" at the doctor "Ali" , the appointment starts at "17:15" and ends at "17:30"
      When I add the appointment to the record 
      Then an error message should appear "this day isn't available"  
      
Scenario: Booking on Unavailable time
      Given given the patient "Sara Sameer" wants to book an appointment in "08-12-2022" at the doctor "Ali" , the appointment starts at "07:15" and ends at "08:00"
      When I add the appointment to the record 
      Then an error message should appear "this time isn't available"    
      
Scenario: Booking on Unavailable Doctor Day
      Given given the patient "Sara Sameer" wants to book an appointment in "24-12-2022" at the doctor "Eyad" , the appointment starts at "07:15" and ends at "08:00"
      When I add the appointment to the record 
      Then an error message should appear "Doctor isn't available"            

Scenario: Invalid Date
      Given given the patient "Sara Sameer" wants to book an appointment in "08-12-2021" at the doctor "Ali" , the appointment starts at "07:15" and ends at "08:00"
      When I add the appointment to the record 
      Then an error message should appear "invalid input" 

Scenario: Schedueling Conflict
      Given given the patient "Sara Sameer" wants to book an appointment in "10-11-2022" at the doctor "Mohammed" , the appointment starts at "08:50" and ends at "09:10"
      When I add the appointment to the record 
      Then an error message should appear 
      
Scenario: Schedueling Conflict
      Given given the patient "Sara Sameer" wants to book an appointment in "10-11-2022" at the doctor "Mohammed" , the appointment starts at "09:10" and ends at "09:30"
      When I add the appointment to the record 
      Then an error message should appear  
           

      
Scenario: Edit Appointment 
      Given given the patient "Basema Mohammad" wants to edit his/her appointment in "08-12-2022" from "12:00" , "13:00"  to: "13:00" ,  "14:00"
      When I edit the appointment  
      Then it should be updated to the time "13:00" , "14:00"    
