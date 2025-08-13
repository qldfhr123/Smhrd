package ifElse문;

import java.util.Scanner;

public class Ex01ifElse예제 {

	public static void main(String[] args) {
		
		Scanner GradeSc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int grade = GradeSc.nextInt();
		
		
		if (grade >= 60) {
			System.out.println("합격 입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

	}

}
