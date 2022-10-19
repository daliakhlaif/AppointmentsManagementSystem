package najah.edu;

public class Prescription {
private int prescriptionId;
	
	
	private String medicationName;
	
	
	private Doctor assignedDoctor;
	
	
	private Patient assignedPatient;
	
	public int getPrescriptionId() {
		return prescriptionId;
	}
	
	
	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	
	
	public String getMedicationName() {
		return medicationName;
	}
	
	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}
	

	 // get doctor who assigned prescription
	
	public Doctor getDoctor() {
		return assignedDoctor;
	}
	
	
	 // set name of doctor for prescription
	 
	public void setDoctor(Doctor assignedDoctor) {
		this.assignedDoctor = assignedDoctor;
	}
	

	 // get patient prescription is prescribed to
	
	public Patient getPatient() {
		return assignedPatient;
	}
	
	
	 // set patient to prescribe prescription
	
	public void setPatient(Patient assignedPatient) {
		this.assignedPatient = assignedPatient;
	}
	
	
	public String toString() {
		return "Drug: " + getMedicationName() + " Doctor: " + getDoctor();
	}
}
