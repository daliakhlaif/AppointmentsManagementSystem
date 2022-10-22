package najah.edu;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
	
   private ArrayList<Appointment> appointments ;
   private List<List<String>>   workingTimes;
   private ArrayList<Doctor>  doctors;
   private ArrayList<Patient> patients;
   
    public void setAppointments(ArrayList<Appointment> app) {
    	this.appointments = app;
    }
    
    public void setWorkingTimes(List<List<String>> times) {
    	this.workingTimes = times;
    }
    
    public void setDoctors(ArrayList <Doctor> doctors) {
    	this.doctors = doctors;
    }

	public void setPatients(ArrayList<Patient> pa) {
		this.patients = pa;
		
	}
	
	public void addPatient(Patient patient) {
		this.patients.add(patient);
		
	}
	
	public Patient getPatient(String pname) {
		
		for (Patient p : this.patients) {
			if (p.getName() == pname) {
				return p;
			}
		}
		return null;
	}
    public void addDoctor(Doctor doc) {
		
		this.doctors.add(doc);
	 }
    
     public Doctor getDoctor(String dname) {
		
    	 for (Doctor d : this.doctors) {
 			if (d.getName() == dname) {
 				return d;
 			}
 		}
 		return null;
	 }
}
