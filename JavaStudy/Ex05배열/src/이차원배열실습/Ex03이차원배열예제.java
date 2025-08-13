package 이차원배열실습;

import java.util.Scanner;

public class Ex03이차원배열예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 를 입력하세요 : ");
		int N = sc.nextInt();

		int[][] array = new int[N][N];
		int num = 1;

		/*행의 숫자 나열하기*/
		for(int j = 0; j < array[0].length; j++) {
		    for(int i = 0; i < array.length; i++) {
		        array[i][j] = num++;
		    }
		}
		/*나열된 수 정렬하기*/
		for(int i = 0; i < array.length; i++) {
		    for(int j = 0; j < array[i].length; j++) {
		        System.out.printf( array[i][j]+"\t");
		    }
		    System.out.println();
		}
		
		/*
		 * for(int j = 0; j < array.length; j++) {
		    for(int i = 0; i < array.length; i++) {
		        array[j][i] = num++;
		    }
		}
		
		~~ 다시 출력문 작성
		*/


			
	}
}
