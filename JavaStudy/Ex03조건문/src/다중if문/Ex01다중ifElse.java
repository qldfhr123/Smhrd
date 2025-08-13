package 다중if문;

import java.util.Scanner;

public class Ex01다중ifElse {

	public static void main(String[] args) {
		Scanner GradeSc = new Scanner(System.in);
		
		System.out.print("점수입력 : ");
		int grade = GradeSc.nextInt();
		
		
		if (grade >= 90) {
			System.out.println("A 학점 입니다");
		} else if(grade >= 80){
			System.out.println("B 학점 입니다");
		}else if(grade >= 70){
			System.out.println("C 학점 입니다");
		}else {
			System.out.println("D 학점 입니다");
		}

	}

}
