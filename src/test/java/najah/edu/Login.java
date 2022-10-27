package najah.edu;

import java.util.List;
import java.util.Scanner;

public class Login {
	
	 private  List<List<String>> usersList;
     private String loginE , loginP;
	   
	 
    
	   
	public  Login(List<List<String>> users){
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
		
			   
		for(int j=0 ; j < usersList.size(); j++)
		{
			for(int i =0; i< usersList.get(j).size() ;i++) {
				
				if(usersList.get(j).get(i).equals(loginE) && usersList.get(j).get(i+1).equals(loginP) ) {
					return loginE;
				}
			}
			
		}
			  
		 
		 return null;
	}
	
	
	
	
	
}
