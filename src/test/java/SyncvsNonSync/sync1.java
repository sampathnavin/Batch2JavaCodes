package SyncvsNonSync;

public class sync1 extends Thread{
	
	Tables t ;
	
	// Constructor Overloading
	public sync1(Tables t) 
	{
		this.t = t ;
	}
	
	public void run()
	{
		t.tables(3);
	}
	
	
	

}
