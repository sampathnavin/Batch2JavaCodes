package day16Bank;

public class ICICI {
	
public static void main(String[] args) {
		
		
		RBI main = new RBI();
		
		main.setAadharno("WWWWWWWWWWWWW");
		main.setAddress("GUJARAT");
		main.setPanno("AUWPN");
		main.setBalance(50000);
		
		System.out.println(main.getAadharno());
		System.out.println(main.getAddress());
		System.out.println(main.getBalance());
		System.out.println(main.getPanno());
		

	}

}
