package websky.jdbc2.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectMain {

	public static void main(String[] args) {
		String id = "hr";
		String pwd = "1234";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
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
			Statement stmt = null;
			ResultSet rs = null;
			// (1) 실행할 쿼리문 준비
//			String query = "select * from employees where employee_id = " + 100;
			String query = "select * from employees";
			
			// (2) Statement 객체 : 쿼리문을 Connection객체가 연결하고 있는 DB서버로 전송하고 
			//	                    실행하는 역할을 하는 객체
			
			try {
				stmt = conn.createStatement();
				
				// (3) ResultSet 객체 : 쿼리문이 실행된 후에 결과 테이블을 담고 있는 객체
				rs = stmt.executeQuery(query);
				
				while(rs.next()) {
					System.out.println(rs.getInt("EMPLOYEE_ID") + " "
							+ rs.getString("FIRST_NAME") + " "
							+ rs.getString("LAST_NAME") + " " 
							+ rs.getString("EMAIL") + " " 
							+ rs.getString("PHONE_NUMBER") + " "
							+ rs.getDate("HIRE_DATE") + " " 
							+ rs.getString("JOB_ID") + " " 
							+ rs.getFloat("SALARY") + " "
							+ rs.getFloat("COMMISSION_PCT") + " " 
							+ rs.getInt("MANAGER_ID") + " " 
							+ rs.getInt("DEPARTMENT_ID"));
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			try {
				rs.close();
				stmt.close();
				conn.close();
				
				System.out.println("연결 끊기");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}
