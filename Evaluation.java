import java.util.ArrayList;

public class Evaluation {
	private String proposition;
	ArrayList<String> comments = new ArrayList<String>(); //if a member has access to the documents (if(processingCapacity)) then they have access to the comments. Each member one comment and they are stored in the list. 
	private String decision;  //by the Chairman
	private String signature; //by the Chairman
	
	public Evaluation(String prop, String dec, String sign) {
		proposition = prop;
		decision = dec;
		signature = sign;
	}
	
	public String getProposition() {
		return proposition;
	}
	public void setProposition(String proposition) {
		this.proposition = proposition;
	}
	public ArrayList<String> getComments() {
		return comments;
	}
	public void setComments(ArrayList<String> comments) {
		this.comments = comments;
	}
	public String getDecision() {
		return decision;
	}
	public void setDecision(String decision) {
		this.decision = decision;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	
	public void printData() {
		System.out.println("The proposition and comments are: " + proposition);
		for (int i=0; i<comments.size(); i++) {
			System.out.println(comments.get(i));
		}
		System.out.println("The final decision for the application is: " + decision);
	}
	
	

}
