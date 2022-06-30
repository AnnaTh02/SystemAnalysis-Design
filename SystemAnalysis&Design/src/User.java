
public class User {
	protected String firstName;
	protected String lastName;
	protected String passwrd;
	
	public User(String fName, String lName, String pwd) {
		firstName = fName; 
		lastName = lName; 
		passwrd = pwd;
	}
	
	public String getFirstName() {
		return firstName;
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
	public String getPasswrd() {
		return passwrd;
	}
	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}
	
	

}

