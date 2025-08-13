package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex05SelectAll {

	public static void main(String[] args) {
		System.out.println("=======회원정보=======");
		
		PreparedStatement psmt = null;
		Connection conn = null;
		ResultSet rs = null; 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			String sql = "SELECT id,name,age,score FROM datadesignmember";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); 
			String db_User_Id ="";
			String db_User_Name="";
			int db_User_Age=0;
			int db_User_Score=0;
			
			while(rs.next()) {
				db_User_Id = rs.getString(1);
				db_User_Name= rs.getString(2);
				db_User_Age= rs.getInt(3);
				db_User_Score= rs.getInt(4);
				System.out.println(db_User_Id +"\t" + db_User_Name+ "\t" +db_User_Age+"\t"+db_User_Score);
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
