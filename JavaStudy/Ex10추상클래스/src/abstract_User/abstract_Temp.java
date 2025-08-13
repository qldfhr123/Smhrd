package abstract_User;

public class abstract_Temp {

	protected String empno; // 사번
	protected String name; // 이름
	protected int pay; // 연봉

	public abstract_Temp(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	public int getMoneyPay() {
		return pay / 12;
	}
	
	 // 사원의 정보를 출력하는 공통 메서드
    public String print() {
        return empno + " : " + name + " : " + getMoneyPay();
    }

}

