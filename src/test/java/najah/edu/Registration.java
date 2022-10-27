package najah.edu;

public class Registration {

	private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private int phoneNo;
	private String address;
	private int status;  
	
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
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public int getPhoneNo() {
        return this.phoneNo;
    }
    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    public void setAddress(String address) {
    	this.address = address;
    }
    public String getAddress() {
    	return this.address;
    }
    
    public int getStatus() {
        return this.status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
   
    @Override
    public String toString() {
        return " [ firstName=" + this.firstName + ", lastName=" + this.lastName + ", userName=" + this.userName + ", password=" +
          this.password + ", emailId=" + this.email + ", phoneNo=" + this.phoneNo +" Address= "+ this.address+" ]";
    }
    
}
