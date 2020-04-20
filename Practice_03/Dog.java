package oopdemos;


public class Dog  extends Animal{

	 public void bark() {
		  super.makeSound();//Animal
	      System.out.println("Hav Hav");
	   }
	 
	
	 @Override
	  public void eat() {
	     super.eat();
	     System.out.println("I eat dog food");
	  }
	 
	 @Override
	  public void displayInfo(){
	      System.out.println("I am a " + type);
	      System.out.println("My color is " + getColor());
	   }
}