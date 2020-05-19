package EXCEPTION.JAVA;

public class MyAppException  extends Exception {


	public MyAppException()
	   {
		   super();
	   }
	 
   public MyAppException(String msg)
   {
	   super(msg);
   }
   
   public  MyAppException(String msg,Exception ex)
   {
	   super( msg,ex);
   }
    
  
	
	
}
