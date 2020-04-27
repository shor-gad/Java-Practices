package PrismPack;

public class Prism {
	
	   private Shape2D base;//shape (Circle,Squere)
	   private double height;

	   public Prism( Shape2D b, double h )
	   {
	      base = b;
	      height = h;
	   }
	   
	   
	   public double volume()
	   {
	      return( height * base.area() );//Polimormopism
	   }
  	
}
