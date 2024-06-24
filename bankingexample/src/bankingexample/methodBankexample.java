package bankingexample;

public class Bank {
	static int currentBalance = 3000;
	public static void greetcustomer() {
		System.out.println("Hi, Welcome to our bank application");
		}
	public  void deposit(int lite)	{
		currentBalance = currentBalance + lite ;
		System.out.println("Amount is deposited sucessfully");
	}
	public static void withdraw(int amount) {
		currentBalance = currentBalance - amount ;
		System.out.println("Amount is withdrawn sucessfully");
		
	}
	   public static int getcurrentBalance() {
		return currentBalance;
		   
	   }
	   public static void main(String[] args) {
		 greetcustomer();
		 Bank bank= new Bank ();
				bank.deposit(700);
		 System.out.println("current balance is "+ getcurrentBalance());
		  withdraw(300);
		System.out.println("current balance is "+ getcurrentBalance());
		
		bank.deposit(700);
		 System.out.println("current balance is " +getcurrentBalance());

	}
}
