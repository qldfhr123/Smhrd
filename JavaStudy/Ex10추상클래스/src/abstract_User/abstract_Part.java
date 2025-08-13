package abstract_User;

public class abstract_Part extends abstract_Temp {

	private int work_date ;
	public abstract_Part(String empno, String name, int pay, int work_date) {
    	//부모에게 넘겨주기
		super(empno, name, pay);
		this.work_date = work_date;
	}

	@Override
	public int getMoneyPay() {
		return pay * work_date;
	}
}
