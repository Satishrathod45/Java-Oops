package interfaces_programs;

interface Runnable
{
   public static final int min=50;
   public abstract void show();
}


public class InterfaceExample implements Runnable 
{

	public void show()
	{
		System.out.println("Interface abstract method is excuted ");
		System.out.println("Minimum Number: "+min);
	}
	
	public static void main(String[] args)
	{
		InterfaceExample obj=new InterfaceExample();
		obj.show();
	}

}
