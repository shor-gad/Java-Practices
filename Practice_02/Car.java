package cs.java.practice_01;

import cs.java.practice_02.InputOutput;


//1)  Fields
//2)  Constractor
//3)  GETERS AND SETTERS
//4)  LOGIC Methods
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
	 
	 
	 //carId Gettr 
	 public String getCarId()
	 {
		 return this.carId;
	 }
	 
	 //1) Access to Private Member
	 //2) Validation
	
        //carId Setter 
       public void setCarId(String carID)//Public
	 {
		 if (!((carID == "") || (carID.length()<5)))
		 {
			 this.carId = carID;//Private
		 }
		
	 }
	 
	 
	 
	 
	 
	
	public void SetCarIdByConsole()
	 {
		 InputOutput io = new InputOutput();//Memory Usage
		 String  id =  io.getConsoleInputTxt("Get ID: ");
		 this.carId = id;
		 
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
	 
	 public void PrintDetails()
	 {
		 System.out.println(this.carId+"-"+this.carColor+"-"+this.carType);
	 }
	 
	 
	 
	 
	 
	
}
