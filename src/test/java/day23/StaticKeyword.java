package day23;

public class StaticKeyword {
	
	public static void main(String[] args) {
		
		System.out.println(StaticKey1.a);
		
		StaticKey1.a = 14 ;
		
		System.out.println(StaticKey1.a);
		
		StaticKey1.dummy();
		
	}

}
