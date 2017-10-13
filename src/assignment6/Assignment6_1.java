package assignment6; // package declaration is compulsory.
/*
 This class will initialize array of size 10 and print all even numbers from array.
 */
public class Assignment6_1 
{

	public static void main(String[] args) // main method starts
	{
		// TODO Auto-generated method stub
		
		//Declare array of size 10
		int[] intArray=new int[10];
		
		// Initialize the array
		for (int i=0;i<10;i++) // loop to initialize the variable and check the required condition
		{
			intArray[i]=i+1; // assigning value to array 
			
			
			// logic to print even numbers from array
			if (intArray[i] % 2 == 0)
				
			{
			
			System.out.println(intArray[i]); // printing even numbers
			
			}
		}
		

	}

}
