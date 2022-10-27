package najah.edu;

import java.util.ArrayList;

// such as surgeries, examinations.. etc
public class MedicalService {

	private ArrayList<Doctor> assignedDoctors;
	private String descreption;
	
	
	public void setAssignedDoctors(ArrayList<Doctor> assignedDoctors) {
		this.assignedDoctors = assignedDoctors;
	}
	public ArrayList<Doctor> getAssignedDoctors(){
		return this.assignedDoctors;
	}
	public void setDescreption(String descreption) {
		this.descreption = descreption ;
	}
	public String getDescreption() {
		return this.descreption;
	}
	
}
