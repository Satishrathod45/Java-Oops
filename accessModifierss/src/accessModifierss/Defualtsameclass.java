package accessModifierss;

class Defualtsameclass 
{
	String fname;
	String lname;
	int id ;
	float salary;
	
	Defualtsameclass(String fname,String lname,int id,float sal)
	{
		this.fname=fname;
		this.lname=lname;
		this.id=id;
		this.salary=sal;
		
	}
	
	void defualt()
	{
		System.out.println("fname: "+this.fname);
	    System.out.println("lname: "+this.lname);
	    System.out.println("id: "+this.id);
	    System.out.println("salary: "+this.salary);
	
	
}
	
	
	public static void main(String[] args)
	{
	  Defualtsameclass d=new Defualtsameclass("Sati","Rathod",123,500000);
	  d.defualt();

	}

}
