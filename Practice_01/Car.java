package cs.java.practice_01;

public class Car {
	
	// 01: Fields (Behiviors)
	private String carColor;
	private String carId;
	private String carType;
	private int carYear;
	private CarEngine carEngine;
	 
	// 02: Constructors (Initialization method)
	 public Car(String id,String type,String color,int year)
	 {
		 
		 carId = id;
		 carType = type;
		 carColor = color;
		 carYear = year;
		 carEngine = new CarEngine();
		 
		 System.out.println("Car Initialized");
	
	 }
	 
	 public Car()
	 {
		 carId = "";
		 carType = "";
		 carColor = "WHITE";
		 carYear = -1;
		 carEngine = new CarEngine();
		 
		 System.out.println("Car Initialized");
		 
	 }
	 
		
	// 03: methods (operation)
	 public void drive()
	 {
		 carEngine.start();
		 String msg = "CAR DRIVING:"+carId;
		 System.out.println(msg);
		
	 }
	 
	 public void drive(int speed)
	 {
		 String msg = "CAR DRIVING A: "+carId + "AT SPEED: +"speed;
		 System.out.println(msg);
		
	 }
	 
	 
	 public void  changeColor(String newColor)
	 {
		
		 //Validation Logic
		  carColor = newColor;
		  System.out.println("Changed Color to" + newColor);
     }
	 
	 
	// 03: methods (operation)
	 public void stop()
	 {
		 this.carEngine.stop();
		 
		 String msg = "CAR Stoped: "+carId;
		 System.out.println(msg);
		
	 }
	
}
