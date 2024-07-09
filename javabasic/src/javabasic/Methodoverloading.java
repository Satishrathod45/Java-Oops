package javabasic;

public class Methodoverloading 
{
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static int add(int c,int d,int e)
	{
		return c+d+e;
	}
	

	public static void main(String[] args) 
	{
//		add(1,3);
//		add(4,7,8);
		System.out.println(add(1,3));
		System.out.println(add(1,5,7));

	}

}
