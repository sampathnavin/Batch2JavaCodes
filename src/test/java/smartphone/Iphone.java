package smartphone;

public class Iphone extends Base {
	
	// What is inheritance ?
	 // Using extends keyword inheriting properties from parent class is called inheritance
	
	
	// Method Over riding // Dynamic Polymorphism // Run Time Polymorphism
	
	
	public void appsstores()
	{
		System.out.println("Apps Store");
	}
	
	public void itunes()
	{
		System.out.println("Itunes");
	}
	
	@Override
	public void switchon() {
		System.out.println("Apple Logo should be displayed while turning on");
	}

}
