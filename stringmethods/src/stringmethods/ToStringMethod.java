package stringmethods;

public class ToStringMethod {

	public static void main(String[] args)
	{
	String Fname="Satish";
	String Lname="Rathod";
	
	//String representation
	System.out.println(Fname.toString());
	System.out.println(Lname.toString());
	
	//ASCII code of String
	System.out.println(Fname.hashCode());
    System.out.println(Lname.hashCode());
	
	//Compare the value of given string
	 System.out.println(Fname.equals(Lname));

	}
}
