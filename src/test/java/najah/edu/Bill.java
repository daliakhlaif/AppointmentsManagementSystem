package najah.edu;

import java.util.ArrayList;

public class Bill {
    
	private Patient assignedPatient;
	private ArrayList<Service> services;
	private double totalPrice =0;
	
	public void setAssignedPatient(Patient patient) {
		this.assignedPatient = patient;
	}
	public Patient getAssignedPatient() {
		return this.assignedPatient;
	}
	
	public void setServices(ArrayList<Service> services) {
    	this.services = services;
    }
	public ArrayList<Service> getServices() {
    	return this.services;
    }
	public void addService(Service service) {
    	this.services.add(service);
    }
	public double calculateTotalPrice() {
		for(Service s : services) {
			this.totalPrice = this.totalPrice + s.getPrice();
		}
		return this.totalPrice;
	}
	
}
