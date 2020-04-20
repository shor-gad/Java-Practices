package oopdemos;

public class Animal
{
	   protected String type="Animal"; //access from same package and subclasses
	   private String color; //access from same class only

	 public Animal()
	 {
		 System.out.println("Animal Initialized");
	 }
	   
	 public void eat() {
	      System.out.println("Animal eat....");
	   }
	 
	 public void sleep() {
	      System.out.println("Animal sleep...");
	   }
	 
	 public void makeSound() {
	      System.out.println("Animal Make Voice...");
	   }
	 
	  public String getColor(){
	      return color;
	   }

	   public void setColor(String col){
	      color = col;
	   }

	public void displayInfo() {
		  System.out.println("I am a " + type);
	      System.out.println("My color is " + getColor());	// TODO Auto-generated method stub
		
	}
	 
}

