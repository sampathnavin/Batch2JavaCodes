package day8;

public class StringandItsMethods {

	public static void main(String[] args) {
		
		// String Manipulation 
		
		// Length 
		String s = "Hi How are you ?" ;
		System.out.println(s.length());
		
		// Concatination 
		
		String FirstName = "Navin" ;
		String LastName = "Sampath" ;
		String MiddleName = "Kumar" ;
		String FullName = FirstName.concat(MiddleName);
		FullName = FullName.concat(LastName);
		System.out.println(FullName);
		
		// Changing to upper case 
		FullName = FullName.toUpperCase();
		System.out.println(FullName.toUpperCase());
		System.out.println(FullName);
		
		//Changing to lower case 
		FullName = FullName.toLowerCase();
		System.out.println(FullName.toLowerCase());
		System.out.println(FullName);
		
		
		// Comparing two string 
		
		String s1 = "java" ;
		String s2 = "JavA";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		// Replacing a character
		
		String date = "15-03-2023" ;
		System.out.println(date);
		
		// Client has a requirement to change - to /
		date = date.replace('-', '/');
		System.out.println(date);
		
		// Contains 
		String s3 = "java" ;
		String s4 = "Java" ;
		System.out.println(s3.contains(s4));
		
		
		
		

	}

}
