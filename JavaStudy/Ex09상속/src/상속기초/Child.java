package 상속기초;

public class Child extends Parent{
	
	// 새로운 클래스, 자식, 서브
	// 한식당 2호점
	
	// 1. 불닭 메뉴만든다 
	/**
	 * 
	 * 불닭 메뉴를 만드는 메소드
	 * 
	 */
	public void makeBul() {
		System.out.println("맛있는 불닭 만든다");
	}
	// 2. 부모클래스 재정의
	@Override
	public void makeBi() {
		System.out.println("아주 맛있는 비빔 만든댜");
	}
	
	

}
