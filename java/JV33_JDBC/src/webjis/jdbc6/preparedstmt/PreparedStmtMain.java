package webjis.jdbc6.preparedstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStmtMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
			
			// 1) 쿼리문 준비
//			String firstName = "Steven";
//			String query = "select * from employees where first_name = ?";
			
			String firstName = "tev";
//			String fN = "%" + firstName + "%"; 
//			String query = "select * from employees where first_name like '%tev%'";
//			String query = "select * from employees where first_name like '%' || ? || '%'"; // -- 1번 방법
//			String query = "select * from employees where first_name like ?";  // -- 2번 방법
			int empNo = 104;
			String query = "select * from employees where employee_id = ?";
			
			
			// 2) PreparedStatement 준비
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				pstmt = conn.prepareStatement(query);
//				pstmt.setString(1, firstName); // 쿼리문의 ? 세팅 // -- 1번 방법
//				pstmt.setString(1, "%" + firstName + "%"); // 쿼리문의 ? 세팅 // -- 2번 방법
				
				pstmt.setInt(1, empNo);
				
				rs = pstmt.executeQuery();
				
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				rs.close();
				pstmt.close();
				conn.close();
//				System.out.println("연결 끊기");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}
