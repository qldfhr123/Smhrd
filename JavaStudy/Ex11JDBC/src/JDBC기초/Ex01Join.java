package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01Join {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 >> ");
		String id = sc.next();
		System.out.print("비밀번호 입력 >>");
		String pw = sc.next();
		System.out.print("이름 >>");
		String name = sc.next();
		System.out.print("나이 >>");
		int age = sc.nextInt();
		System.out.print("점수 >>");
		int score = sc.nextInt();
		PreparedStatement psmt = null;
		Connection conn = null;
		//드라이버 로드
		try {
			//예외 상황 실행
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//데이터베이스연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			//데이터베이스 연결 (드라이버에 접근)
			conn = DriverManager.getConnection(url, db_id, db_pw);

			if(conn !=null) {
				System.out.println("데이터베이스 드라이브에 연결에 성공했습니다");
			}else {
				System.out.println("데이터베이스 드라이브에 연결에 실패했습니다");
			}
			//Query 전송
			String sql = "insert into datadesignmember values(?,?,?,?,?)";
			//쿼리문 메소드로 작성
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);
			psmt.setInt(5, score);
			
			int row = psmt.executeUpdate();
			// insert update delete 에서만 사용
			System.out.println(row+"행 이(가) 삽입되었습니다!");
			if(row > 0) {
				System.out.println("가입 성공");			
			}else {
				System.out.println("가입 실패");
			}
		} catch (Exception e) {
			//예외처리 상황 처리 기술 
			System.out.println("데이터베이스 연결에 실패했습니다. 다시 확인해주세요");
//			e.printStackTrace();
		} finally {// 반드시 한번은 들어오는 구간
			//데이터베이스 연결끊기 (사용한 순서 역순 반납)
				try {
					if(psmt != null) 
						psmt.close();
					
					if(conn != null) 
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}	

		}
		
	}

}
