package najah.edu;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args) {
		
		Patient p = new Patient();
		p.setName("Dalia ");
		p.setDOB( 2005,5,5);
		System.out.println(p);
		Appointment a = new Appointment();
		 a.setAssignedPatient(p);
		 Doctor d = new Doctor();
		 d.setName("Ali");
		 d.setDayOff(DayOfWeek.SUNDAY);
		 d.setSpecialty("Lasik Surgery");
		 
		 a.setAppointmentDate(2022,12, 1);
		 a.setStartOfAppointment(13, 6);
		 a.setEndOfAppointment(13, 30);
		 a.setAssignedDoctor(d);
		 
		 d.addAppointment(a);
		 
		p.addAppointment(a); 
		 
		 
		 System.out.println(a);
		
	}

}
