package 상속기초;

public class Main {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child c = new Child();
		
		p.makeBi();
		c.makeBi();
		
		//업캐스팅
		Parent p2 = new Child();
		// 부모 자료향 레퍼런스 변수명 = new 자식자료형();
		p2.makeBi();
		
		//다운캐스팅
//		Child c2 = (Child) new Parent();
//		c2.makeBul();
			// 코드에서 빨간줄이 뜬다 >> Syntax Error(구문 오류)
			// Exception  발생
			// 구문 오류는 없지만 실행 했을 때 예외 상황이 발생
		
		// real 다운캐스팅
		Child c2  = (Child)p2;
		c2.makeBul();
	}

}
