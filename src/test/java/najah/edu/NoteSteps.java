package najah.edu;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Scanner;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class NoteSteps {
	

	       Note pa;
		@Given("the following patients with the following number of visits")
		public void theFollowingPatientsWithTheFollowingNumberOfVisits( DataTable patients) {
		   
			 List<List<String>> patientsnote = patients.cells();
				
				pa = new Note(patientsnote);
		}
		@Given("that the patient is logged in")
		public void thatThePatientIsLoggedIn() {
			System.out.println("patient logged in "); 
		}
		@When("the patient with id {string} arrives at the clinic")
		public void thePatientWithIdArrivesAtTheClinic(String id) {
		   pa.setCustomer_id(id);
			
		}
		@Then("he can add a note on the visit")
		public void heCanAddANoteOnTheVisit() {
			System.out.println("please enter your note"); 
			Scanner scanner = new Scanner(System.in) ;
			String data = scanner.nextLine();
			pa.setNotes(data);
			assertTrue(pa.getNotes() != "none");
			System.out.println(pa.getNotes());
			
		}

	    @Then("he can't add a note on the visit")
		public void heCanTAddANoteOnTheVisit() {
			System.out.println("you cant enter a note"); 

			assertTrue(pa.getNotes() != "none");
		}



	
}
