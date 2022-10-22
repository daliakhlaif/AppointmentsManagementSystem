package najah.edu;

import java.util.List;

public class Note {
	    
	    List<List<String>> patientsnote ;
	    private String pID ,   previous_visits ,  Notes;
	    
	    
	    
	    public  Note(List<List<String>> patientnote){
			   this.patientsnote = patientnote;
		   }
		public String getPID() {
			return this.pID;
		}
		public void setCustomer_id(String customer_id) {
			this.pID = customer_id;
		}
		public String getPrevious_visits() {
			return previous_visits;
		}
		public void setPrevious_visits(String previous_visits) {
			this.previous_visits = previous_visits;
		}
		public String getNotes() {
			return Notes;
		}
		public void setNotes(String notes) {
			Notes = notes;
		}
	    
}
