package day16Bank;

public class RBI {
	
	// Encapsulation - Binding ur code and datas, Hiding the implemenation parts
	// Highly secured 
	
	// Encasulation can be achieved =by setting up ur data type access mofifier as private 
	 // we can access private methods using getter and setter methods 
	

	private String aadharno ;
	
	private String panno ; 
	
	private int Balance ;
	
	private String address ;
	
	
	
	public String getAadharno() {
		return aadharno;
	}

	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}

	public String getPanno() {
		return panno;
	}

	public void setPanno(String panno) {
		this.panno = panno;
	}
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}
	
	
	
	
}
