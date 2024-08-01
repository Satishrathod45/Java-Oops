package accessModifierss;

public class diffeclassanddiffpack 
{
	public int a=10;
	public int b=20;
	public int c=a+b;
	
	public void add()
	{
		System.out.println("Public executed in different class and different package");
		System.out.println("Sum is : "+c);
		
	}
}
