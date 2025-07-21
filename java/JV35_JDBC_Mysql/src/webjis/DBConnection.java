package webjis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

public class DBConnection {
	
		public static void main(String[] args) {
			
			String url = "jdbc:mysql://localhost:3306/jis?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			
			try (Connection con = DriverManager.getConnection(url, user, password)) {
				
				System.out.println("연결성공 : " + con);
				
				String Query = "select now() as now";
				
				PreparedStatement pstmt = con.prepareStatement(Query);
				
				ResultSet rs = pstmt.executeQuery();
				
				Calendar cal = Calendar.getInstance();
				
				while(rs.next()) {
					System.out.println("now : " + rs.getDate("now", cal));
				}
				
				System.out.println(cal.getTime());
				
				rs.close();
				pstmt.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	
}
