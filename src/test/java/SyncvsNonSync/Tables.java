package SyncvsNonSync;

public class Tables {

	// Synchornized : Ordered / Structured  / Sequence / one by one code
	//  It will wait upto one thread is completed after that only it will start the next thread 
	// synchronized keyword is important 
	
	// Non synchronized : not ordered /shuffled 
	// It will not wait for the thread to complete multi threading will be happining 
	//  No keywords of syncrhonized 
	
	
	public synchronized void tables(int n)
	{
		// I want a tables upto 10 
		
		for(int i = 1 ; i <= 10 ; i ++)
		{
			System.out.println("The tables for " +n +"is " + n*i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}


}
