package OOPTest;

public class Author {
	private String name,email;
	private char gender;
Author(String name,String email,char gender){
	this.name=name;
	this.email=email;
	this.gender=gender;
}
public void showa(){
	System.out.println("Name : "+name+"\nEmail : "+email+"\nGender : "+gender);
	
}
}
