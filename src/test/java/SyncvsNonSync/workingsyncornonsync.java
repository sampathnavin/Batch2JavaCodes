package SyncvsNonSync;

public class workingsyncornonsync {

	public static void main(String[] args) {
		
		Tables t = new Tables();
		sync1 s1 = new sync1(t);
		sync2 s2 = new sync2(t);
		s1.start();
		s2.start();
	}

}
