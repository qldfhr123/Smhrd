package 단순if문;

import java.util.Scanner;

public class Ex01단순if예제 {

	public static void main(String[] args) {
		
		//조건문
		// 특정 조건을 막존했을때만, 지정된 구문을 수행할 수 있음
		
		//기본 구조
		//if(조건식){실행구문}
		
		//주의점
		//- 조건식은 무조건 TRUE/FALSE 가 나오는 식이어야함
		//- 조건식이 참인 경우에만 중괄호 안으로 들어옴
		
		Scanner AgeSc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = AgeSc.nextInt();
		
		
		if(age >=20) {
			System.out.println("성인 입니다.");
		}
		else {
			System.out.println("미성년자 입니다.");
		}
			
		
	}

}
