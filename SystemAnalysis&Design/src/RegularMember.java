
public class RegularMember extends User{
	protected boolean processingCapacity;
	protected String email;
	//should there be a regular members array list? most probably yes
	
	public RegularMember(String fName, String lName, String pwd, String email, boolean pC) {
		super(fName, lName, pwd);
		this.email = email;
		processingCapacity = pC;
	}
	
	
	public boolean isProcessingCapacity() {
		return processingCapacity;
	}
	public void setProcessingCapacity(boolean processingCapacity) {
		this.processingCapacity = processingCapacity;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
	
	public void printData() {
		System.out.println("The name of the regular member is: " + firstName + " " + lastName + " ,and their email is: " + email);		
	}
	
	

}
