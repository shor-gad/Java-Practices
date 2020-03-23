package cs.java.practice_01;

public class CarEngine {
  
	 private String id;
	 
	 public CarEngine(String id)
	 {
		 this.id = id;
	 }
	 
	 public CarEngine()
	 {
		 System.out.println("Engine Initialized");
		 this.id = "000-0000-000";
	 }
	 
	 public void start()
	 {
		 System.out.println("Engine Starter");
	 }
	 
	 public void stop()
	 {
		 System.out.println("Engine stop");
	 }
		
}
