package najah.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {
	
	 private  ArrayList <Registration> usersList;
     private String logU , logP;
	   
	 
   
	public void setusersList(ArrayList<Registration> users){
		   this.usersList = users;
	 }
	
	public ArrayList<Registration> getusersList(){
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
	
	
	public Registration loginResult() {
		
		  for(int i=0; i< this.usersList.size(); i++) 
			  if(this.getLogU().equals(this.usersList.get(i).getUserName()) && this.getLogP().equals(this.usersList.get(i).getPassword())) 
				  return this.usersList.get(i);  
	
		 return null;
	}
	
	public int loginResultPage() {
		
		  if(this.loginResult() != null) 
			  return this.loginResult().getStatus();
		  
	
		 return -1;
	}
	
	
	
}
