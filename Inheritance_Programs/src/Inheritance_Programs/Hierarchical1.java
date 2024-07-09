package Inheritance_Programs;

class ani
{
	void eat()
	{
		System.out.println("aniaml is eating");
	}
}

class handi extends ani
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}

class cati extends ani
{
	void meow()
	{
		System.out.println("cat is meowing");
	}
}


public class Hierarchical1 
{
  public static void main(String args[]) 
  {
	  handi d=new handi();
	  d.bark();
	  d.eat();
	  
	  cati c=new cati();
	  
	  c.meow();
	  c.eat();
  }

}
