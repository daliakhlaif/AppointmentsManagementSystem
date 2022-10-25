package najah.edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Appointment {
	
	private int appointmentId;
	private LocalDate appointmentDate;
	private Patient assignedPatient;
	private Doctor assignedDoctor;
	private LocalTime startOfAppointment ;
	private LocalTime endOfAppointment ;
	
	public int getAppointmentId() {
		
		return appointmentId;
	}
	
	
	public void setStartOfAppointment( int h, int m) {
		this.startOfAppointment = LocalTime.of(h, m);
	}
	
	public void setEndOfAppointment(int h, int m) {
		this.endOfAppointment = LocalTime.of(h, m);
	}
	
	public void setAppointmentDate(int year , int month , int day) {
		this.appointmentDate = LocalDate.of(year, month, day);
	}
	
	public LocalDate getAppointmentDate() {
		return this.appointmentDate;
	}
	
	public LocalTime getAppointmentStartTime() {
		return this.startOfAppointment;
	}
	
	public LocalTime getAppointmentEndTime() {
		return this.endOfAppointment;
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
		return " Appointment for: "+ this.getAssignedPatient() + " At the doctor: "+ this.getAssignedDoctor() + " On: "+ this.getAppointmentDate().getDayOfWeek()+" "+this.getAppointmentDate()+" From: "+this.getAppointmentStartTime()+" to: "+this.getAppointmentEndTime();
	}
	
	
		
}
