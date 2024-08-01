package typecasting;

public class NarrowingExample {

	public static void main(String[] args)
	{
		//double to int
		double a=5.87654;
		int b=(int)a;
		System.out.println(b);
         
		//float to short
		long c=334567890;
		short d=(short) c;
		System.out.println(d);
	}

}
