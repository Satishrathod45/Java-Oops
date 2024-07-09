package javabasic;
import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter integer numbers");
	int num1=sc.nextInt();
	
	System.out.println("Enter float numbers");
	float num2=sc.nextFloat();
	
	System.out.println("Enter double numbers");
	double num3=sc.nextDouble();
	
	System.out.println("Enter long numbers");
	long num4=sc.nextLong();

	System.out.println("Enter String  numbers");
	String num5=sc.nextLine();
	
	System.out.println("Enter character numbers");
	char num6=sc.next().charAt(0);
	
	System.out.println("Enter byte numbers");
	byte num7=sc.nextByte();
	
	System.out.println("Enter boolean numbers");
	boolean num8=sc.nextBoolean();
	

	
    sc.close();
	}

}
