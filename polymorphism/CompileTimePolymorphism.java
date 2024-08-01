package polymorphism;

public class CompileTimePolymorphism 
{

	public static void main(String[] args) 
	{
	 Polymorphism p=new Polymorphism();
	 p.show(3,5);
	 p.show("satish","Rathod");
	 p.show(7.09876587); 
	}

}

class Polymorphism
{
	public void show(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum is: "+c);
	}
	
	public void show(String fname,String lname)
	{
		System.out.println("Fname is: "+fname+"Lname is: "+lname);
	}
	
	public void show(double num)
	{
		System.out.println("Number is: "+num);
	}
}
