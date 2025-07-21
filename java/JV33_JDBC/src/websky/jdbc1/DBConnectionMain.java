package websky.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionMain {

	public static void main(String[] args) {
		
		String id = "hr";
		String pwd = "1234";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // thin ?
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 로딩
			conn = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결 성공 : " + conn.toString());
			
			
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("드라이버를 찾을 수 없습니다.");
			
		} catch (SQLException e) {
//			e.printStackTrace();
			System.out.println("DB에 연결하지 못했습니다.");
		}
		
		if (conn != null) {
			try {
				conn.close();
				System.out.println("연결 끊기");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
