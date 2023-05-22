package doubtsbarani;

import java.util.Scanner;

import day24.InsufficException;

public class methodexception {
	
	public void windingmachine()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Amount");
		int d = s.nextInt();
		
		try
		{
			if (d!=1 && d!=5 && d!=10 && d!=20)
			{
				throw new ownexception();
			}
			
		}
		catch(ownexception e)
		{
			System.out.println(e);
		}
	}

}
