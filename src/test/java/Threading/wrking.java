package Threading;

public class wrking {

	public static void main(String[] args) {
		
		SyncTable s = new SyncTable() ;
		sync2 thread1 = new sync2(s);
		sync3 thread2 = new sync3(s);
		thread1.start();
		thread2.start();
		

	}

}
