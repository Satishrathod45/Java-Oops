package Inheritance_Programs;

class Student
{
	public void cs() 
	{
		System.out.println("Computer Science and Engineering");
	}
}

class Lecture extends Student
{
	public void Ec()
	{
		System.out.println("Electronics and Communication");
	}
}

public class Sathi extends Lecture
{
	public void civ()
	{
		System.out.println("Civil engineering");
	}
	
     public static void main(String args[])
     {
    	 Sathi s=new Sathi();
    	 s.cs();
    	 s.Ec();
    	 s.civ();
     }
}
