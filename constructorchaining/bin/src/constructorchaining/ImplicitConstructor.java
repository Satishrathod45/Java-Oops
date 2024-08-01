package constructorchaining;

class Implicit
{
	Implicit(){
		System.out.println("Implicit constructor is executed");
	}
	
}

public class ImplicitConstructor extends Implicit 
{
	ImplicitConstructor ()
	{
		System.out.println("inner implicit Constructor is executed");
	}
	

	public static void main(String[] args) 
	{
		ImplicitConstructor ob=new ImplicitConstructor ();

	}

}
