package pack;

import accessModifierss.Protecteddiffclass;

public class Subclass extends Protecteddiffclass
{

	
	 public Subclass() 
	 {
	        super();
	    }

	public  void show()
	{
		System.out.println("Protected is executed ");
	}
	
	public static void main(String[] args) 
	{
		 Subclass obj=new  Subclass();
		 obj.show();
		 obj.dis();
		

	}

}
