package cs.java.practice_02; //Who I AM

import java.util.Scanner; //WHO I USE

public class InputOutput {

	
	//Class Level
	 Scanner scanner;
	 
	 public InputOutput()
	 {
		 scanner = new Scanner(System.in); 
	 }
	 
	 
	 
	 
	    public String getConsoleInputTxt(String msg)
	    {
	    	
	    	 //Msg For INstruction
	    	 System.out.println(msg);
	    	 String userInputTxt  = this.scanner.nextLine();//Read From User String
	    	 return userInputTxt;

	    }
	    
	    public int getConsoleInputNumeric(String msg)
	    {
	    	
	    	 //Msg For INstruction
	    	 System.out.println(msg);
	    	 int userInputNum  = this.scanner.nextInt();//Read From User String
	    	 return userInputNum;

	    }
	 
	 
	 
	 
	 

	
	
	
	
}
