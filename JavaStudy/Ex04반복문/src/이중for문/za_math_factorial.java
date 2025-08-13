package 이중for문;

import java.util.Scanner;

public class za_math_factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int factorial_Num = sc.nextInt();
		int result = 1; // 결과값을 저장할 변수

		for (int i = 1; i <= factorial_Num; i++) {
			result = result * i;
		}
		System.out.println("팩토리얼 결과: " + result);

	}
}
