package najah.edu;

import java.util.Calendar;

public class Appointment {
	
	private int appointmentId;
	private Calendar appointmentDate;
	private Patient assignedPatient;
	private Doctor assignedDoctor;
	
	public int getAppointmentId() {
		return appointmentId;
	}
	
	
	public Calendar getAppointmentDate() {
		return appointmentDate;
	}
	
	public void setAppointmentDate(Calendar appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	
	public Doctor getAssignedDoctor() {
		return assignedDoctor;
	}
	
	
	public void setAssignedDoctor(Doctor assignedDoctor) {
		this.assignedDoctor = assignedDoctor;
	}
	
	public Patient getAssignedPatient() {
		return assignedPatient;
	}
	
	public void setAssignedPatient(Patient assignedPatient) {
		this.assignedPatient = assignedPatient;
	}
	
	public String toString() {
		return "Appointment on " + (getAppointmentDate().get(2)+1) + "/" +  getAppointmentDate().get(5) + "/" + getAppointmentDate().get(1) + " with " + getAssignedDoctor();
	}
}
