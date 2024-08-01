package constructorchaining;


class Demo
{
	public Demo(int age) {
		System.out.println("Age: "+age);
	}
}

public class Constructorchain_Super extends Demo
{
      public Constructorchain_Super(String fname,String lname) {
    	  super(22);
    	  System.out.println("fname: "+fname+",lname: "+lname);
      }
	
	public static void main(String[] args) 
	{
		Constructorchain_Super obj=new Constructorchain_Super("satish","rathod");
     
	}

}

