
public class Rapporteur extends RegularMember {

	public Rapporteur(String fName, String lName, String pwd, String email, boolean pC) {
		super(fName, lName, pwd, email, pC);
	} 
	
	public void printData() {	
		System.out.println("The name of the rapporteur is: " + firstName + " " + lastName+	 ",and their email is: " + email);
	}
	
	

}
