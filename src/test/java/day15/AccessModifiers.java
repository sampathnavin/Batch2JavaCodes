package day15;

public class AccessModifiers {
	
	// What are Access Modifiers ??
	
 	// PUBLIC - we can override easily accesible to all packages 
	// DEFAULT - we can override easily access only inside the packages 
	// PROTECTED -- // Same package we can override/ we can access it nut we cannot access it in different packages
	// PRIVATE -- // Encapsulation 
	// FINAL // We cannot override it, we can only access it , it is more secured 

	int AccountNo = 1234 ;
	String AccountName = "Navin" ;
	final String dateob = "29-08-1995" ;
	protected String phoneno = "9790299569";
	
	public String acco()
	{
		System.out.println(AccountName);
		System.out.println(AccountName);
		System.out.println(AccountName);
		System.out.println(AccountName);
		System.out.println(AccountName);
		System.out.println(AccountName);
		System.out.println(AccountName);
		System.out.println(AccountName);
		System.out.println(AccountName);
		System.out.println(AccountName);
		System.out.println(AccountName);
		System.out.println(AccountName);
		for (int i = 0 ; i <= 10 ; i++)
		{
			System.out.println(AccountName);
		}
		return AccountName;
	}
	
	protected int accono()
	{
		System.out.println(AccountNo);
		return AccountNo;
	}
	
	void no()
	{
		System.out.println("Simple Package");
	}


	
	

}
