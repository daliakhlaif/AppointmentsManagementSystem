package najah.edu;

import java.util.List;
import java.util.Scanner;

public class MyApp {
	
	   List<List<String>> usersList;
	   void page(String p) {
		   
		   if(p.equals("admin")) {

				System.out.println("\t\t  _________________________");
				System.out.println("\t\t |                         |");
				System.out.println("\t\t |       Welcome Admin     |");
				System.out.println("\t\t |_________________________|");
		   }
		   else if(p.equals("patient")) {
			   System.out.println("\t\t  _________________________");
				System.out.println("\t\t |                         |");
				System.out.println("\t\t | Welcome to Patient Page!|");
				System.out.println("\t\t |_________________________|");
				System.out.println(" ");
		   }else if(p.equals("doctor")) {
			   System.out.println("\t\t  _________________________");
				System.out.println("\t\t |                         |");
				System.out.println("\t\t | Welcome to Doctor Page! |");
				System.out.println("\t\t |_________________________|");
				System.out.println(" ");
		   }
		   
		   
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
	    
	   if(!found)System.out.println("wrong email or password");
	}
	
	
	
}


