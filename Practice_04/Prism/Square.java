package PrismPack;

public class Square extends Shape2D
{
   private double side;
   
   public Square( double a )
   {
	  super();
      side = a;
   }
   
   public double area()
   {
      return( side * side );
   }

}
