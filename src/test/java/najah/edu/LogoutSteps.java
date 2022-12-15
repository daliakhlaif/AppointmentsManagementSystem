package najah.edu;

import static org.junit.Assert.assertSame;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {
	
	Login log = new Login();
	@Given("that the user with username {string} and password {string} is logged in")
	public void that_the_user_with_username_and_password_is_logged_in(String name, String pass) {
	   log.setLogU(name);
	   log.setLogP(pass);
	}

	@When("the user click on log out")
	public void the_user_click_on_log_out() {
	   log.logout();
	}

	@Then("the user should return to main page")
	public void the_user_should_return_to_main_page() {
	   int res =0;
		int exp=1;
	   if((log.getLogU()== null) && (log.getLogP()==null))res = 1;
		assertSame(res, exp);
	}
}
