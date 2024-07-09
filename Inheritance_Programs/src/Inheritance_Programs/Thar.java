package Inheritance_Programs;

class Fortuner
{
	public void fortuner() 
	{
		String brand="fortuner";
		long prize=300000000;
		System.out.println("brand="+brand+ ",prize= "+prize);
	}
	
}

class Maruthi extends Fortuner
{
	public void maruti()
	{
		System.out.println("This is a brand and low prize car");
	}
}
public class Thar extends  Maruthi
{
       public void thar()
       {
    	   System.out.println("This is very high cost car");
       }
       
       public static void main(String args[])
       {
    	   Thar t=new Thar();
    	   t.fortuner();
    	   t.maruti();
    	   t.thar();
       }
}
