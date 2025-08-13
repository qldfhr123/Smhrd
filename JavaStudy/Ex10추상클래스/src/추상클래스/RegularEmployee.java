package 추상클래스;

public  class RegularEmployee {
    // 필드
    private String empno;  // 사번
    private String name;   // 이름
    private int pay;      // 연봉
    private int bonus;    // 보너스
    
    // 생성자
    public RegularEmployee(String empno, String name, int pay, int bonus) {
        this.empno = empno;
        this.name = name;
        this.pay = pay;
        this.bonus = bonus;
    }
    
    // 월급여를 계산
    public int getMoneyPay() {
        return (pay + bonus) / 12;
    }
    
    // 사원의 정보를 출력
    public String print() {
        return empno + " : " + name + " : " + getMoneyPay();
    }
}

