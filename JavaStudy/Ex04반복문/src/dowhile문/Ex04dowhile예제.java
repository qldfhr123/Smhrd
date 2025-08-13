package dowhile문;

import java.util.Scanner;

public class Ex04dowhile예제 {

	public static void main(String[] args) {

		Scanner userId = new Scanner(System.in);
		Scanner userPw = new Scanner(System.in);

		String userId_C = "test";
		String userPw_C = "test1234";
		int count = 0;

		do {
			System.out.print("아이디 입력 : ");
			String user_id = userId.next();
			System.out.print("비밀번호 입력 : ");
			String user_pw = userPw.next();
			
			if(userId_C.equals(user_id) && userPw_C.equals(user_pw)){
				System.out.println("로그인 성공");
				break;
			}
			else {
				System.out.println("정보가 틀립니다 다시 한번 확인해주세요");
				count++;
				System.out.println("남은 횟수 : "+(3-count));
				if(count==3) {
					System.out.println("지정된 횟수를 초과하였습니다 종료합니다");
					break;
				}
			}
		}while(true);

	}

}
