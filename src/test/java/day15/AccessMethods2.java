package day15;

public class AccessMethods2 {
	

	public static void main(String[] args) {
		
		
		// Public 
		// Default i can able to override in any package or any class 
		
		AccessModifiers am = new AccessModifiers();
		am.AccountName = "Sampath" ;
		am.AccountNo = 3213;
		
		// Final keyword we cannot able to override it more secured 
		//  am.dateob = "20-09-1998"; (Error)
		System.out.println(am.dateob);
		
		System.out.println(am.phoneno);
		
		am.phoneno = "81908549619" ;
		
		am.accono();

	}


}
