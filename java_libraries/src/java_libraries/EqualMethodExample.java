package java_libraries;

public class EqualMethodExample {

	public static void main(String[] args)
	{
		EqualMethodExample c1=new EqualMethodExample();
		EqualMethodExample c2=new EqualMethodExample();
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c1.equals(c2));

	}
	

}
