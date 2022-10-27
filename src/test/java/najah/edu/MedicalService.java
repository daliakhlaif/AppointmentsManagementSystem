package najah.edu;

import java.util.ArrayList;

// such as surgeries, examinations.. etc
public class MedicalService extends Service{

	private Doctor assignedDoctor;
	private String descreption;
	
	
	public void setAssignedDoctor(Doctor assignedDoctor) {
		this.assignedDoctor = assignedDoctor;
	}
	public Doctor getAssignedDoctor(){
		return this.assignedDoctor;
	}
	public void setDescreption(String descreption) {
		this.descreption = descreption ;
	}
	public String getDescreption() {
		return this.descreption;
	}
	
	public String toString() {
		return this.getName() +" price: " + this.getPrice()+ " "+this.getAssignedDoctor() + " Descreption: "+this.getDescreption();
	}
	
}
