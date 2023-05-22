package day6;

public class OopsTrainings {
	
	//what is methods ??
	//  Activities or functions that needs to be performed 

// where we can create a methods ?
	// Methods cannot be created in main function { } 
	
	public void add()
	{
		int x = 10 ;
		int y = 20 ;
		int z = x+y ;
		System.out.println(z);
	}

	public static void main(String[] args) {
		
		//  What is objects ?
			// Caling a methods by creating reference variable to the class/diff classes 
		
		OopsTrainings x = new OopsTrainings();
		x.add();
		
		OperatorsTraining y = new OperatorsTraining();
		y.on();
		
		

	}

}
