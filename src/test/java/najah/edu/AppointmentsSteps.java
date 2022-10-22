package najah.edu;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AppointmentsSteps {

	Clinic myClinic = new Clinic();
	
	@Given("that the adminstrator is logged in")
	public void that_the_adminstrator_is_logged_in() {
	   System.out.println("Welcome Admin");
	}

	@Given("the clinic has the following working days, with the following working hours:")
	public void the_clinic_has_the_following_working_days_with_the_following_working_hours(DataTable clinicWorkingTimes) {
		
	    myClinic.setWorkingTimes(clinicWorkingTimes.cells());
	    
	}

	@Given("the clinic has the following doctors:")
	public void the_clinic_has_the_following_doctors(DataTable doctors) {
		
		ArrayList <Doctor> doctor = new ArrayList <Doctor> ();
		
		List<List<String>> d = doctors.cells();
		for(int i=1; i<d.size(); i++) {
			
		    Doctor doc = new Doctor();
		    
			 for(int j=0 ; j< d.get(i).size() ; j++) {
				 
				 switch(j) {
				 case 1: doc.setName(d.get(i).get(j));break;
				 case 2: doc.setDayOff(d.get(i).get(j));break;
				 case 3: doc.setSpecialty(d.get(i).get(j));break;
				 
				 }
			 }
			 doctor.add(doc);
		}
		myClinic.setDoctors(doctor);
	}
	
	@Given("the following patients")
	public void the_following_patients(DataTable patients) throws ParseException {
		ArrayList <Patient> pa = new ArrayList <Patient> ();
		List<List<String>> p = patients.cells();
	
		
         for(int i=1; i<p.size(); i++) {
			
		    Patient patient = new Patient();
		    
			 for(int j=0 ; j< p.get(i).size() ; j++) {
				 
				 switch(j) {
				 case 1: patient.setName(p.get(i).get(j));break;
				 case 2:  Date date = new SimpleDateFormat("dd/MM/yyyy").parse(p.get(i).get(j)); 
				         patient.setDOB(date);
				         break;
				 }
			 }
			 pa.add(patient);
		}
		myClinic.setPatients(pa);
	}

	@Given("the following upcoming appointments exist:")
	public void the_following_upcoming_appointments_exist(DataTable appointments) {
	     List<List<String>> a = appointments.cells();
	     
	   ArrayList <Appointment> appoint = new ArrayList<Appointment>();
	     
	     for(int i=1; i< a.size(); i++) {
				
			  Appointment app = new Appointment();
			    
				 for(int j=0 ; j< a.get(i).size() ; j++) {
					 
					 switch(j) {
					 case 0: {  
					      app.setAssignedPatient(myClinic.getPatient(a.get(i).get(j)));break;
					   }
					 case 1: {
						 Date date1 = null;
						try {
							date1 = new SimpleDateFormat("dd/MM/yyyy").parse(a.get(i).get(j));
						} catch (ParseException e) {
							
							e.printStackTrace();
						}
						 app.setAppointmentDate(date1); break;
						
					 }
					 case 2:{
						 app.setStartTime(a.get(i).get(j));break;
					 }
					 
					 case 3: {
						 app.setEndTime( a.get(i).get(j));break;
					 }
					 
					 case 4: {
						app.setAssignedDoctor(myClinic.getDoctor(a.get(i).get(j)));break;
					 }
					 }
					 appoint.add(app);
				 }
				 
			}
	     myClinic.setAppointments(appoint);
			
		
	}

	@Given("the user wants to book an appointment in {string} at the doctor {string}")
	public void the_user_wants_to_book_an_appointment_in_at_the_doctor(String date, String doctor) {
	   
	}

	@Given("the appointment starts at {string} and ends at {string}")
	public void the_appointment_starts_at_and_ends_at(String start, String end) {
	   
	}

	@When("the user tries to book the appointment")
	public void the_user_tries_to_book_the_appointment() {
	    
	}

	@Then("he should get the message {string}")
	public void he_should_get_the_message(String message) {
	    
	}

	@Given("the user wants to book an appointment on {string}")
	public void the_user_wants_to_book_an_appointment_on(String day) {
	    
	}

	@Given("the user wants to book an appointment in {string}")
	public void the_user_wants_to_book_an_appointment_in(String date) {
	
	}

	@Given("given the new patient {string} wants to book an appointment in {string}  on {string} at the doctor {string}")
	public void given_the_new_patient_wants_to_book_an_appointment_in_on_at_the_doctor(String patient, String date, String day, String doctor) {
	    
	}

	@When("I add the appointment to the record")
	public void i_add_the_appointment_to_the_record() {
	    
	}

	@Then("the patient appointment should be booked successfully")
	public void the_patient_appointment_should_be_booked_successfully() {
	   
	}

	@Then("the visits number should be equal to {string}")
	public void the_visits_number_should_be_equal_to(String visit0) {
	    
	}

	@Given("the user wants to book an appointment on {string} in {string} at the doctor {string}")
	public void the_user_wants_to_book_an_appointment_on_in_at_the_doctor(String string, String string2, String string3) {
	   
	}

	@Then("I should get the message {string}")
	public void i_should_get_the_message(String string) {
	    
	}

	@Given("the user {string} wants to delete his upcoming appointment")
	public void the_user_wants_to_delete_his_upcoming_appointment(String string) {
	    
	}

	@When("I click on delete")
	public void i_click_on_delete() {
	   
	}

	@Given("the patient {string} upcoming appointment")
	public void the_patient_upcoming_appointment(String string) {
	   
	}

	@When("I search for this patient")
	public void i_search_for_this_patient() {
	   
	}

	@Then("I should see the date {string}")
	public void i_should_see_the_date(String string) {
	   
	}

	@Then("the start time {string} , end time {string}")
	public void the_start_time_end_time(String string, String string2) {
	   
	}

	@Then("the number of visits {string}")
	public void the_number_of_visits(String string) {
	    
	}

	@Given("the doctor {string}")
	public void the_doctor(String string) {
	   
	}

	@When("I search for his upcoming appointments")
	public void i_search_for_his_upcoming_appointments() {
	   
	}

	@Then("I should see the patient {string} on {string}")
	public void i_should_see_the_patient_on(String string, String string2) {
	    
	}

	@Then("the previous visits {string}")
	public void the_previous_visits(String string) {
	    
	}

}
