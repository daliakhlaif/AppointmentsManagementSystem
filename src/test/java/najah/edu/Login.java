package najah.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {
	
	 private  ArrayList <Registration> usersList;
     private String logU , logP;
	   
	 
   
	public void Login(ArrayList<Registration> users){
		   this.usersList = users;
	 }
	
	public ArrayList<Registration> Login(){
		 return this.usersList ;
	 }

	public void setLogU(String u) {
		this.logU = u;
		
	}
	   
	public void setLogP(String p) {
		this.logP = p;
		
	}   
	   
	public String getLogU() {
		return this.logU;
	}
	
	public String getLogP() {
		return this.logP;
	}
	
	
	public boolean  loginResult() {
		
		
		
			  
		 
		 return null;
	}
	
	
	
	
	
}
