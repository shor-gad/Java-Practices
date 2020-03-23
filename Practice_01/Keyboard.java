package cs.java.practice_01;
import java.util.Scanner;

public class Keyboard {

	 private Scanner scanner;
	 
	
	 public Keyboard()
	 {
		 scanner = new Scanner(System.in);
	 }
	 
	 double GetWitdrawMoney()
	 {
		double sum =  scanner.nextDouble();
		return  sum;
	 }
	 
	
}
