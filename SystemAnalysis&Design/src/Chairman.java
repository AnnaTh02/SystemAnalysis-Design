
public class Chairman extends User {
	private String email;
	
	public Chairman(String fName, String lName, String pwd, String email) {
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
		System.out.println("The name of the chairman is " + firstName + " " + lastName + ", and their email is: " + email);
	}
	
	

}
