package 메소드기초;

import java.util.Scanner;

public class Ex05메소드실습_약수의합 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = getSumOfDivisors(num);
		System.out.println("출력된 약수들의 총합 : "+sum);
	}

	public static int getSumOfDivisors(int a) {
		int result =0;
		int number_list = 0;

		System.out.print("입력된 정수의 약수 : ");
		for(int i =1; i <=a; i++) {
			if(a%i==0) {
				number_list = i;
				System.out.print(number_list+" ");
				
				result = result + number_list;
			}
		}
		System.out.println();
		return result;
	}
	
}
