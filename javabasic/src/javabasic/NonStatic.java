package javabasic;

public class NonStatic 
{
	{
		System.out.println("Non Static  blocks executed");
	}
	
	public NonStatic()
	{
	System.out.println("Constructor executed");
	}
      
	
	
	public static void main(String args[])
	{
		System.out.println("main method is executed");
		NonStatic ns1=new NonStatic();
		System.out.println();
		NonStatic ns2=new NonStatic();
		System.out.println("main method is end");
		
	}
	
	
}
