package dowhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex02dowhlie예제 {

	public static void main(String[] args) {
		
		Random ran = new Random();

		Scanner answer = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		int ranNum = ran.nextInt(9) + 1;
		int ranNum2 = ran.nextInt(9) + 1;
		int count = 3;
		
		System.out.print(ranNum + "+" + ranNum2 + "=");
		int answ = answer.nextInt();
		
		do{
			if(answ == (ranNum + ranNum2)) {
				System.out.println("정답");
				System.out.print(ranNum + "+" + ranNum2 + "=");
				answ = answer.nextInt();
			}else {
				System.out.println("오답입니다 계속하시겠습니까? , Y 또는 N을 입력하세요");
				String go = sc.next();
				if(go.equals("n") || go.equals("N")) {
					break; // 종료하기
				}
				else if(go.equals("y") || go.equals("Y")) {
					ranNum = ran.nextInt(9) + 1;
					ranNum2 = ran.nextInt(9) + 1;
					System.out.print(ranNum + "+" + ranNum2 + "=");
					answ = answer.nextInt();
				}
				else {
					count--;
					/** 횟수 카운터 */
					if(count > 0){
						System.out.println("다시 입력하세요 Y 또는 N을 입력하세요");
						System.out.println("남은 횟수 : "+count);
					}
					if(count == 0) {
						System.out.println("남은 횟수가 없습니다 계산을 종료합니다");
						
						break;
					}
				
				}
			}
			 
		}while(true);
			
	}

}
