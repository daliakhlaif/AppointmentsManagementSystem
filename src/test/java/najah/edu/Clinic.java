package najah.edu;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Clinic {
	
   private ArrayList<Appointment> appointments;
   private ArrayList<DayOfWeek> workingdays;
   private ArrayList<Doctor>  doctors;
   private ArrayList<Patient> patients;
   private LocalTime open;
   private LocalTime close;
   
    public void setAppointments(ArrayList<Appointment> app) {
    	this.appointments = app;
    }
    
    public void setWorkingTimes(ArrayList <DayOfWeek> days) {
    	this.workingdays = days;
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
	
	public void setOpenTime(int h, int m) {
		this.open = LocalTime.of(h, m);
	}
	public void setCloseTime(int h, int m) {
		this.close = LocalTime.of(h, m);
	}
	public LocalTime getCloseTime() {
		return this.close;
	}
	public LocalTime getOpenTime() {
		return this.open;
	}
	
	public Patient getPatient(String pname) {
		
		for (Patient p : this.patients) {
			if (pname.equals(p.getName())) {
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
 			if (dname.equals(d.getName())) {
 				return d;
 			}
 		}
 		return null;
	 }
     
      public ArrayList<DayOfWeek> getWorkingTimes(){
    	 return this.workingdays;
     }
     
    public  ArrayList<Doctor> getDoctors(){
    	return this.doctors;
    }
    
    public ArrayList<Patient> getPatients(){
    	return this.patients;
    }
    
    public ArrayList<Appointment> getAppointments(){
    	return this.appointments;
    }
   
    
     public int addAppointment( Appointment app) {
    	 if(app.getAppointmentDate().isBefore(LocalDate.now()))
    		 return -1;
    	 if((app.getAppointmentDate().getDayOfWeek() == DayOfWeek.FRIDAY ) || (app.getAppointmentDate().getDayOfWeek() == DayOfWeek.SATURDAY) ) 
    		 return -1;
    	 
    	 if((app.getAppointmentStartTime().isBefore(LocalTime.of(8, 0))) || (app.getAppointmentEndTime().isAfter(LocalTime.of(18, 0))) ) 
    		 return -1;
    	 if(app.getAssignedDoctor().getDayOff().equals(app.getAppointmentDate().getDayOfWeek()))	 
    		 return -1;
    		 for(Appointment a : appointments) {
    	    		if(a.getAppointmentDate()==app.getAppointmentDate()) {
    	    			if(app.getAppointmentStartTime().isAfter(a.getAppointmentStartTime()) && app.getAppointmentEndTime().isBefore(a.getAppointmentEndTime())) {
    	    				return -1;
    	    			}else if(app.getAppointmentStartTime().isBefore(a.getAppointmentStartTime()) && app.getAppointmentEndTime().isAfter(a.getAppointmentStartTime())){
    	    				return -1;
    	    			}else if(app.getAppointmentStartTime().isBefore(a.getAppointmentEndTime()) && app.getAppointmentEndTime().isAfter(a.getAppointmentEndTime())){
    	    				return -1;
    	    			}
    	    			
    	    		}
    	    	}
    	    	 this.appointments.add(app);
    	    	 app.getAssignedDoctor().addAppointment(app);
    	    	 app.getAssignedPatient().addAppointment(app);
    	    	 
    	 
    	
    	
    	return 1;
     }
     
}
