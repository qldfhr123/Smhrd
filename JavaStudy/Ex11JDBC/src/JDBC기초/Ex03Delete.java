package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Delete {

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
			
			//실행
			//조회된 데이터결과를 테이블 같은 형태로 표현
			//cursor를 가지고 있다 (지칭하고있는 데이터만 출력)
			rs = psmt.executeQuery(); 
			String db_User_Id ="";
			String db_User_Pw ="";
			String db_User_Name="";
			while(rs.next()) { //한행내려
				db_User_Id = rs.getString(1);
				db_User_Pw = rs.getString(2);
				db_User_Name= rs.getString(3);
			}

			if(user_Id.equals(db_User_Id)&&user_Pw.equals(db_User_Pw)) {
				System.out.println("로그인에 성공하였습니다");
				System.out.println(db_User_Name+" 님 환영합니다");
				
				System.out.println("정보를 삭제 시작합니다");
				System.out.print("y |||||| n 둘중에 하나 입력해주세요 >>> ");
				String anwser = sc.next();
				String yes = "y";
				String no = "n";
				if(anwser.equals(yes)) {
					String sql_del = "DELETE FROM datadesignmember WHERE id = ?";
					psmt = conn.prepareStatement(sql_del);
					psmt.setString(1, user_Id);
					int row = psmt.executeUpdate();
					conn.commit();
					if(row>0) {
						System.out.println("정보를 삭제가 완료되었습니다. 로그아웃됩니다.");
					}
					
				}else if(anwser.equals(no)){
					System.out.println("삭제 하지 않습니다");
				}
		
			}else {
				System.out.println("로그인에 실패했습니다");
				System.out.println("정보를 다시 확인해주세요");
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
