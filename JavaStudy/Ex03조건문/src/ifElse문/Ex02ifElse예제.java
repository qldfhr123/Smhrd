package ifElse문;

import java.util.Scanner;

public class Ex02ifElse예제 {

	public static void main(String[] args) {
		
		Scanner AgeSc = new Scanner(System.in);
		Scanner ConSc = new Scanner(System.in);
		
		System.out.println("======== EVERLAND RESOPT========");
		
		System.out.print("나이를 입력하세요 : ");
		int age = AgeSc.nextInt();
		System.out.print("인원을 입력하세요 : ");
		int conunt = ConSc.nextInt();
	
		int price = 5000;
		
		if (age >= 20) {
			System.out.println("총 가격은 : " +price*conunt);
		}
		else {
			System.out.println("총 가격은 : " +(price/2)*conunt);
		}


	}

}
