package oopdemos;


public class Dog  extends Animal{

	private boolean isCute = true;
	//protected String type;
	public Dog()
	{
		super();
		
		//super.type = "Dog";
		type  = "dog";
		isCute = true;
		System.out.println("DOG Initialized");
	}
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
	
		  System.out.println("----Dog displayInfo()----");
		  System.out.println("type:" + super.type + " | color:"+ getColor()+
				  " | "+this.isCute);
		  System.out.println("----------------------------");
		
	      
	   }
	 
	  public boolean getIsCute(){
	      return isCute;
	   }

	   public void setIsCute(boolean cute){
		   isCute = cute;
	   }
	 
	 
}