package 클래스객체기초;

public class Person {
	
	// 사람이 가질 수 있는 데이터와 로직을 설계
	
	//데이터
	int age;
	String name;
	
	//로직
	void sleep (){
		System.out.println("잠을 자요");
	}
	void introduce (){
		System.out.println("제 이름은 "+name);
		System.out.println("나이는 "+age);
		
	}
	
	void eat(String food) {
		//매개변수를 받는다
		System.out.println(food+"을(를) 먹습니다.");
	}
	
}
