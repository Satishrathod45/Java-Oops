package Inheritance_Programs;


 class Single 
{
	public void eating() 
	{
		System.out.println("Eating");
	}
}



class Dog extends Single
{
	public void running() 
	{
		System.out.println("running");
	}
	
	public static void main(String args[])
	{
		Dog s=new Dog();
		s.eating();
		s.running();
		
	}
}


