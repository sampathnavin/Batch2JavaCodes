package day14;

public class PolymorphismMethods {

	//  Polymorphism ??
	
	// One to many 
	
	// Method Overloading ??
	
	// Method Overriding ??
	
	
	// Method Overloading ??
	
		// We can have same method name with different arguments/parameters passed 
			// Method Overloading 
	
	// COmpile time polymorphism ?? Static Polymorphism ??
	
	// We can have same method name with different arguments/parameters passed 
				// Method Overloading 
	
	public String emp(String Id) 
	{
		String id = Id ;
		System.out.println(id);
		return id ;
	}
	
	public String emp(String sno , String Id)
	{
		String id = sno + " " + "," +Id ;
		System.out.println(id);
		return id ;
	}
	
	public String emp(String phno, String sno, String Id)
	{
		String e = sno+ ", " + Id +" ," + phno ;
		System.out.println(e);
		return e ;
	}
	

}
