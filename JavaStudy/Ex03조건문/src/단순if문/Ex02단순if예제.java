package 단순if문;

import java.util.Scanner;

public class Ex02단순if예제 {

	public static void main(String[] args) {
		
		Scanner NumSc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = NumSc.nextInt();
		
		
		if(num%3 ==0 && num%5==0) {
			System.out.println("3과 5의 배수입니다");
		}
		else {
			System.out.println("3과 5의 배수가 아닙니다");
		}
			

	}

}
