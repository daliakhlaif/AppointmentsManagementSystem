package najah.edu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Appointment {
	
	private int appointmentId;
	private Date appointmentDate;
	private Patient assignedPatient;
	private Doctor assignedDoctor;
	private Date startTime, endTime;
	
	
	
	public int getAppointmentId() {
		return appointmentId;
	}
	
	
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	
	public void setStartTime(String time) {
		try {
			Date date = new SimpleDateFormat("hh:mm a").parse(time);
			this.startTime = date;
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
	
	public void setEndTime(String time) {
		try {
			Date date = new SimpleDateFormat("hh:mm a").parse(time);
			this.endTime = date;
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public Date getStartTime() {
		return this.startTime;
	}
	public Date getEndTime() {
		return this.endTime;
	}
	public void setAppointmentDate(Date appointmentDate) {
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
	
	/*public String toString() {
		return "Appointment on " + (getAppointmentDate().get(2)+1) + "/" +  getAppointmentDate().get(5) + "/" + getAppointmentDate().get(1) + " with " + getAssignedDoctor();
	}*/
}
