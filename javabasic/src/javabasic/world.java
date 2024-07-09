package javabasic;
 class hello
{
	public void eat()
	{
		System.out.println("hello");
	}
}
 
 class world extends hello
 {
	 
	 public void run() {
		 System.out.println("running");
	 }
	 
	public static void main(String[] args) 
	{
	   world h=new world();
	   h.eat();
	   h.run();

	}

}
