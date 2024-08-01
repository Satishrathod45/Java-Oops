package interfaces_programs;

interface Bank
{
	float rateOfInterest();
}

class SBI implements Bank
{
	public float rateOfInterest()
	{
		return 9.78f;
	}
}

class RBI implements Bank
{
	public float rateOfInterest()
	{
		return 9.5f;
	}
}


public class interfaceExample2 {

	public static void main(String[] args) 
	{
		Bank ob=new SBI();
	System.out.println(ob.rateOfInterest());
		
		Bank o=new RBI();
		System.out.println(o.rateOfInterest());

	}

}
