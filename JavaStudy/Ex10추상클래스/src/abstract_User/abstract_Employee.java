package abstract_User;

public class abstract_Employee extends abstract_Temp {

    protected int bonus;     
    // 생성자
    public abstract_Employee(String empno, String name, int pay, int bonus) {
    	//부모에게 넘겨주기
    	super(empno, name, pay);
    	this.bonus = bonus;
    }
   
	@Override
    public  int getMoneyPay() {
    	return (pay + bonus) / 12;	
    }
    

}
