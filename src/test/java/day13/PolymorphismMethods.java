package day13;

public class PolymorphismMethods {
	
	// Void - Will not return anything 
	
	// Passing arguments inside the methods 
	
	// Polymorphism - One to Many 
	
	// Method Overriding : 
		// Dynamic polymorphism : Run time Polymorhism 
	
	
	
	// Method Overloading :
		// Static Polymorohism : Compile time polymorophism
		
	// What is Method Overloading ??
	// What is Static Polymorphism ??
	// What is compile time Polymorphism ??
	
	// With the same method name but different arguments it is known 
	    // as method overloading or dynamic polymorphism  
	
	 
	public int add(int a)
	{
		int c = a ;
		System.out.println(c);
		return c;
	}
	
	public int add(int a, int b)
	{
		int c = a+b ;
		System.out.println(c);
		return c;
	}

	public int add(int a, int b, int z)
	{
		int c = a+b+z;
		System.out.println(c);
		return c;
	}
	
	
	public int add(int a, int b, int z, int d)
	{
		int c = a+b+z+d ;
		System.out.println(c);
		return c;
	}
	
	
	

}
