package Inheritance_Programs;


class Cat
{
	public void cat()
	{
		String name="possy";
		String breed="perschien";
		System.out.println("name=" +name+ ", breed= "+breed);
	}

}
public class Animal extends Cat
{
	
	 public static void main(String args[])
	    {
	   Animal a=new Animal();
	     a.cat();
	     a.animal();
	    }
   
	 public void animal()
    {
    	System.out.println("This is aniaml");
    }
   
}
