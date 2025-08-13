package 삼항연잔사;

import java.util.Scanner;

public class Ex02홀짝구하기 {

	public static void main(String[] args) {
		
		Scanner NumSc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		
		int Number = NumSc.nextInt();
		
		String result = (Number%2 == 0) ? "짝수입니다" : "홀수입니다";
		
		System.out.println("입력받은 수는 "+result);

	}

}
