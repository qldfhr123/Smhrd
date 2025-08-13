package abstract_User;

public class abstract_Main {
	// 메인 클래스
	public static void main(String[] args) {
		abstract_Employee emp1 = new abstract_Employee("1001", "홍길동", 60000000,1212);
		abstract_Temp tep = new abstract_Temp(null, null, 0);
		
		abstract_Part emp2 = new abstract_Part("1002", "김철수", 48000000,1);

		System.out.println(emp1.print());
		System.out.println(emp2.print());
	}

}
