package 메소드기초;

import java.util.Scanner;

public class Ex04메소드실습_약수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		boolean divisor = isDivisor(num1,num2);
		System.out.println(divisor);
	}

	public static boolean isDivisor(int a, int b) {
		boolean result =true;
		if(a%b==0) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
}
