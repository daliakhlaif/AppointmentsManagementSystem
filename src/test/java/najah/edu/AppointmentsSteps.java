package najah.edu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentsSteps {
    
	Clinic myClinic = new Clinic();
	
	Appointment a = new Appointment();
	
	Patient p = new Patient();
	
	Doctor d = new Doctor();
	
	int r; 
	
	
	@Given("that the adminstrator is logged in")
	public void that_the_adminstrator_is_logged_in() {
	    System.out.println("Welcome Admin");
	    
	}
	@Given("the clinic works from Sunday till Thursday, from time {string} till {string}")
	public void the_clinic_works_from_sunday_till_thursday_from_time_till(String open, String close) {
		ArrayList <DayOfWeek> day = new ArrayList<DayOfWeek>();
		day.add(DayOfWeek.SUNDAY);
		day.add(DayOfWeek.MONDAY);
		day.add(DayOfWeek.TUESDAY);
		day.add(DayOfWeek.WEDNESDAY);
		day.add(DayOfWeek.THURSDAY);
	    myClinic.setWorkingTimes(day);
	    myClinic.setOpenTime(Function.geHours(open), Function.getMin(open));
	    myClinic.setCloseTime(Function.geHours(close), Function.getMin(close));
	}
	

	
	@Given("the clinic has the following doctors:")
	public void the_clinic_has_the_following_doctors(DataTable doctors) {
		
		ArrayList <Doctor> doctor = new ArrayList <Doctor> ();
		
		List<List<String>> d = doctors.cells();
		for(int i=1; i<d.size(); i++) {
			
		    Doctor doc = new Doctor();
		    
			 for(int j=0 ; j< d.get(i).size() ; j++) {
				 
				 switch(j) {
				 case 0: doc.setName(d.get(i).get(j));break;
				 case 1: {
					if(d.get(i).get(j).equals("Sunday")) {
					 doc.setDayOff(DayOfWeek.SUNDAY);
					 }else if(d.get(i).get(j).equals("Monday")) {
						 doc.setDayOff(DayOfWeek.MONDAY);
					 }else if(d.get(i).get(j).equals("Tuesday")) {
						 doc.setDayOff(DayOfWeek.TUESDAY);
					 }else if(d.get(i).get(j).equals("Wednesday")) {
						 doc.setDayOff(DayOfWeek.WEDNESDAY);
					 }else if(d.get(i).get(j).equals("Thursday")) {
						 doc.setDayOff(DayOfWeek.THURSDAY);
					 }
					
				 }
				 case 2: doc.setSpecialty(d.get(i).get(j));break;
				 
				 }
			 }
			 doctor.add(doc);
		}
		myClinic.setDoctors(doctor);
		
		/*for(Doctor d1 : myClinic.getDoctors()){
			System.out.println(d1);
		}
			*/
	}

	@Given("the following patients")
	public void the_following_patients(DataTable patients){
		ArrayList <Patient> pa = new ArrayList <Patient> ();
		List<List<String>> p = patients.cells();
	
		
         for(int i=1; i<p.size(); i++) {
			
		    Patient patient = new Patient();
		    
			 for(int j=0 ; j< p.get(i).size() ; j++) {
				 
				 switch(j) {
				 case 0: patient.setName(p.get(i).get(j));break;
				 case 1:  {
					 
					 patient.setDOB(Function.getYear(p.get(i).get(j)),Function.getMonth(p.get(i).get(j)), Function.getDay(p.get(i).get(j)));
			         break;
				 }
				         
				 }
			 }
			 pa.add(patient);
		}
		myClinic.setPatients(pa);
		for(Patient p1 : myClinic.getPatients()){
			System.out.println(p1);
		}
		
	}
	
	@Given("the following upcoming appointments exist:")
	public void the_following_upcoming_appointments_exist(DataTable appointments) {
		
		Patient p = new Patient();
		 List<List<String>> a = appointments.cells();
	     
		   ArrayList <Appointment> appoint = new ArrayList<Appointment>();
		     
		     for(int i=1; i< a.size(); i++) {
					
				  Appointment app = new Appointment();
				
				    
					 for(int j=0 ; j< a.get(i).size() ; j++) {
						 
						 switch(j) {
						 case 0: {  
							  p = myClinic.getPatient(a.get(i).get(j));
						      app.setAssignedPatient(myClinic.getPatient(a.get(i).get(j)));break;
						   }
						 case 1: {
							 app.setAppointmentDate(Function.getYear(a.get(i).get(j)), Function.getMonth(a.get(i).get(j)), Function.getDay(a.get(i).get(j))); break;
							
						 }
					
						 case 2: {
							app.setAssignedDoctor(myClinic.getDoctor(a.get(i).get(j)));break;
						 }
						 
						
						 case 3: {
								app.setStartOfAppointment(Function.geHours(a.get(i).get(j)), Function.getMin(a.get(i).get(j)));break;
							 }
						 case 4: {
								app.setEndOfAppointment(Function.geHours(a.get(i).get(j)), Function.getMin(a.get(i).get(j)));break;
							 }
						 }
						 
						 
					 }
					 p.addAppointment(app);
					 appoint.add(app); 
				}
		     myClinic.setAppointments(appoint);
		
		     for (Appointment a1 : myClinic.getAppointments()) {
		    	 System.out.println(a1);
		     }
				
	}

	
	
	@Given("given the patient {string} wants to book an appointment in {string} at the doctor {string} , the appointment starts at {string} and ends at {string}")
	public void given_the_patient_wants_to_book_an_appointment_in_at_the_doctor_the_appointment_starts_at_and_ends_at(String name, String date, String dname, String startTime, String endTime) {
        
 
		a.setAppointmentDate(Function.getYear(date),Function.getMonth(date),Function.getDay(date));
		a.setStartOfAppointment(Function.geHours(startTime), Function.getMin(startTime));
		
		
		a.setEndOfAppointment(Function.geHours(endTime), Function.getMin(endTime));
		a.setAssignedPatient( myClinic.getPatient(name));
		
		
		
		a.setAssignedDoctor(myClinic.getDoctor(dname));

		
	}
	
	
	
	@When("I add the appointment to the record")
	public void i_add_the_appointment_to_the_record() {
	  System.out.println("Adding Appointment .... ");
              
	}

	@Then("the patient appointment should be booked successfully")
	public void the_patient_appointment_should_be_booked_successfully() {
		
		r = myClinic.addAppointment(a);

		Integer actual = r;
		Integer  expected= 1;
	    assertEquals(  expected,actual);
	    System.out.println(a);
	   
	    
	}
	
	@Then("an error message should appear")
	public void an_error_message_should_appear() {
		r = myClinic.addAppointment(a);
	//	System.out.println(r);
		
		for (Appointment a1 : myClinic.getAppointments()) {
			
	    	 System.out.println(a1);
	     }
		
	    assertEquals(r , -1 );
	    
	}
	@Then("an error message should appear {string}")
	public void an_error_message_should_appear(String string) {
		r = myClinic.addAppointment(a);
		System.out.println(r);
		
		assertEquals(r,-1);
	}
    
	
    String time1 = null , time2 = null;
    LocalDate da = null;
    @Given("given the patient {string} wants to edit his\\/her appointment in {string} from {string} , {string}  to: {string} ,  {string}")
    public void given_the_patient_wants_to_edit_his_her_appointment_in_from_to(String name, String date, String time0, String time, String stime, String endtime) {
    	p = myClinic.getPatient(name);
        da = LocalDate.of(Function.getYear(date),Function.getMonth(date) , Function.getDay(date));
	     
	    time1 = stime ;
	    time2 = endtime;
    }

    
   LocalTime start; 
   LocalTime end;
   Appointment a1 = new Appointment();
	@When("I edit the appointment")
	public void i_edit_the_appointment() {
	    System.out.println("Updating appointment");
	    for(Appointment app : p.getAppointments() ) {
	    	if(app.getAppointmentDate().equals(da) && app.getAssignedPatient()==p)
	    		app.setStartOfAppointment(Function.geHours(time1),Function.getMin(time1));
	    	app.setStartOfAppointment(Function.geHours(time2),Function.getMin(time2));
	    	start = app.getAppointmentStartTime();
	    	end = app.getAppointmentEndTime();
	    	a1 = app;
	    }
	
	}

	@Then("it should be updated to the time {string} , {string}")
	public void it_should_be_updated_to_the_time(String time1, String time2) {
	   
	   
	   assertTrue(a1.getAppointmentStartTime().equals(start)&& a1.getAppointmentEndTime().equals(end));
	   
	}
	

}
