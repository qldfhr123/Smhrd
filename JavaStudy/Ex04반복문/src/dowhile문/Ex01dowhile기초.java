package dowhile문;

import java.util.Scanner;

public class Ex01dowhile기초 {

	public static void main(String[] args) {
		
//		int a = 3;
//		do{
//			System.out.println("a는 0이다");
//		} while (a==0);
//		
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		System.out.print("몸무게를 입력하세요 : ");
		int weight = sc.nextInt(); 
		System.out.print("목표 몸무게를 입력하세요 : ");
		int future_Weight = sc2.nextInt(); 
		
		do {
			System.out.print("이번주 감량 몸무게 : ");
			int kg = sc.nextInt();
			weight = weight - kg;
		}
		while(weight>=future_Weight);
		
		System.out.println("종료");
		
		
		
		// 무한 반복문
		// while의 조건을 무조건 참이 되게 만들떄
		// 멈추는 방법 내부에 조건을 걸어준다 그 조건에 break 걸어준
		while(true) {
			
		}

	}

}
