import java.util.ArrayList;

public class Application {
	private String situation;
	private int protocolNum;
	//private String fullNameApplicant; //not needed, the applicant class has setters and getters
	private String dateApplication; //maybe not string
	//private String emailApplicant; //not needed, the applicant class has setters and getters
    ArrayList<String> documents = new ArrayList<String>(); //uploaded documents aren't strings tho- create class documents 
    private Professor prof;
    
    public Application(String sit, int pN, String date) {
		this.situation = sit;
		this.protocolNum = pN;
		this.dateApplication = date;
	}
    
    public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	public long getProtocolNum() {
		return protocolNum;
	}
	public void setProtocolNum(int protocolNum) {
		this.protocolNum = protocolNum;
	}
	public String getDateApplication() {
		return dateApplication;
	}
	public void setDateApplication(String dateApplication) {
		this.dateApplication = dateApplication;
	}
    

	public void setMyApplicant(Professor appl) {
		prof = appl;
	}
    
	public void printData() {
		System.out.println("\nThe information of the application is as follows: ");
		System.out.println("Situation of evaluation: " + situation);
		System.out.println("Protocol Number: " + protocolNum);
		System.out.println("Date of the application: " + dateApplication);
		System.out.println("Hello!");
		if(documents.size() != 0) {
		  System.out.println("Documents uploaded are: " + documents.get(0) + "," + documents.get(1));
		}
		if(this.prof != null) {
		   System.out.println("The information of the applicant is: ");
		   System.out.println(prof.getFirstName() + " " +  prof.getLastName() + " " + prof.getEmail());
		}
	}

	public ArrayList<String> getDocuments() {
		return documents;
	}

	public void setDocuments(ArrayList<String> documents) {
		this.documents = documents;
	}
    
    
    
}
