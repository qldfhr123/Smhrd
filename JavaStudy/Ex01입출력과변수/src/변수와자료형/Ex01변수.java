package 변수와자료형;

import java.util.Scanner;

public class Ex01변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//사용자가 입력해준 숫자를 변수에 저장 출력
		
		Scanner sc = new Scanner(System.in);
		
		// 2. 정수 입력
		System.out.print("입력받을 수를 입력해주세요 : ");
		int input = sc.nextInt();
		System.out.println("입력한 숫자는 : "+ input);
		
//		int number2 = 3;
//		
//		System.out.print("계산된 수 : "+ input * number2);
		
	}

}
