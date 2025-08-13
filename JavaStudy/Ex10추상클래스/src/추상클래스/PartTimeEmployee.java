package 추상클래스;

public class PartTimeEmployee {
    private String empno;   // 사번
    private String name;    // 이름
    private int pay;        // 일당
    private int workDay;    // 일수
    
    // 4개의 매개변수를 가진 생성자
    public PartTimeEmployee(String empno, String name, int pay, int workDay) {
        this.empno = empno;
        this.name = name;
        this.pay = pay;
        this.workDay = workDay;
    }
    
    // 월 급여를 계산 후 리턴
    public int getMoneyPay() {
        return pay * workDay;
    }
    
    // 사번:이름:일당 형태로 출력
    public String print() {
        return empno + " : " + name + " : " + pay;
    }
}
