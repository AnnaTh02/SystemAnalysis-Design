import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor prof1 = new Professor("Alex", "Jonas", "1234", "jonas@gmail.com");
		Application app1 = new Application("undefined", 0000, "00_00_00");
		
		prof1.printData();
		
		prof1.myApplications(app1);
		app1.setMyApplicant(prof1);
		
		app1.printData();
		
	}

}


