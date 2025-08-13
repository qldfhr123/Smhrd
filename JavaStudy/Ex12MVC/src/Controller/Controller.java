package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import Model.MemberDAO;
import Model.MemberDTO;

public class Controller {
	MemberDAO dao = new MemberDAO();
	 ArrayList<MemberDTO> all_list = new ArrayList<>();
	 int result = 0;
	 String check_User = "";
	public int Con_join(String id, String pw, String name, int age, int score) throws SQLException {
		MemberDTO dto = new MemberDTO(id, pw, name, age,score);
		result = dao.join(dto);
		return result;
	}
	
	public String User_Check(String user_id, String user_pw) {
		int checking = dao.user_check(user_id,user_pw);
		if(checking==0) {
			check_User = "정보가 없습니다";
		}if(checking==1) {
			check_User = "정보가 있습니다";
		}
		return check_User;
	}
	
	public int Con_update(String update_id, String update_pw, String name, int age, int score,String db_id) {
		MemberDTO dto = new MemberDTO(update_id, update_id, name, age,score);
		result = dao.update(dto,db_id);
		return result;
	}

	public ArrayList<MemberDTO> Con_selectAll() {
		all_list = dao.SelectAll();
		return all_list;
	}

	public int User_Delect(String user_id) {
		result = dao.Delete(user_id);
		return result;
	}



}
