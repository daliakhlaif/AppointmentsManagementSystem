package najah.edu;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
	
   private List<List<Appointment>> comingAppointments ;
   private List<List<String>>   workingTimes;
   private ArrayList<Doctor>  doctors;
   
    public void setAppointments(List<List<Appointment>> app) {
    	this.comingAppointments = app;
    }
    
    public void setWorkingTimes(List<List<String>> times) {
    	this.workingTimes = times;
    }
    
    public void setDoctors(ArrayList <Doctor> doctors) {
    	this.doctors = doctors;
    }
}
