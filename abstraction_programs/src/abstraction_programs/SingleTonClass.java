package abstraction_programs;

public class SingleTonClass {

	public static void main(String[] args) 
	{
      Account.methodhelp();
//      Account.methodhelp();

	}

}

class Account
{
	private static Account a;
	
	private Account()
	{
		System.out.println("object is created ");
	}
	
	public static Account methodhelp()
	{
		if(a==null)
		{
		    System.out.println("Object is created successfully");
			return a=new Account();
		}
		else
		{
			System.out.println("Object is already created");
		}
		return a;
	}
}
