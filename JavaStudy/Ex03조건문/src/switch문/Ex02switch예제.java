package switch문;

import java.util.Scanner;

public class Ex02switch예제 {

	public static void main(String[] args) {
		
		Scanner MonthSc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int month = MonthSc.nextInt();
		

		switch(month) {
		case 1 : 
			System.out.println(month+"월은 겨울 입니다");
			break;
		case 2 : 
			System.out.println(month+"월은 겨울 입니다");
			break;
		case 3 : 
			System.out.println(month+"월은 봄 입니다");
			break;
		case 4 : 
			System.out.println(month+"월은 봄 입니다");
			break;
		case 5 : 
			System.out.println(month+"월은 봄 입니다");
			break;
		case 6 : 
			System.out.println(month+"월은 여름 입니다");
			break;
		case 7 : 
			System.out.println(month+"월은 여름 입니다");
			break;
		case 8 : 
			System.out.println(month+"월은 여름 입니다");
			break;
		case 9 : 
			System.out.println(month+"월은 가을 입니다");
			break;
		case 10 : 
			System.out.println(month+"월은 가을 입니다");
			break;
		case 11 : 
			System.out.println(month+"월은 가을 입니다");
			break;
		case 12 : 
			System.out.println(month+"월은 겨울 입니다");
			break;
		default : 
			System.out.println("1~12 사이의 숫자를 입력해주세요");
		
		}
		
//		case 1,2,12:
//		String month = "";
//		System.out.println("~~~"+ month +"~~~");
		

	}

}
