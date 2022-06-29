import java.util.ArrayList;

public class Application {
	private String situation;
	private long protocolNum;
	//private String fullNameApplicant; //not needed, the applicant class has setters and getters
	private String dateApplication; //maybe not string
	//private String emailApplicant; //not needed, the applicant class has setters and getters
    ArrayList<String> documents = new ArrayList<String>(); //uploaded documents aren't strings tho- create class documents 
	
    public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	public long getProtocolNum() {
		return protocolNum;
	}
	public void setProtocolNum(long protocolNum) {
		this.protocolNum = protocolNum;
	}
	public String getDateApplication() {
		return dateApplication;
	}
	public void setDateApplication(String dateApplication) {
		this.dateApplication = dateApplication;
	}
    
    
    
    
}