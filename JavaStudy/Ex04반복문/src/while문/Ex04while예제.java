package while문;

import java.util.Scanner;

public class Ex04while예제 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		System.out.print("몸무게를 입력하세요 : ");
		int weight = sc.nextInt(); /** 현재 몸무게 */
		System.out.print("목표 몸무게를 입력하세요 : ");
		int future_Weight = sc2.nextInt(); /** 목표 몸무게 */
		
		int week_Count = 0; /** 주 카운트*/
		int ma_Weight = 0; /** 감량한 몸무게 */
	
		while(weight>future_Weight){
			week_Count++;
			System.out.print(week_Count+"주차 감량한 몸무게 : ");
			ma_Weight = sc3.nextInt();
			weight = weight - ma_Weight;
			System.out.println("감량후 몸무게 : "+weight+" 입니다");

		}
		System.out.println("축하합니다");

	}


}
