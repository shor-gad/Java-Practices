package PrismPack;


import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		  Circle c = new Circle( 1.784 );
	      Prism p1 = new Prism( c, 3 );
	     
	      Square s = new Square( 2.828 );
	      Prism p2 = new Prism( s, 3.75 );
	      
	      System.out.println( "p1: " + p1.volume() );
	      System.out.println( "p2: " + p2.volume() );
	      
	      
	      ArrayList<Shape2D> shapes = new ArrayList<Shape2D>();
	      shapes.add(c);
	      shapes.add(s);
	      
	      for(Shape2D shape2dObj:shapes)
	      {
	    	  shape2dObj.area();// displayInfo will excute diffrently by memory allocation
	      }
	     
	      //Fit same prism height for all shapes
	      double testHeight = 4.57;
	      
	      for(Shape2D shape2dObj:shapes)
	      {
	    	  Prism p = new Prism(shape2dObj, testHeight );
	    	  System.out.println("3D Areae of "+
	    			              shape2dObj.getClass().getName()+":"
	    	                      +p.volume());
	      }
	      
	      
	}

}
