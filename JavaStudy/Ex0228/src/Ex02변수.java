
public class Ex02변수 {

	public static void main(String[] args) {
		// 변수 : 변할 수 있는 수 (변하느 데이터를 담을수있는공간) 
		
		// 정수 형태의 데이터를 담을수있는 변수를 선안한다
		// 만들어진 변수의 이름을 num이라고
		
		// Java에서의 변수는 같은 이름으로 여러번 변수를 생성할수없다
		int num = 10;

		int as = num * 32;
		
		System.out.println(as+1);
		
		// 30을 새로운 변수에 담고 싶습니다
		int number = 30;
		number = 100;
		
		// String : 문자열
		// " " : 문자열 데이터 사용
		// ' ' : 문자 데이터 사용
		String name = "이름";
		System.out.println(number);
		System.out.println(name);
		
		// 맞는 데이터 타입만 활용할수있다
		
		final int age = 20;
		//age = 22; //불가능하다

		//논리 타입 : boolean (true , false
		boolean b = false;
		
		// 문자 타입 : char
		char c = 'ㅁ';
		System.out.println(c+1);
		
		//실수 타입 : float, double
		double d = 3.14;
//		float f = 5.67f;  >>  f를 마지막에 붙혀한다
		
		
		
	}

}
