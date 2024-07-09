package javabasic;
import java.util.Scanner;

public class ReverseNumber 
{
    
	public static int reverse(int num)
	{
		int rev=0;
		int rem;
		while(num != 0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	
	
	public static void main(String[] args) 
	{ 
	System.out.println("Enter a number ");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	
	int re=reverse (num);
		
	 System.out.println(re);
	}

}
