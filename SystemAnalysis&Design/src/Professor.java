
import java.util.ArrayList;


public class Professor extends User{
    private String email;
    ArrayList<Application> applications = new ArrayList<Application>();//a list with the applications the professor has made
    ArrayList<String> documents = new ArrayList<String>();
    
    public Professor(String fName, String lName, String pwd, String em){
    	super(fName, lName, pwd);
        this.email = em;
    }
    
    public void setMyDocuments() {
    	documents.add("Document1");
    	documents.add("Document2");
    }

    public void printData(){
        System.out.println("\nThe applicant's information is as follows: ");
        System.out.println("Full name: " + firstName + " " + lastName);
        System.out.println("Their Password is: " + passwrd);
        System.out.println("Their Email is: " + email);
        System.out.println("The number of applications the applicant has are: " + applications.size());
    }
    
    public void myApplications(Application app) {
    	app.setDateApplication("30_6_2022");
    	app.setDocuments(documents);
    	applications.add(app);
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Application> getApplications() {
		return applications;
	}

	public void setApplications(ArrayList<Application> applications) {
		this.applications = applications;
	}

	public ArrayList<String> getDocuments() {
		return documents;
	}

	public void setDocuments(ArrayList<String> documents) {
		this.documents = documents;
	}
    
    
    
    


}