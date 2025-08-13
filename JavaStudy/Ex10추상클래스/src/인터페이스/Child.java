 package 인터페이스;

import abstract_User.abstract_Employee;

public class Child extends abstract_Employee  implements Temp,Temp2{

	public Child(String empno, String name, int pay, int bonus) {
		super(empno, name, pay, bonus);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void temp() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void temp2() {
		// TODO Auto-generated method stub
		
	}

}
