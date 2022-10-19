package najah.edu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Patient extends Person {
		
		private Calendar dob;
		
		
		private List<Appointment> appointments;
		
		
		private List<Prescription> prescriptions; 
		
		
		private List<Doctor> doctors;
		
		/**
		 * creates patient object
		 */
		public Patient() {
			this.appointments = new ArrayList<Appointment>();
			this.prescriptions = new ArrayList<Prescription>();
			this.doctors = new ArrayList<Doctor>();
		}
		
	
		
		public Calendar getDOB() {
			return dob;
		}
		
		
	
		public void setDOB(Calendar dob) {
			this.dob = dob;
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
		
	
		 // to string method for admin in presentation layer
		
		public String adminToString() {
			return "Id: " + getId() + " - " + toString();
		}
		
		
		 //default to string method for patient
	
		public String toString() {
			return "Patient: " + getName() + " - DOB: " + (getDOB().get(2)+1) + "/" +  getDOB().get(5) + "/" + getDOB().get(1);
		}
	}

