package while문;

import java.util.Scanner;

public class Ex02while예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		int checkNumber = -1;
		int sum = 0;
		
		while(input != checkNumber){
			sum = sum + input;
			System.out.println("누적 결과 :  " + sum);
			System.out.print("정수를 입력하세요 : ");
			input = sc.nextInt();		
		}
		System.out.println("종료되었습니다.");
	}
}
