package Inheritance_Programs;

class A
{
	public void Method()
	{
		System.out.println("Class A method is executed");
	}
}


class B extends A
{
	public void Method()
	{
		super.Method();
		System.out.println("Class B method is executed");
	}
}

class C extends B
{
	
	public void Method()
	{
		super.Method();
	
		System.out.println("Class C method is executed");
	}
}
	 


public class Super_keyword1 
{
  public static void main(String args[])
  {
	  C obj=new C();
	  obj.Method();
	 
  }
}
