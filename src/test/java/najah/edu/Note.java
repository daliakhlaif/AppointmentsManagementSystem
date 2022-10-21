package najah.edu;

import java.util.List;

public class Note {
	    
	    List<List<String>> patientsnote ;
	    private String customer_id ,   previous_visits ,  Notes;
	    
	    
	    
	    public  Note(List<List<String>> patientnote){
			   this.patientsnote = patientnote;
		   }
		public String getCustomer_id() {
			return customer_id;
		}
		public void setCustomer_id(String customer_id) {
			this.customer_id = customer_id;
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
