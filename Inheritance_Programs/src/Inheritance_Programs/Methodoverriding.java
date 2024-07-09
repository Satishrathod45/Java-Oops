package Inheritance_Programs;


class Super
{
	public void method()
	{
		String fname="Satish";
		String lname="Rathod" ;
		int id=56;
		System.out.println("FName: "+fname+",Lname: "+lname+",ID: "+id);
	}
}

class Sub extends Super
{
	public void method()
	{
		super.method();
		int a=20;
		int b=49;
		int sum=a+b;
		System.out.println("Sum is: "+sum);
	}
	
}


public class Methodoverriding {

	public static void main(String[] args) 
	{
		Sub s=new Sub();
		s.method();

	}

}
