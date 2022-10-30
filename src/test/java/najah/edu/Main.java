package najah.edu;

import java.io.IOException;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

import io.cucumber.java.bs.A;

public class Main {
	
	public void addData() {
		ArrayList<Patient> patients = new ArrayList<Patient>();
		ArrayList<Registration> regs = new ArrayList<Registration>();
		
		Registration ad = new Registration();
		ad.setAddress("Qalqiliah");ad.setFirstName("Dalia");ad.setEmail("dalia.2001.kh@gmail.com");ad.setGender("F");ad.setLastName("Khlaif");ad.setPassword("dalia123");ad.setStatus(0);ad.setPhone("0598520232");
		ad.setUserName("daliakh");regs.add(ad);
		
		ad.setFirstName("Hala");ad.setLastName("Ayman");ad.setEmail("halaayman.98@gmail.com");ad.setPassword("096545567");ad.setGender("F");ad.setAddress("Nablus");ad.setStatus(2);ad.setPhone("086585908");
		ad.setUserName("hala55");regs.add(ad);
		Patient p = new Patient();p.setDOB(2000, 10, 20);p.setName(p.getAssociatedReg().getFirstName()+p.getAssociatedReg().getLastName());
		p.setAssociatedReg(ad);
		
		ad.setFirstName("Ahmad");ad.setLastName("Salah");ad.setEmail("halaayman.98@gmail.com");ad.setPassword("096545567");ad.setGender("F");ad.setAddress("Nablus");ad.setStatus(2);ad.setPhone("086585908");
		ad.setUserName("hala55");regs.add(ad);
		
		
	
		
		
	}
    
	public static void main(String[] args) {
		
		
		
		
		Login log = new Login();
		Scanner s = new Scanner(System.in);
		int choice;
		
			System.out.println("\t\t  ____________________________________________________________________________");
			System.out.println("\t\t |                                                                            |");
			System.out.println("\t\t |                             Eye Clinic                                     |");
			System.out.println("\t\t |                              WELCOME                                       |");
			System.out.println("\t\t |                                                                            |");
			System.out.println("\t\t |____________________________________________________________________________|");
	
			System.out.print("\n\n1. New? Register Now.  \t2. Lognin.   \n\nEnter Your Choice.");
			 
		    choice = s.nextInt();
		    
		    switch(choice) {
		    case 1: {
		    	System.out.println("\t\t  ___________________________________");
				System.out.println("\t\t |                                   |");
				System.out.println("\t\t |            Register               |");		
				System.out.println("\t\t |      Fill your information        |");
				System.out.println("\t\t |___________________________________|");
		    	Registration r = new Registration();
		    	System.out.println(" Enter firstName : ");
		    	String firstName = s.next();
                r.setFirstName(firstName);
                
                
                System.out.println(" Enter lastName : ");
                String lastName = s.next();
                r.setLastName(lastName);

                System.out.println(" Enter userName : ");
                String userName = s.next();
                r.setUserName(userName);

                System.out.println(" Enter password : ");
                String password = s.next();
                r.setPassword(password);

                System.out.println(" Enter emailId : ");
                String email = s.next();
                r.setEmail(email);
                while(r.getEmail() == null) {
                	System.out.println("invalid email address -- try again : ");
                	email = s.next();
                	r.setEmail(email);
                }
                
                System.out.println(" Enter phoneNo : ");
                String phoneNo = s.next();
                r.setPhone(phoneNo);
                Patient p = new Patient();
                p.setAssociatedReg(r);
                p.getAssociatedReg().setStatus(2);
                
                System.out.println(" Enter city : ");
                String city = s.next();
                p.getAssociatedReg().setAddress(city);
                
                System.out.println(" Enter Date of Birth (in the form => dd-mm-yyyy) : ");
                String dob = s.next();
                p.setDOB(Test.getYear(dob), Test.getMonth(dob), Test.getDay(dob));
                
                
                p.setVisits(0);
                
                System.out.println(p);
                break;
		    }
                     
		    case 2:{
		    	
		    	System.out.println("\t\t  ___________________________________");
				System.out.println("\t\t |                                   |");
				System.out.println("\t\t |              Login                |");		
				System.out.println("\t\t |   Enter your usernam & password   |");
				System.out.println("\t\t |___________________________________|");
				
				System.out.println(" Enter username : ");
				String username = s.next();
				
		    }
                    
		    }
		
		
		
	

}
}