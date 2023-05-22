package Threading;

public class sync3 extends Thread {

	SyncTable table ;
	public sync3(SyncTable table)
	{
		this.table = table;
	}

	public void run()
	{
		try {
			table.table(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
