package while문;

import java.util.Scanner;

public class Ex05while예제 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		
		System.out.print("A 입력 : ");
		int numA = sc.nextInt(); 
		System.out.print("B 입력 : ");
		int numB = sc2.nextInt(); 

		int minus = 0;
	
		while(numA != 0 && numB !=0){
			minus = numA - numB;
			System.out.println("결과 : "+minus);
			
			System.out.print("A 입력 : ");
			numA = sc.nextInt(); 
			System.out.print("B 입력 : ");
			numB = sc2.nextInt();
			
		}
		System.out.println("종료");

	}

}
