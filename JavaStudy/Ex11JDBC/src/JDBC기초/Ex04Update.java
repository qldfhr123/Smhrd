package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04Update {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 >> ");
		String user_Id = sc.next();
		System.out.print("비밀번호 입력 >> ");
		String user_Pw = sc.next();
		
		PreparedStatement psmt = null;
		Connection conn = null;
		ResultSet rs = null; 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
		
			String sql = "SELECT * FROM datadesignmember WHERE id = ? AND  pw =?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, user_Id);
			psmt.setString(2, user_Pw);

			rs = psmt.executeQuery(); 
			String db_User_Id ="";
			String db_User_Pw ="";
			String db_User_Name="";
			while(rs.next()) { //한행내려
				db_User_Id = rs.getString(1);
				db_User_Pw = rs.getString(2);
				db_User_Name= rs.getString(3);
			}
			int row = psmt.executeUpdate();
			if(row > 0) {
				System.out.println("로그인 성공");
				System.out.println(db_User_Name+" 님 환영합니다");
				System.out.println("정보를 수정합니다 ");
				System.out.print("수정할 점수를 입력하세요");
				int score_Update = sc.nextInt();
				String sql_Update = "Update  datadesignmember set SCORE = ? WHERE id = ?";
				psmt = conn.prepareStatement(sql_Update);
				psmt.setInt(1, score_Update);
				psmt.setString(2, user_Id);
				row = psmt.executeUpdate();
				if(row > 0) {
					System.out.println("수정이 완료 되었습니다");
				}
				
			}else {
				System.out.println("로그인 실패");
			}
		} catch (Exception e) {
//			e.printStackTrace();
		}finally {
			try {
				if(rs != null) 
					rs.close();
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
