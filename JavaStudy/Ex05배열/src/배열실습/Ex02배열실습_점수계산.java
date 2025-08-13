package 배열실습;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02배열실습_점수계산 {

	public static void main(String[] args) {
		// 점수 계산
		// 정수형 데이터 5개를 저장할수있는 배열만들기
		// 사용자에게 입력받기
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < array.length; i++) {
			
		    System.out.print((i+1)+"번째 입력 >> ");
		    array[i] = sc.nextInt();
		}

		System.out.print("입력된 점수는 : ");
		for(int i = 0; i < array.length; i++) {
		    System.out.print(array[i]);
		    if(i < array.length - 1) {
		        System.out.print(", ");
		    }
		}
		int max = 0;
		int min = array[0];
		int sum = 0;
		float avg = 0;
		for(int i = 0; i < array.length; i++) {
			if(max<array[i]) {
				max = array[i];	
			}
			if(array[i]<min) {
				min = array[i];	
			}
			sum+=array[i];
			avg = (float)sum/array.length;
		}

		System.out.println("");
		System.out.println("최고 점수 : "+max);
		System.out.println("최저 점수 : "+min);
		System.out.println("총합 점수 : "+sum);
		System.out.printf("점수 평균: %.1f\n", avg);

	}

}
