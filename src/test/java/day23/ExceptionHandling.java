package day23;

import java.util.Scanner;

public class ExceptionHandling {
	
	
	public void sum()
	{
		int a = 0 ;
		int b = 0 ;
		
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the First Number");
			a = s.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Enter the Proper Number" +e);
		}
		try
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the Second Number");
			b = s1.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Enter the Proper Number" +e);
		}
		int c = a+b;
		System.out.println(c);
		
		
	}
	
	
	

}
