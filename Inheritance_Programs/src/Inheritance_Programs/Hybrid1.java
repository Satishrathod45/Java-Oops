package Inheritance_Programs;

class GrandMother
{
	public void showG()
	{
		System.out.println("she is grandmother .");
	}
}

class Mother extends GrandMother
{
	public void ShowM()
	{
		System.out.println("She is mother.");
	}
}

class Daughter extends Mother
{
	public void showD()
	{
		System.out.println("She is daughter.");
	}
}

class Son extends Mother{
	public void ShowS()
	{
		System.out.println("He is Son.");
	}
}



public class Hybrid1 
{

	public static void main(String[] args)
	{
		Daughter ob=new Daughter();
		ob.showD();
		ob.ShowM();
		ob.showG();
		
		System.out.println("----------------------------------------------------");
		
		Son so=new Son();
		so.ShowS();
		so.ShowM();
		so.showG();

	}

}
