package day13;

public class Polymorphism extends PolymorphismMethods {


	@Override
	public int add(int a) {
		int b = 20 ;
		int c = a +b ;
		System.out.println(c);
		return c ;
		
	}

	public static void main(String[] args) {
		
		PolymorphismMethods pm = new PolymorphismMethods() ;
		
		pm.add(10, 20);
		
		//  What is run time polymorphism ?? 
		
		pm.add(10,70);
		pm.add(10,20,30,40);
		pm.add(10,40,50);

		Polymorphism p = new Polymorphism();
		p.add(12);
	

	}

}
