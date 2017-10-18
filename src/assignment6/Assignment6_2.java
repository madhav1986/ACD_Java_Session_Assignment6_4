package assignment6; // package declaration is compulsory.
import java.util.Scanner; // import scanner class

@SuppressWarnings("serial")
class NegativeAgeException extends Exception // NegativeAgeException class extending Exception class
{
	// constructor of class NegativeAgeException to print the message of super class i.e. Exception class
	NegativeAgeException(String msg)
	{
		super(msg);
	}
}

public class Assignment6_2
{
	

	static void validateAge(int age) throws NegativeAgeException // method to throw NegativeAgeException
	{
		// logic to check whether age is valid or not
		if (age < 0)
		{
			throw new NegativeAgeException("age can't be negative");
		}
		else
		{
			System.out.println("You have entered valid age");
		}
	}
	
	public static void main(String[] args) // main method starts 
	{
		// TODO Auto-generated method stub
		// variable declaration
		int age;
		Scanner input = new Scanner(System.in); // Scanner to take input from user.
		
		System.out.println("Enter the age : ");
		age=input.nextInt(); // Initialize age variable
		
		input.close();
		
		// try catch block for exception handling
		try
		{
			validateAge(age); //calling validateAge method
		}
		
		catch(Exception e)
		{
			e.printStackTrace(); //method prints a stack trace for exception
		}
		
	}

}
