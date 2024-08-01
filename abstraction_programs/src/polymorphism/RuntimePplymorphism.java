package polymorphism;

public class RuntimePplymorphism
{

	public static void main(String[] args)
	{
		Bank b;
		b=new SBI();
		System.out.println("SBI rante of interest is :"+b.rateOfInterest());

		b=new ICIC();
		System.out.println("SBI rante of interest is :"+b.rateOfInterest());

	}

}

class Bank
{
	public float rateOfInterest()
	{
	   float rate=0;
	   return rate;
	}
}

class SBI extends Bank
{
	public float rateOfInterest()
	{
	   float rate1=2.76f;
	   float rate2=567.89f;
	   float sum;
	   return sum=rate1+rate2;
	}
}

class ICIC extends Bank
{
	public float rateOfInterest()
	{
	  
	   return 9.7f;
	}

}

