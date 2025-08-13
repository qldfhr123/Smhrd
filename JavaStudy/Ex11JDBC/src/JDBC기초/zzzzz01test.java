package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class zzzzz01test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// DB드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// DB연결에 필요한 설정값
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";

		while (true) {
			System.out.print("메뉴 [1]다마고치 생성 [2]다마고치 키우기 >>> ");
			int select = sc.nextInt();
			if (select == 1) { // 생성
				// 다마고치 생성
				// 사용자에게 이름, 좋아하는 음식 입력받기
				// 다마고치의 배고픔, 졸림은 무조건 각 30으로
				String name = sc.next();
				String food = sc.next();

				// 1. DB작업
				try {
					// 작업할때마다 새로운 커넥션을 생성
					Connection conn = DriverManager.getConnection(url, user, password);

					// 다마고치 생성 정보
					String sql = "INSERT INTO DAMA VALUES(?,?,30,30)";
					PreparedStatement psmt = conn.prepareStatement(sql);

					// ?채우기
					psmt.setString(1, name);
					psmt.setString(2, food);

					// sql 실행
					int result = psmt.executeUpdate();

					if (result > 0) {
						System.out.println("다마고치 생성 성공!");
					} else {
						System.out.println("다마고치 생성 실패ㅠ");
					}

				} catch (SQLException e) {
					e.printStackTrace();
				}

			} else if (select == 2) { // 키우기
				System.out.print("메뉴 [1]상태확인 [2]밥주기 [3]재우기 >> ");
				int select2 = sc.nextInt();

				// 상태확인 선택
				if (select2 == 1) {

					// 내가 만든 모든 다마고치의 상태를 볼 수 있게
					// 작업할때마다 새로운 커넥션을 생성
					try {
						Connection conn = DriverManager.getConnection(url, user, password);

						// 다마고치 상태 조회
						String sql = "SELECT * FROM DAMA";
						PreparedStatement psmt = conn.prepareStatement(sql);

						// sql 실행결과
						ResultSet rs = psmt.executeQuery();

						System.out.println("===다마고치 상태 확인===");

						while (rs.next()) {
							System.out.println("이름: " + rs.getString("NAME") + "\t음식" + rs.getString("FOOD") + "\t배고픔"
									+ rs.getInt("HUNGRY") + "\t졸림" + rs.getInt("SLEEPY"));
						}

					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} else if (select2 == 2) {// 밥주기 선택
				
					
					
					
					
				} else if (select2 == 3) {
					
					
					
					
					
					
				}

			}

		}

	}

}
