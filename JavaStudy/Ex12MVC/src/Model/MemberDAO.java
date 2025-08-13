package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	ArrayList<MemberDTO> list = new ArrayList<>();
	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;
	int result = 0;

	public void getConn() {
		/////
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(url, db_id, db_pw);

		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("데이터베이스 연결에 실패했습니다. 다시 확인해주세요");
//			e.printStackTrace();
		}
		////
	}

	public void close() {
		try {
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int join(MemberDTO dto) {
		getConn();
		try {
			String sql = "insert into datadesignmember values(?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			psmt.setInt(5, dto.getScore());

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}
	
	public int update(MemberDTO dto, String db_id) {
		getConn();
		try {
			String sql = "update datadesignmember set id = ?, pw = ?, name = ?, age = ?, score = ? where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			psmt.setInt(5, dto.getScore());
			//누구의 아이디의 정보를 바꿀지 메인에서 입력받은 유저의 id
			psmt.setString(6, db_id);
			
			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;

	}
	public int Delete(String id) {
		getConn();
		try {
			String sql = "delete from datadesignmember WHERE id =?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return result;
	}
	public ArrayList<MemberDTO> SelectAll() {
		getConn();
		
		try {
			
			String sql = "select * from datadesignmember";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); 
			while(rs.next()) {
			    String id = (rs.getString(1));
			    String pw = (rs.getString(2));
			    String name = (rs.getString(3));
			    int age = (rs.getInt(4));   
			    int score = (rs.getInt(5)); 
			    
			    list.add(new MemberDTO(id, pw, name, age, score));
			}
			 System.out.println("조회된 데이터 개수: " + list.size()); 
		} catch (SQLException e) {
//			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	public int user_check(String user_id, String user_pw) {
		getConn();
		try {
			String sql = "SELECT ID,PW FROM datadesignmember where id =? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, user_id);
			psmt.setString(2, user_pw);
			result = psmt.executeUpdate();
		} catch (SQLException e) {
//			e.printStackTrace();
		} finally {
			close();
		}
		if(result > 0) {
			return 1;
		}else {
			return 0;
		}
	}


}
