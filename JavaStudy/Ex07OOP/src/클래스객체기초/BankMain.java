package 클래스객체기초;

public class BankMain {

	public static void main(String[] args) {
		
		Bank bk = new Bank();
		
//		bk.money = 1000;
		bk.inMoney(1000);
		bk.outMoney(300);
		
		System.out.println(bk.showMoney());
		
	}
}
