package day10;

import java.util.Scanner;

public class UserDefined {

	public static void main(String[] args) {
		
		
		// Scanner - User Defined - User is going to give the input 
		
		// Intitalizing - Hard coding 
		
		// int i = 10 ;
		
		// Initilizing scanner 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number" );
		
		int i = sc.nextInt();
		
		System.out.println("The number entered" +i);
		
		System.out.println("Enter the second number");
		
		int o = sc.nextInt() ;
		
		System.out.println("The number entered" +o);
		
		int c = i + o ;
		
		System.out.println("The addition of two numbers is " +c);
		
		
		
		

	}

}
