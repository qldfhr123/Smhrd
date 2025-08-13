package 메소드기초;

import java.util.Scanner;

public class Ex03메소드기초실습 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		getAbsoluteValue(num1,num2);
		System.out.println(getAbsoluteValue(num1,num2));
	}

	public static int getAbsoluteValue(int a, int b) {
		int result = 0;
		result = Math.abs(a-b);
		return result;
	}
	
}
