package Inheritance_Programs;

class BaseClass
{
	public void basemethod()
	{
		System.out.println("Base method is implemetation");
	}
}

class ClassA extends BaseClass
{
	public void methodA()
	{
		System.out.println("Method A Implementd ");
	}
}

class ClassB extends BaseClass
{
	public void methodB()
	{
		System.out.println("Method B Implementd ");
	}
}

class DeriveA extends ClassA
{
	public void driveA()
	{
		System.out.println("Drived from A is implemented");
	}
}

class DeriveB extends ClassB
{
	public void driveB()
	{
		System.out.println("Drived from B is implemented");
	}
}

class HybridClass extends BaseClass
{
	private DeriveA DA=new DeriveA();
	private DeriveB DB=new DeriveB();
	
	public void methodA()
	{
		DA.methodA();
	}
	
	public void methodB()
	{
		DB.methodB();
	}
	
	public void driveA()
	{
		DA.driveA();
	}
	
	public void driveB()
	{
		DB.driveB();
	}
	
	public void methodc()
	{
		System.out.println("Method C Implementation");
	}
}


public class hybrid2 {

	public static void main(String[] args) 
	{
		HybridClass hy=new HybridClass();
		hy.basemethod();
		hy.methodA();
		hy.methodB();
		hy.driveA();
		hy.driveB();
		hy.methodc();

	}

}
