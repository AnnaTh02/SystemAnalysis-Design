public class Professor extends User{
    private String email;

    public Professor(String em){
        email = em;
    }

    public printData(){
        System.out.println("The professors information is as follows: ");
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(passwrd);
        System.out.println(email);
    }


}