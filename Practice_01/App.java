package cs.java.practice_01;

public class App {

	public static void main(String[] args) {
		
		//Object 
		  // - Memory data Isolated
		  // - Type OF CAR
		  // - use new 
		//Car c1 = new Car();//Empty Constractor
	
	
		Car c2 = new Car("232-34-32","Toyota","Black",20);
		c2.drive();
		c2.stop();
		c2.changeColor("Grey");
		
		
		
		System.out.println("---------------------------");
		
		Car c3 = new Car("3453-345-45","Audi","Red",18);		
		c3.drive();
		c3.stop();
		
		
		
		System.out.println("---------------------------");
		
		BankAccount b1 = new BankAccount(1000);
		b1.deposit(2000);
		double osh  = b1.balance();
		System.out.println(osh);
		
		System.out.println("---------------------------");
		
		System.out.println("Enter Withdraw Sum: ");
		Keyboard board = new Keyboard();
		double withdrawSum = board.GetWitdrawMoney();
		
		System.out.println("---------------------------");
		
		b1.withdraw(withdrawSum);
	        osh  = b1.balance();
		System.out.println("Balance: "+ osh);
		
		System.out.println("---------------------------");
		
		
		

	}

}
