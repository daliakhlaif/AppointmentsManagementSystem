package najah.edu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.List;
import java.util.Date;

public class Patient extends Person {
		
		private LocalDate dob;
		
		private int visits;
		
		private ArrayList<Appointment> appointments;
		
		private ArrayList<Note> notes;
		
		private ArrayList<Doctor> doctors;
		
		private Registration associatedReg ;
	
		public Patient() {
			
			this.appointments = new ArrayList<Appointment>();
			this.doctors = new ArrayList<Doctor>();
			this.notes = new ArrayList<Note>();
			this.visits = 0;
			
		}
	
		
		public LocalDate getDOB() {
			return dob;
		}
		
         public void setDOB(int iYear, int iMonth, int iDay) {
        	 this.dob = LocalDate.of(iYear, iMonth, iDay);
         }
         
        
		
		public int getVisits() {
			return this.visits;
		}
		
		public void setVisits(int v) {
			 this.visits = v;
		}
		
		public List<Appointment> getAppointments() {
			return appointments;
		}
		
		
		public void addAppointment(Appointment a) {
			appointments.add(a);
		}
		
		public void setAppointments(ArrayList<Appointment> appointments) {
			this.appointments = appointments;
		}
		
		
		public List<Doctor> getDoctors() {
			return doctors;
		}
		
	
		public void addDoctor(Doctor d) {
			doctors.add(d);
		}

		
		public void setDoctors(ArrayList<Doctor> doctors) {
			this.doctors = doctors;
		}
		
	
		public String toString() {
			return " Patient name: " +this.getName() + " Previous visits:  "  + this.getVisits() + " Date of Birth: " + this.getDOB() ;
		}
		
		
	}

