package najah.edu;

import java.util.ArrayList;
import java.util.List;

public class Note {
	    
	     private  String text ;
	     private  Patient assignedPatient;
	     private int assignedVisitNumber ;
	    
	    public void setNoteText(String text) {
	    	this.text = text;
	    }
	    
	    public String getNoteText(){
	    	return this.text;
	    }
	    public void setVisits(int v) {
	    	this.assignedVisitNumber = v;
	    }
	    
	    public void setAssignedPatient(Patient p) {
	    	this.assignedPatient = p;
	    }
	    
	    public Patient getAssignedPatient() {
	    	return this.assignedPatient;
	    }
	    
	    public int getAssignedVisitNumber() {
	    	return this.assignedVisitNumber;
	    }
	    	
	    
}
