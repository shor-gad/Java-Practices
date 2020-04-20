package oopdemos;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Dog dog1 = new Dog();
		  dog1.type = "DOG";
	      dog1.eat();
	      dog1.sleep();
	      dog1.bark();
	      dog1.setColor("black");
	      dog1.displayInfo(); 
	      
	      
	      
	      // declaration of object variable a1 of the Animal class
	      Animal a1;
	    
	    // object creation of the Animal class
	      a1 = new Animal();
	      a1.displayInfo();
	    
	      // object creation of  dog defined as Animal (polimrphism)
	      Animal a2 = new Dog();
	      a2.displayInfo();
	      
	      
	}

}
