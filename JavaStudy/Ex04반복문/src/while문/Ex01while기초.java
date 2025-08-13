package while문;

import java.util.Scanner;

public class Ex01while기초 {

	public static void main(String[] args) {
		
		//[예제] 사용자가 입력한 값이 10미민이라면 계속 입력받기 10이상 입력하면 종료
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요 : ");
		int input = sc.nextInt();
		
		while(input<10){
			System.out.print("수를 입력하세요 : ");
			input = sc.nextInt();
		}
		System.out.println("종료되었습니다.");

	}

}
