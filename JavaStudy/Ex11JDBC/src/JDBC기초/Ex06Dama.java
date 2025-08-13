package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex06Dama {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String dama_Name ="";
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null; 

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(url, db_id, db_pw);
			while (true) {
				System.out.println("메뉴 [1] 다마고치 생성  [2]다마고치 키우기 [3]종료 >>>>");
				int select = sc.nextInt();
				if (select == 1) {
					System.out.print("다마고치 이름을 생성해주세요!");
					dama_Name = sc.next();
					System.out.print("다마고치 가 좋아하는 음식을 입력하세요!");
					String dama_Fav_food = sc.next();
					String sql_Dama_create = "insert into dama values (?,?,30,30)";
					psmt = conn.prepareStatement(sql_Dama_create);
					psmt.setString(1, dama_Name);
					psmt.setString(2, dama_Fav_food);
					int row = psmt.executeUpdate();
					if (row > 0) {
						System.out.println("다마고치 생성 성공");
					} else {
						System.out.println("다마고치 생성 실패");
					}
				} else if (select == 2) {// 키우기
					System.out.println("메뉴 [1]다마고치 상태 보기 [2] 다마고치 다마고치 밥주기  [3]다마고치 잠재우기 >>>>");
					int action_dama= sc.nextInt();
					if(action_dama==1) {//전원
						String sql_Select_Check = "SELECT hugery,sleepv DAMA where name = ?";
						rs = psmt.executeQuery();
						psmt = conn.prepareStatement(sql_Select_Check);
						psmt.setString(1, dama_Name);
						int Dama_hen_g = 0;
						int Dama_sle_g =0;
						while(rs.next()) {
							Dama_hen_g = rs.getInt(1);
							Dama_sle_g = rs.getInt(2);
						}
							System.out.println(dama_Name+" (이)가 배부름 상태 : "+Dama_hen_g);
							System.out.println(dama_Name+ " 이(가) 졸린 상태 : "+Dama_sle_g); 
					}
						if(action_dama==2) {//밥
							String sql_Select_Check_Sleep = "SELECT hugery DAMA where name = ?";
							rs = psmt.executeQuery();
							psmt = conn.prepareStatement(sql_Select_Check_Sleep);
							int Dama_hen_g = 0;
							while(rs.next()) {
								Dama_hen_g = rs.getInt(1);
							}
								if(Dama_hen_g==30) {
									System.out.println(dama_Name+"은(는) 이미 배부릅니다");
								}else {
									System.out.println("얼마나 밥을 줄까요?");
									int insert_food = sc.nextInt();
										if(insert_food>30) {
											System.out.println("입력값이 너무 큽니다");
										}else {
											String sql_Dama_food_in= "Update table DAMA set hugery = ? where name = ?";
											psmt = conn.prepareStatement(sql_Dama_food_in);
											psmt.setInt(1, insert_food);
											psmt.setString(2, dama_Name);
										}
								}
						}else if(action_dama==3) {//잠
							String sql_Select_Check_Sleep = "SELECT sleepv DAMA where name = ?";
							rs = psmt.executeQuery();
							psmt = conn.prepareStatement(sql_Select_Check_Sleep);
							psmt.setString(1, dama_Name);
							int Dama_hen_g = 0;
							while(rs.next()) {
								Dama_hen_g = rs.getInt(1);
							}
								if(Dama_hen_g==30) {
									System.out.println(dama_Name+"은(는) 졸리지 않습니다");
								}else {
									System.out.println("얼마나 잠을잘까요?");
									int insert_sleepv = sc.nextInt();
										if(insert_sleepv>30) {
											System.out.println("입력값이 너무 큽니다");
										}else {
											String sql_Dama_food_in= "Update table DAMA set sleepv = ? where name = ?";
											psmt = conn.prepareStatement(sql_Dama_food_in);
											psmt.setInt(1, insert_sleepv);
											psmt.setString(2, dama_Name);
										}	
								}
						}
				}else if(select ==3) {
					System.out.println("종료합니다");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패");
//			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (conn != null)
					conn.close();
				if (psmt != null)
					psmt.close();
			} catch (SQLException e) {
				System.out.println("데이터베이스 요소가 종료되지 않았습니다");
//					e.printStackTrace();
			}
		}
	}

}
