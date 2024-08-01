package abstraction_programs;


abstract class Demo
{
	public  void display()
	{
		System.out.println("Hello world!!!");
	}
	abstract  int add(int a,int b);
}

class B extends Demo
{
	public int add(int a,int b)
	{
		return a+b;
	}
}


public class Abstraction3
{
  public static void main(String[] args)
  {  
	
	 Demo obj=new B();
	 obj.display();
	 System.out.println(obj.add(3, 5));
  }
}
