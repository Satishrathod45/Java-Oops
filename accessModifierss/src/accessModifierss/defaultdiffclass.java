package accessModifierss;

class defaultdiffclass 
{
    public static void main(String args[])
    {
    	Demo d=new Demo();
    	d.display(); 
    }		
}


class Demo
{
	String name;
	int pass;
	
	void display()
	{
		name="Satish";
		pass=12234;
		System.out.println("Name: "+name+" ,pass: "+pass);
	}
}



