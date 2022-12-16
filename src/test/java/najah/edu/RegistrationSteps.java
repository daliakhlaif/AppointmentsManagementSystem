package najah.edu;

import static org.junit.Assert.assertEquals;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
	
	Registration r = new Registration();
	String pass1 = null , pass2 = null , e= null , phone = null;
	
	@Given("I am on the registeration page")
	public void i_am_on_the_registeration_page() {
		System.out.println("\t\t  ___________________________________");
		System.out.println("\t\t |                                   |");
		System.out.println("\t\t |            Register               |");		
		System.out.println("\t\t |      Fill your information        |");
		System.out.println("\t\t |___________________________________|");
	}
	
	@When("I fill in the following:")
	public void i_fill_in_the_following(DataTable regInfo) {
	    List<List<String>> reg = regInfo.cells();
	    
	    
	    for(int i =1; i< reg.size(); i++) {
	    	for(int j=1; j<reg.get(i).size() ; j++) {
	    		switch(i) {
	    		case 1:  r.setUserName(reg.get(i).get(j));break;
	    		case 2:  r.setGender(reg.get(i).get(j));break;
	    		case 3:  r.setEmail(reg.get(i).get(j));;break;
	    		case 4:  pass1 = reg.get(i).get(j);break;
	    		case 5:  pass2 = reg.get(i).get(j);break;
	    		case 6: r.setAddress(reg.get(i).get(j));break;
	    		case 7: phone = reg.get(i).get(j);break;
	    		}
	    	}
	    }
	}
	
	@When("I press {string}")
	public void i_press(String string) {
	    System.out.println("Loading....");
	}
	
	@Then("I should see a confirmation message")
	public void i_should_see_a_confirmation_message() {
	   if(pass1.equals(pass2)) {
		   r.setPassword(pass1);
	   }
	   int res = 0;
	   int b = 1;
	   r.setPhone(phone);
	   if((r.getEmail()!=null) && (r.getPassword()!=null) && (r.getPhoneNo()!= null)) {
		   res =1;
	   }
	   assertEquals(res , b);
	}
	
	@Then("I should see an error message")
	public void i_should_see_an_error_message() {
		 if(pass1.equals(pass2)) {
			   r.setPassword(pass1);
		   }
		   int res = 0;
		   int exp =0 ;
		   r.setPhone(phone);
		   if((r.getEmail()!=null) && (r.getPassword()!=null) && (r.getPhoneNo()!= null)) {
			   res =1;
		   }
		   assertEquals(res , exp);
	}
	
}
