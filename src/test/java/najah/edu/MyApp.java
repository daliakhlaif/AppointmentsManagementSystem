package najah.edu;

import java.util.List;
import java.util.Scanner;

public class MyApp {
	
	 private  List<List<String>> usersList;
     private	   String loginE , loginP;
	   
	 
    
	   
	public  MyApp(List<List<String>> users){
		   this.usersList = users;
	   }
	
	public void setLoginE(String e) {
		this.loginE = e;
		
	}
	   
	public void setLoginP(String p) {
		this.loginP = p;
		
	}   
	   
	public String getLoginE() {
		return this.loginE;
	}
	
	public String getLoginP() {
		return this.loginP;
	}
	
	
	String search() {
		String em = null;

		
			   boolean found = false;
			    int c=0;
			     for(List<String> u : usersList) {
			    	for(String e : u) {
			    		
			    		if(e.matches(loginE)&&(u.get(c+1) == loginP)) {
			    			
			    			found = true;
			    			em = e; 
			    		}
			    		
			    	}
			    	c++;
			    }
			    
			   if(!found)System.out.println("wrong email or password");
		 
		 return em;
	}
	
	
	
	
}
