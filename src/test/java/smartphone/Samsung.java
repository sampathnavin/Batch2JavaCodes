package smartphone;

public class Samsung extends Base {
	
	// What is inheritance ?
		 // Using extends keyword inheriting properties from parent class is called inheritance
	
	public void ultrazooming()
	{
		System.out.println("We can Zoom the Moon");
	}
	
	@Override
	public void switchoff() {
		System.out.println("While switching off say Good Bye and Display samsung logo");	
	}

}
