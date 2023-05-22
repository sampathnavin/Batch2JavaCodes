package day24;

public class InsufficException extends Exception {
	
	int amt ;
	
	// Constructor Overloading 
	//  Passing arguments inside the method 
	
	public InsufficException(int amount)
	{
		amount = amt ;
		System.out.println("Enter Less Amount" +amount);
	}

	
}
