package abstraction_programs;

abstract class Bike
{
	Bike()
	{
		System.out.println("bike is created: ");
	}
    abstract int run(int a,int b);
    
    void changeGear()
    {
    	System.out.println("gear changed");
    }  
    
}

class Honda extends Bike
{
	
	
	@Override
//    int run() {
//        System.out.println("Honda bike is running safely");
//        return 0;
//    }
	
    public int run(int a,int b)
	{
		int c=a+b;
		return c;	}
	
}

public class AbstractTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Bike obj=new Honda();
        System.out.println(obj.run(10,20));
        obj.changeGear();
	}

}
