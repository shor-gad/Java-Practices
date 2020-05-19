package EXCEPTION.JAVA;

public class TestException {

	static void myMethod(int num) throws MyAppException 
	{
		System.out.println("START - myMethod");
		if (num == -1)
		{
			Exception ex = new MyAppException("My Exception !!!!!!!!");
			throw ex;
			
			//System.out.println("After - myMethod");
			//return;
		}
		else
		{
			System.out.println("Not -1 ALL OK");
		}
	}
	
	
	

}
