package 이차원배열실습;

import java.util.Scanner;

public class Ex05이차원배열예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 를 입력하세요 : ");
		int N = sc.nextInt();

		int[][] array = new int[N][N];
		int num = 1;

		for(int i = 0; i < array.length; i++) {
		    for(int j = 0; j < array[i].length; j++) {
		        array[i][j] = num++;
		        System.out.print(array[i][j]+"\t");
		    }
		    System.out.println();
		}
		
		System.out.println("리버스");
		int[][] revers = new int[N][N];
		for (int i = 0; i < revers.length; i++) {
			for (int j = 0; j < revers[i].length; j++) {
				//0 ~ n 까지 때문에 2번째 행부터 리버스 된다 그러므로 홀수자리 행부터 반대로 전환이 되어야한다 
				if(i%2!=0) {
					revers[i][(N-1)-j] = array[i][j];	
				}else {
					revers[i][j] = array[i][j];	
				}
			}
		}
		
		for (int i = 0; i < revers.length; i++) {
			for (int j = 0; j < revers[i].length; j++) {
				System.out.print(revers[i][j] + "\t");
			}
			System.out.println();
		}
	}
}


