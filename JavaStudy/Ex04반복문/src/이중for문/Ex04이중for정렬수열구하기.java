package 이중for문;

import java.util.Scanner;

public class Ex04이중for정렬수열구하기 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.print("원하는 수를 입력하세요 : ");
			int num = sc.nextInt();
		    int current = 1; // 첫 번째 항
		        
		 System.out.print(current + " ");
		 
		 for(int i = 1; i < num; i++) {
		            current += i;
		            System.out.print(current + " ");
		        }
	}
}

