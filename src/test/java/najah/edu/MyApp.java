package najah.edu;

import java.util.List;
import java.util.Scanner;

public class MyApp {
	
	   List<List<String>> usersList;
	   String loginE , loginP;
	   
	   
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
	
	void search() {

		 if(!(loginE.equals(null) && loginP.equals(null))) {
			   boolean found = false;
			    int c=0;
			    for(List<String> u : usersList) {
			    	for(String e : u) {
			    		
			    		if(e.matches(loginE)&&(u.get(c+1) == loginP)) {
			    			
			    			found = true;
			    			
			    		}
			    		
			    	}
			    	c++;
			    }
			    
			   if(!found)System.out.println("wrong email or password");
		   }
	}
	
	
	
	
}
