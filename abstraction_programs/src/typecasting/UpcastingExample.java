package typecasting;

public class UpcastingExample {

	public static void main(String[] args) 
	{
	   Parent p=new Son();
	   p.show();//upcasting taking only parent properties
	   //p.Display //not taking any child properties
	}

}

class Parent
{
	String Pname="XYZ";
	int age=22;
	void show()
	{
	System.out.println("Parent method is executed");
    System.out.println("Pname is: "+Pname+"  and Age is: "+age);
	}
}

class Son extends Parent
{
	String Sname="ABC";
	int Sage=15;
	void Display()
	{
	System.out.println("child method is executed");
    System.out.println("Sname is: "+Sname+"and SAge is: "+Sage);
	}
}
