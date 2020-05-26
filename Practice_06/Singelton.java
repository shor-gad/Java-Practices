package uml.demos;

public class Singelton {
	
	
	private static Singelton singelton_Instatnce = null; 
	
	public String data = "AAA";
     
	
	
	 private  Singelton()
	 {
		 
	 }
	
	 //Get Same Reference Object
	 public static Singelton GetInstance()
	 {
		 if (singelton_Instatnce == null)
		 { singelton_Instatnce = new Singelton();}
		 
		 return singelton_Instatnce;
		
	 }
	 
	
}
