package najah.edu;

import java.util.List;
import java.util.Scanner;

public class MyApp {
	
	   List<List<String>> usersList;
	   
	void admin() {
		Scanner sc=new Scanner(System.in);
			
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t |       Welcome Admin     |");
			System.out.println("\t\t |_________________________|");
	}
	
	
	
	void patient()
	{
	
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t | Welcome to Patient Page!|");
			System.out.println("\t\t |_________________________|");
			System.out.println(" ");
		
		}
	
	
	void doctor()
	{
		
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t | Welcome to Doctor Page! |");
			System.out.println("\t\t |_________________________|");
			System.out.println(" ");
		
	}
	
	void login(String email, String password)
	{
		
		System.out.println("\t\t  _________________________");
		System.out.println("\t\t |                         |");
		System.out.println("\t\t |         Login 		   |");
		System.out.println("\t\t |_________________________|");

		
	   
	    boolean found = false;
	    int in =0;
	    
	    for(List<String> u : usersList) {
	    	for(String e : u) {
	    		if(e.matches(email)) {
	    			found = true;
	    			in = e.indexOf(password);
	    		}
	    		
	    	}
	    }
	    
	    String role= null;
	    if(found) {
	    	in +=2;
	    	
	    	for(List<String> u : usersList) {
		    	for(String e : u) {
		    	role =	e.valueOf(in);
		    	}
		    }
	    	
	    	if(role.equals("admin"))admin();
	    	else if(role.equals("patient"))patient();
	    	else if(role == "doctor")doctor();
	    	
	    }else {
	    	System.out.println("wrong email or password");
	    }
 		
	}
	
	
	
}


