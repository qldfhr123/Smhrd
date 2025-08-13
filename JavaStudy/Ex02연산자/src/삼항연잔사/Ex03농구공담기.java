package 삼항연잔사;

import java.util.Scanner;

public class Ex03농구공담기 {

	public static void main(String[] args) {
		
		Scanner BallSc = new Scanner(System.in);
		
		System.out.print("농구공의 갯수를 입력해주세요 : ");
		
		int Input_baslls = BallSc.nextInt();
		int Boxconunt = Input_baslls%5;
		
		int result = (Boxconunt==0) ? Input_baslls/5 : Input_baslls/5+(1);
		
		System.out.println("필요한 상자에 갯수는 "+result+"개 입니다");
		
	}

}
