package for문;

import java.util.Scanner;

public class Ex02for문예제3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("원하는 구구단의 수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print("몇단까지 출력할지 입력하세요 : ");
		int num_dan_c = sc.nextInt();
		
		int multip = 0;
		
		System.out.println(num+"단의 구구단 을 출력합니다");
		for(int i = 1; i<=num_dan_c; i++) {
			multip = num * i;
			System.out.println(num +" X "+ i +" = "+multip); 
		}
	}

}
