package smartphone;

public class Working {

	public static void main(String[] args) {
		
		Base b = new Base() ;
		
		Iphone y = new Iphone();
		y.appsstores();
		y.itunes();
		y.switchoff();
		
		
		System.out.println("Before Overiding In parent class ");
		b.switchon();
		
		System.out.println("After Overding in sub classes ");
		// Overriding methods 
		y.switchon();

		
		System.out.println("****************");
		
		Samsung z = new Samsung();
		z.ultrazooming();
		
		z.switchon();
		
		// Overriden methods 
		z.switchoff();
		

	}

}
