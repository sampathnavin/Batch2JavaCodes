package Threading;

public class SyncTable {
	
	public  void table(int tableno) throws InterruptedException
	{
		for(int i = 1 ; i <=5 ;i ++)
		{
			System.out.println("The Tables for "+ tableno + "is " + tableno*i);
		Thread.sleep(500);
		}
	}

}
