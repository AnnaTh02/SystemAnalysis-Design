import java.util.ArrayList;

public class Professor extends User{
    private String email;
    ArrayList<Application> applications = new ArrayList<Application>(); //a list with the applications the professor has made

    public Professor(String fName, String lName, String pwd, String em){
    	super(fName, lName, pwd);
        this.email = em;
    }

    public void printData(){
        System.out.println("The professors information is as follows: ");
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(passwrd);
        System.out.println(email);
        System.out.println("The number of applications the applicant has are: " + applications.size());
    }
    
    public void myApplications(Application app) {
    	System.out.println("Please insert the information for your application: ");
    	app.getDateApplication();
    	applications.add(app);
    }


}
