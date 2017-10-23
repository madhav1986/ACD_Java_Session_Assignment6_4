package assignment6; // package declaration is compulsory.
import java.util.Scanner; // import scanner class
/*
 This program will help you understand the concepts of Exception handling using Bank ATM example.
 */
class BankAtm
{
	//variables declaration
	int atmId;
	String bankName;
	String location;
	static double balance=50000;
	
	public void withdraw(double amt) // method for amount withdrawal
	{
		
		if(balance < 10000) // logic to check the balance and exception will be thrown accordingly.
		{
			try
			{
			throw new BankATMException(); //throw exception BankATMException
			}
			catch(BankATMException be)
			{
				be.printStackTrace(); //method prints a stack trace for exception
			}
		}
		
		else if (amt>balance) // if withdrawal amount is greater than available balance, withdrawal will not be allowed
		{
			System.out.println("You can't withdraw as the withdrawal amount is greater than available balance");
			
		}
		else 
		{
			System.out.println("Available balance = "+balance);
			balance=balance-amt;
			System.out.println("Remaining Balance after withdrawal= "+balance);
		}
		
		
		
			
	}
	
	public void deposit(double amt) // method to deposit amount 
	{
		System.out.println("Available balance = "+balance);
		balance=balance+amt;
		System.out.println("Total Balance after deposit = " +balance);
	}
}

@SuppressWarnings("serial")
class BankATMException extends Throwable // user defined exception extending throwable class
{
	BankATMException() // constructor of BankATMException class
	{
		System.out.println("Can't withdraw as balance is less than 10000");
	}
}
	

public class Assignment6_4 // main class
{
	
	public static void main(String args[]) // main method starts
	{
		// variables declaration
		int choice;
		double amt;
		Scanner input=new Scanner(System.in); // Scanner to take input from user.
		System.out.println("Enter 1 for Withdraw and 2 for Deposit : ");
		choice=input.nextInt(); // initialize the choice variable
		
		// creating the objects of BankAtm class
		BankAtm obj1=new BankAtm();
		BankAtm obj2=new BankAtm();
		BankAtm obj3=new BankAtm();
		
		switch(choice) // logic for switch statement as per the user's choice to withdraw or deposit amount
		{
		case 1: System.out.println("Enter the withdrawal amount : ");
				amt=input.nextDouble(); // initialize the amount variable
				obj1.withdraw(amt); // calling the withdraw method through first object
				System.out.println("Enter the withdrawal amount : ");
				amt=input.nextDouble(); // initialize the amount variable
				obj2.withdraw(amt); // calling the withdraw method through second object
				System.out.println("Enter the withdrawal amount : ");
				amt=input.nextDouble(); // initialize the amount variable
				obj3.withdraw(amt); // calling the withdraw method through second object
				break;
				
		case 2 : System.out.println("Enter the amount to be deposited : ");
				 amt=input.nextDouble(); // initialize the amount variable
				 obj1.deposit(amt); // calling the deposit method through first object
				 System.out.println("Enter the amount to be deposited : ");
				 amt=input.nextDouble(); // initialize the amount variable
				 obj2.deposit(amt); // calling the deposit method through second object
				 System.out.println("Enter the amount to be deposited : ");
				 amt=input.nextDouble(); // initialize the amount variable
				 obj3.deposit(amt); // calling the deposit method through third object
				 
		default : System.out.println("Incorrect choice ");
		}
		
		input.close();
	}
	
}
