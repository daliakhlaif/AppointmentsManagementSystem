package najah.edu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	
	
     Login app;

	@Given("User opens application and goes to login page")
	public void user_opens_application_and_goes_to_login_page(){
		
	   System.out.println("User in Login page");
	   
	}

	@Given("the following users exists:")
	public void the_following_users_exists(DataTable users) {
		
		List<List<String>> userList = users.cells();
		
		app = new Login(userList);
		
		
	   
	}

	@When("The user logs in with email {string} and password  {string}")
	public void the_user_logs_in_with_email_and_password(String email, String password) {
	    
	    app.setLoginE(email);
	    
	    app.setLoginP(password);
	    System.out.println("Email: "+ email+ "  Password " +password);
	}
	
	

	@Then("User should navigate to {string} page")
	public void user_should_navigate_to_page(String page) {
	
		assertTrue(app.search() == app.getLoginE());
		
	    System.out.println("\t\t  _________________________");
		System.out.println("\t\t |                         |");
		System.out.println("\t\t |   Welcome "+ page +  "  |");
		System.out.println("\t\t |_________________________|");
	}

	

	@Then("The user should get the message wrong email or paaword")
	public void theUserShouldGetTheMessageWrongEmailOrPaaword() {
		assertTrue(app.search() != app.getLoginE());
		System.out.println("Wrong email or password");
	}

	
	@Then("The user should get the message wrong email or password")
	public void theUserShouldGetTheMessageWrongEmailOrPassword() {
		assertTrue(app.search() != app.getLoginE());
		System.out.println("Wrong email or password");
	}




	



}
