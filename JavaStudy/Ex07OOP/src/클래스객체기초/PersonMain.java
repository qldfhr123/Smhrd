package 클래스객체기초;

public class PersonMain {

	public static void main(String[] args) {
	
		// 설계도(클래스)를 기반으로 객체를 만들어보자
		
		// 객체 생성
		// 설계도명 객체 = new 설계도명
		// 객체 생성할때 붙는 ()는 생성자 메소드
		Person human = new Person();
		
		//객체에 데이터 할당		
//		human.age = 20;
//		human.name = "이름";
//		
//		// 객체 출력
//		System.out.println(human.age);
//		//객체가 가진기능 실행
//		human.sleep();
//		human.introduce();
//		human.eat("치킨");
		
		human.age = 99;
		human.name = "구구";
		
		human.introduce();
		human.eat("사료");
		human.sleep();
		
	}
	
}
