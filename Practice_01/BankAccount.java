package cs.java.practice_01;


public class BankAccount
{
   private double acctBalance = 0;
   
   public BankAccount( double initialDeposit)
   {
      acctBalance = initialDeposit; 
   }

 
   public double balance()
   {
      return( acctBalance ); 
   }
  
   public void deposit( double amount )
   {
      acctBalance += amount;
   }

   public boolean verify( int name, String pw )
   {
      return( true );
   }

 
   public void withdraw( double amount )
   {
      acctBalance -= amount;
   }

}
