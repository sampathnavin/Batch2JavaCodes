package SyncvsNonSync;

public class sync2 extends Thread {
	
	Tables t ;
	
	// Constructor Overloading
	public sync2(Tables t) 
	{
		this.t = t ;
	}
	
	public void run()
	{
		t.tables(4);
	}

}
