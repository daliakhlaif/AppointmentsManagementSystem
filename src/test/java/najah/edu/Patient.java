package najah.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Patient extends Person {
		
		private Date dob;
		
		private int visits;
		
		private List<Appointment> appointments;
		
		
		private List<Prescription> prescriptions; 
		
		private List<Note> notes;
		
		private List<Doctor> doctors;
		
		
		public Patient() {
			this.appointments = new ArrayList<Appointment>();
			this.prescriptions = new ArrayList<Prescription>();
			this.doctors = new ArrayList<Doctor>();
			this.notes = new ArrayList<Note>();
			this.visits = 0;
		}
		
	
		
		public Date getDOB() {
			return dob;
		}
		
		
	
		public void setDOB(Date dob) {
			this.dob = dob;
		}
		
		public int getVisits() {
			return this.visits;
		}
		
		public List<Appointment> getAppointments() {
			return appointments;
		}
		
		
		public void addAppointment(Appointment a) {
			appointments.add(a);
		}
		
		public void setAppointments(List<Appointment> appointments) {
			this.appointments = appointments;
		}
		
		
		public List<Prescription> getPrescriptions() {
			return prescriptions;
		}
		
		
		public void addPrescription(Prescription p) {
			prescriptions.add(p);
		}

		
		public void setPrescription(List<Prescription> prescriptions) {
			this.prescriptions = prescriptions;
		}

		
		public List<Doctor> getDoctors() {
			return doctors;
		}
		
	
		// adds new doctor to patient's doctor list
	
		public void addDoctor(Doctor d) {
			doctors.add(d);
		}

		
		// sets list of doctors for patient
		 
		public void setDoctors(List<Doctor> doctors) {
			this.doctors = doctors;
		}
		
	
		
		
		/*public String adminToString() {
			return "Id: " + getId() + " - " + toString();
		}
		
		
		 //default to string method for patient
	
		public String toString() {
			return "Patient: " + getName() + " - DOB: " + (getDOB().get(2)+1) + "/" +  getDOB().get(5) + "/" + getDOB().get(1);
		}*/
	}

