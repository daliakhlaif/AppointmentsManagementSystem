package najah.edu;

import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	
	
     MyApp app = new MyApp();

	@Given("User opens application and goes to login page")
	public void user_opens_application_and_goes_to_login_page(){
		
	   System.out.println("User in Login page");
	
	}

	@Given("the following users exists:")
	public void the_following_users_exists(DataTable users) {
		
		List<List<String>> userList = users.asLists(String.class);
		
		app.usersList = userList;
		
	   
	}

	@When("The user logs in with email {string} and password  {string}")
	public void the_user_logs_in_with_email_and_password(String email, String password) {
	    app.login(email, password);
		
	}
	
	

	@Then("User should navigate to {string} page")
	public void user_should_navigate_to_page(String page) {
	    app.page(page);
	    
	}

	@Then("The user should get the message wrong email or password")
	public void the_user_should_get_the_message_wrong_email_or_paaword() {
		 System.out.println("wrong email or paaword");
	   
	}
   
	



}
