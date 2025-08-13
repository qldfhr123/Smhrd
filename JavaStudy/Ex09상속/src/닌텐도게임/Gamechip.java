package 닌텐도게임;

public abstract class Gamechip {
	
	// 1. 추상클래스
	// - 추상 메소드를 하나라도 가지고 있다면 반드시 추상클래스가 되어야한다
	// 추상클래스도 일반 메소드를 가지고 있을수 있다
	
	public void temp() {
		System.out.println("1234");
	}
	
	public abstract void gameStart();
	//{}가 없는 메소드
	// 선언 (리턴타입 매개변수 메소드) 은 되어있으나 로직이 구현되지 않은 메소드 abstract 키워드를 사용한다
	

}
