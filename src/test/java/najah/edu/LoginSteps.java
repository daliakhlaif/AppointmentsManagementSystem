package najah.edu;


import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	 Login log = new Login();
	
	@Given("User opens application and goes to login page")
	public void user_opens_application_and_goes_to_login_page() {
		System.out.println("\t\t  ___________________________________");
		System.out.println("\t\t |                                   |");
		System.out.println("\t\t |              Login                |");		
		System.out.println("\t\t |   Enter your usernam & password   |");
		System.out.println("\t\t |___________________________________|");
	}

	@Given("the following users exists:")
	public void the_following_users_exists(DataTable users) {
		String role = null;
	    List<List<String>> u = users.cells();
	   
	    
	    ArrayList<Registration> regs = new ArrayList<Registration>();
	    
	    for(int i=1; i<u.size() ; i++) {
	    	
	    	Registration r = new Registration();
	    	
	    	for(int j=0; j< u.get(i).size(); j++) {
	    		
	    		switch(j) {
	    		case 0: r.setUserName(u.get(i).get(j));break;
	    		case 1: r.setPassword(u.get(i).get(j));break;
	    		case 2: role = u.get(i).get(j);
	    		         if(role.equals("admin"))
	    		        		r.setStatus(0);
	    		         else if(role.equals("patient"))
	    		        	 r.setStatus(2);
	    		         else if (role.equals("doctor"))	 
	    		        	 r.setStatus(1);
	    			
	    		}
	    		
	    	}
	    	regs.add(r);
	    } log.setusersList(regs);
	    	
	}
	
	@When("The user logs in with username {string} and password  {string}")
	public void the_user_logs_in_with_username_and_password(String uname, String upass) {
	   System.out.println("username: "+ uname +" password: "+ upass);
	   log.setLogU(uname);
	   log.setLogP(upass);
	}
	
	@Then("User should navigate to {string} page")
	public void user_should_navigate_to_page(String page) {
		System.out.println(" Welcome to  "+page+"page");
		int d = -1;
		if(page.equals("admin"))
    		d = 0;
     else if(page.equals("patient"))
    	d = 2;
     else if (page.equals("doctor"))	 
    	d = 1;
	   assertTrue(log.loginResultPage() == d);
	}
	
	@Then("The user should get the message {string}")
	public void the_user_should_get_the_message(String string) {
		System.out.println(string);
		assertTrue(log.loginResult() == null);
	}


}
