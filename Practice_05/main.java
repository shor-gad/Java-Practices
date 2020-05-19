package EXCEPTION.JAVA;

public class main {

	
	static int Calculate(int a,int b)
	{
		 int res  = 0;
	     res = 	a/b;
	     return res;
		
	}
	
	static int Calculate2(int a,int b) throws MyAppException
	{
		int res = 0;
		try
		{
			res = Calculate(10,0);
		}
		catch(Exception ex)
		{
			//RETHROW EXCEPTIUON
			throw new MyAppException("Nice Msg",ex);
			
		}
		return  res;
		
		
		
	}
	
	
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
	
		
		
		
		
		try {
	 // System.out.println(s.length()); //NULL REFERENCE EXCEPTION
	     
	    //int mone = 0;
	   // int num = 10/mone; 
			
			//int res = Calculate(10,2);
			//System.out.println("RESULT:"+res);
	 
			TestException.myMethod(-1);
			// 01) TRY CATCH REQUIRED
			// 02) DECLARE throws Exception
			
			
			
		}
		
	//	catch(NullPointerException |MyAppException e)  
	//	{  
		    ////handling the exception  
	//	}
		
		catch(ArithmeticException ex)
		{
			 System.out.println(ex.toString());
			//Handle Exception
			//LOG / FILE / DB
		}
		catch(MyAppException ex)
		{
			
			 System.out.println(ex.toString());
			//Handle Exception
			//LOG / FILE / DB
		}
		
		
		catch(Exception ex)
		{
			 System.out.println(ex.toString());
			//Handle Exception
			//LOG / FILE / DB
		}
		finally
		{
			//DO THINGS if there WAS/WASNOT EXCEPTION
			
			 System.out.println("FINALLY BLOCK");
			 //CLOSE / DOISPOSES RESOURCES
		}
		
		 System.out.println("AFTER FINALLY");
	     
		
	}

}
