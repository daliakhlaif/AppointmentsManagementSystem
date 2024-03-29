package najah.edu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServicSteps {
    Clinic myClinic = new Clinic();
    ConcreteService s = new ConcreteService();
    MedicalService ms = new MedicalService();
    Service gs; 
    
	@Given("that the administrator is logged in")
	public void that_the_administrator_is_logged_in() {
	    System.out.println("Welcome Adminstrator");
	}
	@Given("the clinic offers the following services:")
	public void the_clinic_offers_the_following_services(DataTable medicalServices) {
	    
		List<List<String>> s = medicalServices.cells();
		
		ArrayList<Service> services = new ArrayList<Service>();
		
		
		
		
             for(int i=1; i<s.size(); i++) {
			
		       MedicalService s1 = new MedicalService();
		    
			    for(int j=0 ; j< s.get(i).size() ; j++) {
				 
				 switch(j) {
				 case 0: s1.setName(s.get(i).get(j));break;
				 case 1:  {
					 Doctor d= new Doctor();
					 d.setName(s.get(i).get(j));		
					 s1.setAssignedDoctor(d);
			         break;
				 }
				 case 2: s1.setPrice(Double.parseDouble(s.get(i).get(j)));break;
					 
				 case 3: s1.setDescreption(s.get(i).get(j));break;
				         
				 }
			 }
			 services.add(s1);
		}
             
		myClinic.setServices(services);
	}
	
	@Given("in addition to extra services")
	public void in_addition_to_extra_services(DataTable extraServices) {
         List<List<String>> s = extraServices.cells();
		
		
             for(int i=1; i<s.size(); i++) {
			
		       ConcreteService s1 = new ConcreteService();
		    
			    for(int j=0 ; j< s.get(i).size() ; j++) {
				 
				 switch(j) {
				 case 0: s1.setName(s.get(i).get(j));break;
				 case 1:  {
				
					 s1.setProvider(s.get(i).get(j));
				
			         break;
				 }
				 case 2: s1.setPrice(Double.parseDouble(s.get(i).get(j)));break;
					 
				 
				         
				 }
			 }
			    myClinic.addService(s1);	 
		}
             System.out.println();
             System.out.println("The system has the following services: ");
		for(Service ser : myClinic.getServices() )
			System.out.println(ser);
	}
	
	@Given("there is a sevice called  {string} , provider  {string} and price {string}")
	public void there_is_a_sevice_called_provider_and_price(String name, String company, String price) {
		
		s.setName(name);
		s.setProvider(company);
		s.setPrice(Double.parseDouble(price));
		
		System.out.println();
		System.out.println("given the service   : " + s);
		gs = s;
		
	}
	
	@When("I add the service to the system")
	public void i_add_the_service_to_the_system() {
		System.out.println();
		System.out.println("Adding service .....");
		
	    
	}

	@Then("the concrete service is contained in the system")
	public void the_concrete_service_is_contained_in_the_system() {
		myClinic.addService(s);
		for( Service ser : myClinic.getServices() )
			System.out.println(ser );
		
		System.out.println( );
		assertTrue(myClinic.serviceExist(s.getName()));
		
		
	    
	}
	
	@Given("there is a sevice called  {string} ,doctor {string} and price {string}")
	public void there_is_a_sevice_called_doctor_and_price(String name, String doctor, String price) {
	    ms.setName(name);
	    Doctor d = new Doctor();
	    d.setName(name);
	    ms.setAssignedDoctor(d);
	    ms.setPrice(Double.parseDouble(price));
	    gs = ms;
	}
	
	@Then("the medical service is contained in the system")
	public void the_medical_service_is_contained_in_the_system() {
		
		myClinic.addService(ms);
		for(Service ser : myClinic.getServices() )
			System.out.println(ser);
	
		 assertTrue(myClinic.serviceExist(ms.getName()));
	    System.out.println("_____________________________________________________________________________");

		    
		
	}
	
	
	@Then("the concrete service isn't contained in the system")
	public void the_concrete_service_isn_t_contained_in_the_system() {
		
		myClinic.addService(s);
		for(Service ser : myClinic.getServices() )
			System.out.println(ser);
		assertTrue(myClinic.serviceExist(s.getName()));
		
		
	    
	    System.out.println("_____________________________________________________________________________");
	    
		
	    
	   
	    
	}
	
	@Then("the medical service isn't contained in the system")
	public void the_medical_service_isn_t_contained_in_the_system() {
		myClinic.addService(ms);
		for(Service ser : myClinic.getServices() )
			System.out.println(ser);
	    
		assertTrue(myClinic.serviceExist(ms.getName()));
	    System.out.println("_____________________________________________________________________________");
		
	    

	}
	
	@When("I delete the service from the system")
	public void i_delete_the_service_from_the_system() {
	    
	}
    
	@Then("the medical service should be removed")
	public void the_medical_service_should_be_removed() {
	    myClinic.deleteService(gs.getName());
	    assertTrue(!myClinic.serviceExist(gs.getName()));
	}
	@Then("I should get the message error")
	public void i_should_get_the_message_error() {
	     myClinic.deleteService(gs.getName());
	     assertTrue(!myClinic.serviceExist(gs.getName()));
	}

	@When("I edit the service provider to {string}")
	public void i_edit_the_service_provider_to(String com) {
		myClinic.deleteService(s.getName());
	   s.setProvider(com);
	   
	   myClinic.addService(s);
	}
	
	@Then("the service provider should be editted to {string}")
	public void the_service_provider_should_be_editted_to(String company) {
	  assertEquals(s.getProvider(),company);
	}
	@When("I edit the price to {string}")
	public void i_edit_the_price_to(String price) {
		myClinic.getServiceByName(s.getName()).setPrice(Double.parseDouble(price));
	}
	@Then("the price should be editted to {string}")
	public void the_price_should_be_editted_to(String price) {
		Double A = myClinic.getServiceByName(s.getName()).getPrice();
		Double B = Double.parseDouble(price);
	    assertEquals(A,B);
	}
}
