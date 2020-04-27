package PrismPack;

public class Circle extends Shape2D
{
   double radius;
   
   public Circle( double r )
   {
	   super();
      radius = r;
   }

   public double area()
   {
      return( Math.PI * radius * radius );
   }

}