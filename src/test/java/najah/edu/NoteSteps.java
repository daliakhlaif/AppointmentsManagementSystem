package najah.edu;

import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NoteSteps {
	Scanner scan = new Scanner(System.in);
	Clinic myClinic = new Clinic();
	@Given("the following patients with the following number of visits")
	public void the_following_patients_with_the_following_number_of_visits(DataTable table) {
	   List<List<String>> info = table.cells();
	   
	   ArrayList<Patient> pa = new ArrayList<Patient>();
	   
	   for(int i=1; i< info.size() ; i++) {
		   Patient p = new Patient();
		   for(int j=0; j< info.get(i).size() ; j++) {
			   
			   switch(j) {
			   case 0: p.setName(info.get(i).get(j));break;
			   case 1: p.setVisits(Integer.parseInt(info.get(i).get(j),0,2,10));break;
			   }
				
			   
		   }
		   pa.add(p);
	   }
	   myClinic.setPatients(pa);
	   
	   for(Patient pat : myClinic.getPatients())
		   System.out.println(pat);
	}
	
	@Given("that the patient is logged in")
	public void that_the_patient_is_logged_in() {
	   System.out.println("Welcome patient");
	}
	String name = null;
	@When("the patient  {string} arrives at the clinic")
	public void the_patient_arrives_at_the_clinic(String pname) {
		name = pname;
	    myClinic.getPatient(pname).setVisits(myClinic.getPatient(pname).getVisits()+1);
	}

	@Then("he can add a note on the visit")
	public void he_can_add_a_note_on_the_visit() {
	   System.out.println("Enter your note: ");
	   String n = "thank you";
	   Note note = new Note();
	   note.setAssignedPatient(myClinic.getPatient(name));
	   note.setNoteText(n);
	   note.setVisits(myClinic.getPatient(name).getVisits());
	   myClinic.getPatient(name).addNote(note);
	   
	   assertSame( myClinic.getPatient(name).getNotes().get(0) , note);
	}
	
	@When("the patient {string} doesn't arrive at the clinic")
	public void the_patient_doesn_t_arrive_at_the_clinic(String pname) {
	    name = pname;
	}

	@Then("he can't add a note on the visit")
	public void he_can_t_add_a_note_on_the_visit() {
	   assertSame(0 , myClinic.getPatient(name).getVisits());
	}
}
