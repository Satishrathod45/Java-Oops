package javabasic;


public class Single 
{
	public void eating() 
	{
		System.out.println("Eating");
	}
}



class single1 extends Single
{
	public void running() 
	{
		System.out.println("running");
	}
	
	public static void main(String args[])
	{
		single1 s=new single1();
		s.eating();
		s.running();
		
	}
}

