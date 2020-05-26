package uml.demos;

public class main {

	public static void main(String[] args) {
		
		
		
		//Not Allowed to crete externally the class constractor is public
               //   Singelton s = new Singelton();
               //   s.data
		
		//Singelton s = new Singelton();
	          Singelton s1 = 	Singelton.GetInstance();   // static :run by class name  not by object
	          s1.data = "XXXXX";
	    
	    
	          Singelton s2 = 	Singelton.GetInstance();   // static :run by class name  not by object
	          System.out.println(s2.data); // XXXXX
	    	  s2.data = "YYYYY";

	         System.out.println(s1.data);//YYYYY
	         System.out.println(s2.data);//YYYYY
	         System.out.println(Singelton.GetInstance().data);//"YYYYY"
	    
	}

}
