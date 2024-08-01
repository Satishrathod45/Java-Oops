package typecasting;

public class SerializationExample 
{
	public static void main(String[] args) {
		
	
	Money1 m1=new Euro1();//upcasting
	Money1 m2=new Rupees1();
	 m1.display();
	 m2.display();
     

//        // Downcasting to access subclass-specific methods
        if (m1 instanceof Euro1) {
            Euro1 euro = (Euro1) m1;
            euro.show();
        }

        if (m2 instanceof Rupees1) {
            Rupees1 rupees = (Rupees1) m2;
            rupees.work();
        }
 }
}

class Money1
{
	int money=1000;
	public void display()
	{
     System.out.println("Money is: "+money);
	}
}

class Euro1 extends Money1
{
	String e="Euro";
    public void show()
    {
    	System.out.println("Euro is:"+e);
    }			
}

class Rupees1 extends Money1
{
	public void work()
	{
		System.out.println("Ruppes is executed");
	}
}
