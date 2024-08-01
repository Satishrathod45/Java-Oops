package typecasting;

public class DowncastingExample {

	public static void main(String[] args) 
	{
		Father obj=new Child();//upcasting
		Child s=(Child) obj;//Downcasting
		s.show();
		s.Display();
		
	}

}
class Father
{
	String Pname="XYZ";
	int age=22;
	void show()
	{
	System.out.println("Parent method is executed");
    System.out.println("Pname is: "+Pname+"  and Age is: "+age);
	}
}

class Child extends Father
{
	String Sname="ABC";
	int Sage=15;
	void Display()
	{
	System.out.println("child method is executed");
    System.out.println("Sname is: "+Sname+"and SAge is: "+Sage);
	}
}

