import java.util.ArrayList;

public class EvaluationCommitee {
	ArrayList<RegularMember> commiteeMembers = new ArrayList<>();

	public ArrayList<RegularMember> getCommiteeMembers() {
		return commiteeMembers;
	}

	public void setCommiteeMembers(ArrayList<RegularMember> commiteeMembers) {
		this.commiteeMembers = commiteeMembers;
	}
	
	public void printData() {
		System.out.println("The commitee members are: ");
		for(int i=0; i<commiteeMembers.size(); i++) {
			System.out.println(i + "." + " " + commiteeMembers.get(i));
			System.out.println("\n");
		}
	}
	

}
