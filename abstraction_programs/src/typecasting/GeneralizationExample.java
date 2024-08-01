package typecasting;

public class GeneralizationExample {

	public static void main(String[] args)
	{
		Money m1=new Euro();//upcasting
		m1=new Rupees();
		 m1.display();
	     

//	        // Downcasting to access subclass-specific methods
	        if (m1 instanceof Euro) {
	            Euro euro = (Euro) m1;
	            euro.show();
	        }

	        if (m1 instanceof Rupees) {
	            Rupees rupees = (Rupees) m1;
	            rupees.work();
	        }

	}

}

class Money
{
	int money=1000;
	public void display()
	{
     System.out.println("Money is: "+money);
	}
}

class Euro extends Money
{
	String e="Euro";
    public void show()
    {
    	System.out.println("Euro is:"+e);
    }			
}

class Rupees extends Money
{
	public void work()
	{
		System.out.println("Ruppes is executed");
	}
}
