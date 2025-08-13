package 클래스객체기초;

public class Bank {
	
	//보통 디폴트 사용
	//같은 패키지 다른 파일에서 함부로 값을 수정할수없도록
	//접근 제한자를 변경
	private int  money;
	
	void inMoney(int coin) {
		//매개변수 만큼 값을 저금
		money = money + coin; 
	}
	void outMoney(int coin) {
		//매개변수 만큼 값을 차감
		money = money - coin; 
	}
	
	//잔액조회
	int showMoney() {
		return money; 
	}
	
	

}
