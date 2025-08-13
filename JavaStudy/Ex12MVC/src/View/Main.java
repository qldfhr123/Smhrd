package View;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import Controller.Controller;
import Model.MemberDAO;
import Model.MemberDTO;

public class Main {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		ArrayList<MemberDTO> all_list =  new ArrayList<>();
		Controller control = new Controller();
		int result = 0;

		while(true) {
			System.out.println("메뉴 선택  >> ");
			System.out.println("[1] 회원 가입 [2] 회원 수정  [3] 회원 삭제 [4]회원 목록 [5] 종료하기");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("===회원 가입===");
				System.out.print("ID >> ");
				String id = sc.next();
				System.out.print("PW >> ");
				String pw = sc.next();
				System.out.print("이름 >> ");
				String name = sc.next();
				System.out.print("나이 >> ");
				int age = sc.nextInt();
				System.out.print("점수 >> ");
				int score = sc.nextInt();
				result = control.Con_join(id, pw, name, age,score);
				if (result > 0) {
					System.out.println("회원 가입 성공");
				} else {
					System.out.println("회원 가입 실패");
				}
			}
			if (input == 2) {
				System.out.println("===회원 수정===");
				System.out.println("아이디와 비밀번호를 입력하세요");
				System.out.print("ID >> ");
				String user_id = sc.next();
				System.out.print("PW >> ");
				String user_pw = sc.next();
				String db_user_id = control.User_Check(user_id,user_pw);

				if(db_user_id.equals("정보가 있습니다")) {
					System.out.println("수정할 정보를 모두입력하세요");
					System.out.print("ID >> ");
					String update_id = sc.next();
					System.out.print("PW >> ");
					String update_pw = sc.next();
					System.out.print("이름 >> ");
					String update_name = sc.next();
					System.out.print("나이 >> ");
					int update_age = sc.nextInt();
					System.out.print("점수 >> ");
					int update_score = sc.nextInt();
					result = control.Con_update(update_id, update_pw,update_name,update_age,update_score,user_id);

					if (result > 0) {
						System.out.println("회원 수정 성공");
					} else {
						System.out.println("회원 수정 실패");
					}
				}else {
					System.out.println("입력한 정보를 찾을수 없습니다");
				}
				
			}
			if (input == 3) {
				System.out.println("===회원 삭제===");
				System.out.println("아이디와 비빌번호를 입력하세요");
				System.out.print("ID >> ");
				String user_id = sc.next();
				System.out.print("PW >> ");
				String user_pw = sc.next();
				String db_user_id = control.User_Check(user_id,user_pw);

				if(db_user_id.equals("정보가 있습니다")) {
					System.out.println("입력된 아이디의 정보 전부를 삭제하겠습니다");
					result = control.User_Delect(user_id);
					if (result > 0) {
						System.out.println("회원 삭제 성공");
					} else {
						System.out.println("회원 삭제 실패");
					}
				}else {
					System.out.println("입력한 정보가 없습니다");
				}
				
			}
			if (input == 4) {
				System.out.println("===회원 목록===");
				all_list = control.Con_selectAll();
				if (all_list != null && !all_list.isEmpty()) { 
				    System.out.println("id" +"\t" + "pw" + "\t" +"name" +"\t"+"age" +"\t"+"score");
				    for (MemberDTO member : all_list) {
				        System.out.println(member.getId() +"\t"+member.getPw() +"\t"+member.getName() +"\t"+ member.getAge() +"\t"+member.getScore());
				    }

				} else {
				    System.out.println("조회된 회원 없습니다");
				}
			}
			if(input == 5) {
				System.out.println("종료합니다");
				break;
			}
		}
	}

}
