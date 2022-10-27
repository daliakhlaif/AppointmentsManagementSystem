package najah.edu;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person {
	
	private List<Appointment> appointments;

	private List<Patient> patients;
	private String specialty;
	private DayOfWeek dayOff;
	private Registration associatedReg ;
	
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
	
	public void addPatient(Patient p) {    
		patients.add(p);
	}
	
	public void setPatient(List<Patient> patients) {   
		this.patients = patients;
	}
	
	public void setDayOff(DayOfWeek dayOff) {   
		this.dayOff = dayOff;
	}
	public DayOfWeek getDayOff() {
		return this.dayOff;
	}
	public String adminToString() {
		return "Id: " + getId() + " - " + toString();
	}
	public void setAssociatedReg(Registration reg) {
		this.associatedReg = reg;
	}
	public Registration getAssociatedReg() {
		return this.associatedReg;
	}
	public String toString() {
		return "Name: " + getName() + " - Specialty: " + getSpecialty();
	}
	
}

