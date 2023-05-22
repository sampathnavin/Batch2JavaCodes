package day12;

public class ControlStatement {

	public static void main(String[] args) {

		// Use control Statement 
		
		// 1 Check for Navin
		// 2 Kumar 
		// 3 Sampath
		// 4 Nothing is there
		
		
		String s = "I am Learning JAVA" ;
		
		if(s.contains("Navin"))
		{
			System.out.println("It contains Navin");
		}
		else if (s.contains("Kumar"))
		{
			System.out.println("It contains Kumar");
		}
		else if(s.contains("Sampath"))
		{
			System.out.println("It contains Sampath");
		}
		else if(s.equalsIgnoreCase("java"))
		{
			System.out.println("*****88");
		}
		else
		{
			System.out.println("Nothing is there ");
		}
		
	}

}
