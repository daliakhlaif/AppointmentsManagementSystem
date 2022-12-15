package najah.edu;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagePatientsSteps {
	

	Clinic myClinic = new Clinic();
	String  s = null , email = null;
	
	@Given("the adminstrator is logged in")
	public void the_adminstrator_is_logged_in() {
	   System.out.println("Welcome Admin");
	}
    
	@Given("the following patients personal information :")
	public void the_following_patients_personal_information(DataTable pinfo) {
		
	   List<List<String>> info = pinfo.cells();
	   
	   ArrayList <Patient> patients = new ArrayList<Patient>();
	   
	   for(int i=1; i< info.size() ; i++) {
		   Patient p = new Patient();
			Registration r = new Registration();
			r.setStatus(2);
			p.setAssociatedReg(r);
			
		   for(int j=0; j< info.get(i).size() ; j++) {
			   
			   
				
			   switch(j) {
			   
			   case 0: p.setFirstName(info.get(i).get(j));break;
			   case 1: p.setLastName(info.get(i).get(j)); p.setName( info.get(i).get(j-1)+" "+ p.getLastName());break;
			   case 2: p.setDOB(Test.getYear(info.get(i).get(j)), Test.getMonth(info.get(i).get(j)), Test.getDay(info.get(i).get(j)));break;
			   case 3: p.getAssociatedReg().setEmail(info.get(i).get(j));break;
			   case 4: p.getAssociatedReg().setUserName(info.get(i).get(j));break;
			   case 5: p.setPhone(info.get(i).get(j));break;
			   case 6: p.setAddress(info.get(i).get(j));;break;
			   case 7: p.setGender(info.get(i).get(j));break;
			   
			   }
			   
		   }
		   patients.add(p);
	   }
	   myClinic.setPatients(patients);
	   for(Patient pa: myClinic.getPatients())
		   System.out.println(pa);
	}
	
	
	String res = null;
	@Given("I want to change email for patient {string} to {string}")
	public void i_want_to_change_email_for_patient_to(String pname, String e) {
		myClinic.getPatient(pname).getAssociatedReg().setEmail(e);
	
        res = myClinic.getPatient(pname).getAssociatedReg().getEmail(); 
	}
	
	@When("I change it")
	public void i_change_it() {
	  System.out.println("Adding changes.....");
	}

	@Then("I should see it changed to {string}")
	public void i_should_see_it_changed_to(String change) {
	    assertEquals(res,change);
	}

	@Given("I want to change phone number for patient {string} to {string}")
	public void i_want_to_change_phone_number_for_patient_to(String pname, String phone) {
		myClinic.getPatient(pname).setPhone(phone);
		
        res = myClinic.getPatient(pname).getPhoneNo(); 
	}
	@Given("I want to change city for patient {string} to {string}")
	public void i_want_to_change_city_for_patient_to(String pname, String city) {
         myClinic.getPatient(pname).setAddress(city);
		
        res = myClinic.getPatient(pname).getAddress();
	}
	String patientname = null;
	@Given("the patient {string}")
	public void the_patient(String pname) {
	    patientname = pname;
	}
	Patient p = new Patient();
	@When("I search for this name")
	public void i_search_for_this_name() {
		p = myClinic.getPatient(patientname);
		 System.out.println("Searching for patient .....");
	}
	
	@Then("I should see the user's first name {string} last name {string} date of birth {string} gender {string} , email {string} ,phone number {string} , and city  {string}")
	public void i_should_see_the_user_s_first_name_last_name_date_of_birth_gender_email_phone_number_and_city(String f, String l, String dob, String g, String e, String ph, String c) {
		  
		
		LocalDate d = LocalDate.of(Test.getYear(dob), Test.getMonth(dob), Test.getDay(dob));
	   assertTrue((p.getFirstName().equals(f)) && (p.getLastName().equals(l))&&(p.getDOB().equals(d)) && (p.getGender().equals(g)) && (p.getPhoneNo().equals(ph))&& p.getAssociatedReg().getEmail().equals(e));             
	}
	Patient pa = new Patient();
	@Given("the patient with first name {string} and last name {string} with email address {string} ,date of birth {string} phone number {string} ,gender {string} username {string} and city {string}")
	public void the_patient_with_first_name_and_last_name_with_email_address_date_of_birth_phone_number_gender_username_and_city(String fname,String lname, String e, String dob, String ph, String g, String uname, String c) {
	   pa.setFirstName(fname);pa.setLastName(lname);
	   pa.setName(fname+ " "+lname);pa.setAddress(c);pa.setGender(g);pa.setDOB(Test.getYear(dob),Test.getMonth(dob), Test.getDay(dob));pa.setPhone(ph);
	   Registration reg = new Registration();
	   reg.setStatus(2);reg.setEmail(e);reg.setUserName(uname);pa.setAssociatedReg(reg);
	   
	}
	@When("I add this patient")
	public void i_add_this_patient() {
		System.out.println("Adding patient .....");
		myClinic.addPatient(pa);
	}
	
	@Then("patient {string} is added to the list of patients")
	public void patient_is_added_to_the_list_of_patients(String string) {
		assertNotNull(myClinic.getPatient(string));
	}
	
	@Given("the patient with name {string}")
	public void the_patient_with_name(String name) {
	  s = name;  
	}
	@When("I delete the patient record")
	public void i_delete_the_patient_record() {
	 for(  int i=0; i< myClinic.getPatients().size() ; i++) {
		 if(myClinic.getPatients().get(i).getName().equals(s)) {
			 myClinic.getPatients().remove(i);
		 }
	 }
	}
	
	@Then("patient {string} is deleted from the list of patients")
	public void patient_is_deleted_from_the_list_of_patients(String string) {
	    assertNull(myClinic.getPatient(s) );
	}
}

