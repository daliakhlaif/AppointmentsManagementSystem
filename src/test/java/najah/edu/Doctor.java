package najah.edu;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person {
	
	private List<Appointment> appointments;

	private List<Patient> patients;
	private String specialty;
	private String dayOff;
	
	public Doctor() {
		this.appointments = new ArrayList<Appointment>();
		this.patients = new ArrayList<Patient>();
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
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
	
	public List<Patient> getPatients() {
		return patients;
	}
	
	public void addPatient(Patient p) {    //Adds a new patient to doctor 
		patients.add(p);
	}
	
	public void setPatient(List<Patient> patients) {   // Sets patients list for doctor
		this.patients = patients;
	}
	
	public void setDayOff(String dayOff) {   // Sets the day-Off for doctor
		this.dayOff = dayOff;
	}
	public String adminToString() {
		return "Id: " + getId() + " - " + toString();
	}
	
	public String toString() {
		return "Name: " + getName() + " - Specialty: " + getSpecialty();
	}
	
}

