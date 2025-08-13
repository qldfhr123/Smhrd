
package 추상클래스;

public class Employee_Main {
    public static void main(String[] args) {
        // RegularEmployee 객체 생성
    	RegularEmployee re = new RegularEmployee("SMHRD002", "박O수", 1000,10);
        
        // TempEmployee 객체 생성
        TempEmployee temp = new TempEmployee("SMHRD002", "박O수", 3000);
        
        // TempPartTimeEmployee 객체 생성
        PartTimeEmployee part = new PartTimeEmployee("SMHRD003", "임성준", 10000, 10);
        
        // RegularEmployee 정보 출력
        System.out.println(re.print());
        System.out.println("월급여: " + re.getMoneyPay());
        
        // TempEmployee 정보 출력
        System.out.println(temp.print());
        System.out.println("월급여: " + temp.getMoneyPay());
        
        // TempPartTimeEmployee 정보 출력
        System.out.println(part.print());
        System.out.println("월급여: " + part.getMoneyPay());
    }
}
