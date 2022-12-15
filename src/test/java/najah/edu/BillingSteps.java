package najah.edu;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingSteps {
    Clinic	myClinic = new Clinic();
    
    Bill bill = new Bill();
	
	@Given("User is on invoice page")
	public void userIsOnInvoicePage() {
	
		System.out.println("User in invoice page"); 

	}
	@Given("the following services exists:")
	public void theFollowingServicesExists(DataTable services) {
		ArrayList<Service> s = new ArrayList<Service>();
       List<List<String>> service = services.cells();
		
		for(int i=1; i<service.size() ;i++) {
			Service ss = new Service();
			for(int j=0; j< service.get(i).size() ; j++) {
				
				switch(j) {
				
				case 0:ss.setName(service.get(i).get(j));break;
				case 1: ss.setPrice(Double.parseDouble(service.get(i).get(j)));
				}
				
				
			}
			s.add(ss);
		}
		myClinic.setServices(s);

	}
	Service s1 = new Service();
	Service s2 = new Service();
	@When("when the user purchases {string}")
	public void whenTheUserPurchases(String service) {
		s1 = myClinic.getServiceByName(service);
		ArrayList <Service> se = new ArrayList <Service>();
		se.add(s1);
		bill.setServices(se);

	}
	
	@Then("user get {string}")
	public void userGet(String string) {
	
		 assertTrue(bill.calculateTotalPrice() == Double.parseDouble(string));
	
	}
	
	@When("The user purchases {string} and {string}")
	public void theUserPurchasesAnd(String service1, String service2) {
		s1 = myClinic.getServiceByName(service1);
		s2 = myClinic.getServiceByName(service2);
		
		ArrayList <Service> se = new ArrayList <Service>();
		se.add(s1);
		se.add(s2);
		bill.setServices(se);
		
		
	}
	
	
	@Then("the total price should be  {string}")
	public void theTotalPriceShouldBe(String total) {
	 assertTrue(bill.calculateTotalPrice()== Double.parseDouble(total));
  	

		


	}


}
