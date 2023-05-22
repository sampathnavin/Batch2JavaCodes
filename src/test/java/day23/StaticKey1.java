package day23;

public class StaticKey1 {
	
	// static keyword without creating an object we can call the method or variables 
	
	
	public static int a = 10 ;
	
	int b = 23 ;
	
	public static void dummy()
	{
		System.out.println("Dummy Methods");
	}
	
	static {
		System.out.println("*********");
	}
	
	public static void main(String[] args) 
	{
		// Static Block without any access modifiers will execute along with main method 
	}

}
