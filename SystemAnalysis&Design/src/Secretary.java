
public class Secretary extends User {
	private String email; //will have a restriction on the suffix, since they have a specific email account
	//how many secretaries are there, should there be an arraylist for them too? 
	//also an array list of the applications the secretary has evaluated
	
	public Secretary(String fName, String lName, String pwd, String email) {
		super(fName, lName, pwd);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void printData() {	
		System.out.println("The name of the secretary is: " + firstName + " " + lastName + " ,and their email is: " + email);
	}
	

}
