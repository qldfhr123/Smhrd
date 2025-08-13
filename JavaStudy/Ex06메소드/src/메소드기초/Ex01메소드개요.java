package 메소드기초;

public class Ex01메소드개요 {

	public static void main(String[] args) {
		// 메소드 실행
		introduce();
		// - 메소드를 정의해둔 곳과 똑같이 갯수와 순서를 맞춰야한다
		cook(12, "라면");
		sum(12,99);
		System.out.println(age());
		System.out.println("12 더하기 99는 : "+sum(12,99));
	}

	// 메소드 생성
	// void >>> 반환값이 없다
	public static void introduce() {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}

	// 메소드 매개변수 o ,반환값 x
	// 매개변수는 소괄호 안쪽에 작성
	// 여러개 매개변수 가능
	public static void cook(int a, String b) {
		System.out.println(b + "을(를) " + a + "개 끓입니다.");

	}

	// 메소드 매개변수 x ,반환값 o
	public static int age() {
		int result = 20;
		return result;
	}

	// 메소드 매개변수 o ,반환값 o
	public static int sum(int a, int b) {
		int result = (a+b);
		return result;
		//return a+b;
	}
}
