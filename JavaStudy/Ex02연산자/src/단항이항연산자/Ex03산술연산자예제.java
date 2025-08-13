package 단항이항연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		
		int Number = num.nextInt();
		/** 100의 자리를 버려야하므로 100으로 나눈값에서 빼준다 */
		int Remainder  = Number%100;
		System.out.println("결과 값 : "+(Number-Remainder));
		//100으로 나눈값은 앞자리 수가 나오기때문에 다시 100을 곱해줄수도있다.

	}

}
