package day9;

public class ImmutabaleString {

	public static void main(String[] args) {
	
		
		//  Why string is immutable ??
		
		// Strings cannnot be replaced or muted (Once it is created its created)
		// Strings uses a concepts called string pool which objects are created 
		// Whenever we do some replacement new memory is not assigned 
		// Only mapping for the variable name is getting changed 
		
		String s = "Name" ;
		s = "Navin" ;
		
		

	}

}
