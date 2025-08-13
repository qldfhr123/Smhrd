package 추상클래스;

public class TempEmployee {
	
	// 필드
    private String empno;  // 사번
    private String name;   // 이름
    private int pay;      // 연봉

 // 생성자
    public TempEmployee(String empno, String name, int pay ) {
        this.empno = empno;
        this.name = name;
        this.pay = pay;

    }
    
    // 월급여를 계산
    public int getMoneyPay() {
        return (pay  / 12);
    }
    
    // 사원의 정보를 출력
    public String print() {
        return empno + " : " + name + " : " + getMoneyPay();
    }

}
