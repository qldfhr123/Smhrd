package 배열실습;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03배열실습_배수계산 {

	public static void main(String[] args) {

		// 사용자에게 입력받기
		int[] array = new int[10];
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < array.length; i++) {
		    System.out.print((i+1)+"번째 입력 >> ");
		    array[i] = sc.nextInt();
		}
		System.out.print("3의 배수는 : ");
		for(int i = 0; i < array.length; i++) {
			if(array[i]%3==0) {
				int[] array2 = {array[i]};
					for(int j = 0; j < array2.length; j++) {
						System.out.print(array2[j]+" ");
					}			
		    }
		}
		
	}

}
