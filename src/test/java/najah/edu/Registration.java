package najah.edu;

import java.util.regex.Pattern;

public class Registration extends Person {

	
    
    private String userName;
    private String password;
    private String email;
	private int status;  
	
	
     
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
    
    public void setEmail(String e) {
    	
    	if ( this.checkemail(e) == true ){
    		this.email = e;
    	}else this.email = null;
	}
    
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    
   
    public boolean checkemail(String mail)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (mail == null)
            return false;
        else {
        	if(pat.matcher(mail).matches())
        	return true;
        	else 
        		return false;
        }
    }
    
    
     @Override
    public String toString() {
        return super.toString()+ "userName = " + this.userName + ", password = " +
          this.password + ", emailId =" + this.email ;
    }
    
}
