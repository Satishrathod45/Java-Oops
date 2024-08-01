package accessModifierss;

public class Protecteddiffclass 
{
     protected String fname="Ajay";
     protected String lname="Rathod";
     protected int age=22;
     
     protected   Protecteddiffclass(){}
     
	protected void dis()
	{
		System.out.println("Protected is excuted in different class and different package");
		System.out.println("fname: "+fname+" ,lname: "+lname+" ,Age: "+age);
	}
	
	
}
