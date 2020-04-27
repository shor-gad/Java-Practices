package oopdemos;
import java.util.ArrayList;;



public class App {

	public static void main(String[] args) {
		
		  System.out.println("------1. Dog Initialized and operations---------");
		  //TODO Auto-generated method stub
		  Dog dog1 = new Dog();
	      dog1.eat();
	      dog1.sleep();
	      dog1.bark();
	      dog1.setColor("black");
	      dog1.displayInfo(); 
	      

	      
	      System.out.println("--------2. Animal a1 Initialized---------");
	      //declaration of object variable a1 of the Animal class
	      Animal a1;
	    
	    // object creation of the Animal class
	      a1 = new Animal();
	      a1.setColor("<NO COLOR>");
	    
	    //  a1.displayInfo();
	    
	      System.out.println("--------3. Polimorphism---------");
	      // object creation of  dog defined as Animal (polimrphism)
	      Animal a2 = new Dog();
	      a2.displayInfo();
	      
	      TestFunc(dog1);
	      
	      ArrayList<Animal> animalsList = new ArrayList<Animal>();
	      animalsList.add(a1);//Animal
	      animalsList.add(dog1);//Dog
	      
	      for(Animal animalObj:animalsList)
	      {
	    	  animalObj.displayInfo();// displayInfo will excute difrently by memory allocation
	      }
	     
	      
	      
	      
	    //  a1.setColor("White");
	     // a2.displayInfo();
	      
	   
	      
	      
	      
	      
	      
	}
	
	//Animal a  = dog1;
	 static void TestFunc(Animal a)
	{
		
		 if (a instanceof Dog)
			 ((Dog)a).setIsCute(false);//DownCasting
		 
		
		a.displayInfo();//Polimorphism 
	}
	
	 
	 
	 
	

}
