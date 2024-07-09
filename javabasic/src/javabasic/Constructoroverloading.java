package javabasic;

public class Constructoroverloading
{
	
	public  Constructoroverloading(String fname,String lname,int id)
	
	{
		System.out.println("fname: "+fname+", lname: "+lname+", id "+id);
	}
	
    public  Constructoroverloading(int a,int b)
	
	{
		System.out.println("A: "+a+", B"+b);
	}
	
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Constructoroverloading obj1=new Constructoroverloading("sati","rathod",133);
		Constructoroverloading obj2=new Constructoroverloading(2,5);
	}

}
