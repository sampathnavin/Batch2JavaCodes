package day15;

public class doubts {

	public void AddArrayValues() {
			String s = "12334567";
			char aq = s.charAt(0);
			int a = Integer.parseInt(String.valueOf(aq));
			char aw = s.charAt(1);
			int b = Integer.parseInt(String.valueOf(aw));
			System.out.println(a+b);
		}
	
	public static void main(String[] args) {
		doubts d = new doubts();
		d.AddArrayValues();

	}

}
