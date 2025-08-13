package 이중for문;

import java.util.Scanner;

public class Ex04이중for역별찍기예제2 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 별의 행의 갯수를 입력하세요 : ");
		int star_Count = sc.nextInt();
		
		for(int i = star_Count; i>=1; i--){
		    for(int j = 1; j<=i; j++){
		        System.out.print("*");
		    }
		    System.out.println("");
		}
	}
}

