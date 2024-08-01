package constructorchaining;

public class Constructorchain_this
{
         
	public  Constructorchain_this() {}

	public  Constructorchain_this(int age,int sal) {
		this();
		System.out.println("Age: "+age+ ",Salary: "+sal);
	}
	
	public  Constructorchain_this(String fname,String lname) {
		this(22,50000);
		System.out.println("fname: "+fname+" ,lname: "+lname);
	}
	
	 public Constructorchain_this(String college) {
		 this("ajay","roy");
		 System.out.println("College is: "+college);
	 }
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Constructorchain_this obj=new  Constructorchain_this("GECH");
	}

}
