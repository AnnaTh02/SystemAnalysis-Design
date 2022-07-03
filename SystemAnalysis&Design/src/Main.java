import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Professor prof1 = new Professor("Alex", "Jonas", "1234", "jonas@gmail.com");
		Application app1 = new Application("undefined", 0000, "00_00_00");
		
		//initial information of the professor
		prof1.printData();
		
		app1.printData();
		
		prof1.myApplications(app1);
		prof1.setMyDocuments();
		
		app1.setMyApplicant(prof1);
		
		//final information of the objects 
		prof1.printData();
		app1.printData();
			
		
	}

}
