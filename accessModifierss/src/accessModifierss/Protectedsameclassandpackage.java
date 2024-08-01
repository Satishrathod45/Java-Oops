package accessModifierss;

public class Protectedsameclassandpackage
{

	public static void main(String[] args) {
	        A obj=new A();
	        obj.display();

	}

}

class A{
	protected String name="akash";
	protected int id=123466;
	
	
	protected void display()
	{
		System.out.println("Protected is executed in same class and same package");
		System.out.println("Name: "+name+",id: "+id);
	}
	
}