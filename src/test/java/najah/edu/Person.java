package najah.edu;

import java.util.regex.Pattern;

import org.hamcrest.Matcher;

public class Person {
	
	private int id;
	private String name;
	private String firstName;
	private String lastName;
	
	private String address;
	private String gender ;	
	
    private long phoneNo;
    
	public int getId() {
		return id;
	}
	public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
	
	
    public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		//this.name = this.getFirstName() + this.getLastName();
	}
	    
	    public long getPhoneNo() {
	        return this.phoneNo;
	    }
	    
	    public void setPhone(String phone) {
	    	if(Person.isValidPhone(phone))
	        this.phoneNo = Integer.parseInt(phone);
	    }
	    
	    public void setAddress(String address) {
	    	this.address = address;
	    }
	    public String getAddress() {
	    	return this.address;
	    }
	    
	    public String getGender() {
	        return this.gender;
	    }
	    public void setGender(String gender) {
	         this.gender = gender;
	    }
	    
	    public String toString() {
	    	return  " first name = " + this.firstName + ", last name =" + this.lastName + " Gender = "+this.gender+ ", phoneNo = " + this.phoneNo + " Address = "+ this.address ;
	    }
	
	    public static boolean isValidPhone(String s)
	    {
	        Pattern p = Pattern.compile("^\\d{10}$");
	
	          java.util.regex.Matcher m = p.matcher(s);
	        return (m.matches());
	    }
}