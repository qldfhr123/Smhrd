package while문;

import java.util.Scanner;

public class Ex03while예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		int oddNumeber_Count = 0;
		int evenNumeber_Count = 0;
		
		while(input != -1){
			if(input%2 == 0) {
				evenNumeber_Count++;
			}else{
				oddNumeber_Count++;
			}
			System.out.println("짝수 개수 결과 :  " + evenNumeber_Count);
			System.out.println("홀수 개수 결과 :  " + oddNumeber_Count);
			System.out.print("정수를 입력하세요 : ");
			input = sc.nextInt();		
		}
		System.out.println("종료되었습니다.");

	}

}
