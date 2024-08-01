package abstraction_programs;


abstract class Shape
{
      abstract void draw();
}

class Rectangle extends Shape
{
      public void draw()
      {
            System.out.println("Drawing a rectangle");
      }
}

class Circle extends Shape
{
      public void draw()
      {
            System.out.println("Drawing a circle");
      }
}

public class AbstractionExample
{
      public static void main(String args[])
      {
    	    Shape s=new Rectangle();
            Shape c=new Circle();
            s.draw();
            c.draw();
      }
}


