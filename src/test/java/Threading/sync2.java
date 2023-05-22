package Threading;

public class sync2 extends Thread {
	
	SyncTable table ;
	public sync2(SyncTable table)
	{
		this.table = table;
	}

	public void run()
	{
		try {
			table.table(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
