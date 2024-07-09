package Inheritance_Programs;


class Vehicle {
	void start() {
		System.out.println("The vehicle starts:");
	}
}


class car extends Vehicle
{
	void drive() {
		System.out.println("The car is driving:");
	}
}

class Bike extends Vehicle
{
	void ride() {		
		System.out.println("The bike is being ridden");
	}
}

class Truck extends Vehicle{
	void load()
	{
		System.out.println("The truck is loading cargo.");
	}
}



public class heirarchical2 
{
	public static void main(String args[])
	{
		car c=new car();
		  c.start();
		  c.drive(); 
		  System.out.println("----------------------------------------------------------");
	    Bike b=new Bike();
	    b.start();
	    b.ride();
		System.out.println("----------------------------------------------------------");

	    Truck t=new Truck();
	    t.start();
	    t.load();
		
		  
	
		}
	}
  
