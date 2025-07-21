package webjis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import webjis.controller.dto.FriendDTO;
import webjis.vo.FriendVO;

public class FriendMgmDAOImpl implements FriendMgmDAO {

	private static FriendMgmDAOImpl instance = null;
	
	private FriendMgmDAOImpl() {}
	
	public static FriendMgmDAOImpl getInstance() {
		if (instance == null) {
			instance = new FriendMgmDAOImpl();
		}
		return instance;
	}
	
	
	
	@Override
	public List<FriendVO> selectAllFriends() throws ClassNotFoundException, SQLException {
		
		List<FriendVO> lst = new ArrayList<FriendVO>();
		
		Connection con = DBConnection.getConnection();
		
		// 1) 쿼리문 준비
		
		String query = "select * from friends";
		
		// 2) PreparedStatement 얻기 & 실행
		PreparedStatement pstmt = con.prepareStatement(query);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			lst.add(new FriendVO(rs.getInt("friendNo"), rs.getString("friendName"), rs.getString("mobile"), rs.getString("addr")));
		}
		
		DBConnection.close(rs, pstmt, con);
		
		return lst;
		
	}
	
	@Override
	public int getNextFriendNo() throws ClassNotFoundException, SQLException {
		
		int result = 0;
		
		Connection con = DBConnection.getConnection();
		
		if(con != null) {
			
			String query = "select max(friendNo) from friends";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				result = rs.getInt(1) + 1;
			}
			
			DBConnection.close(rs, pstmt, con);
		}
		
		return result;
	}
	
	@Override
	public int insertFriend(int friendNo, FriendDTO friendDTO) throws ClassNotFoundException, SQLException {
		int result = 0;
		
		Connection con = DBConnection.getConnection();
		
		if(con != null) {
			String query = "insert into friends values(?, ?, ?, ?)";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, friendNo);
			pstmt.setString(2, friendDTO.getFriendName());
			pstmt.setString(3, friendDTO.getMobile());
			pstmt.setString(4, friendDTO.getAddr());
			
			result = pstmt.executeUpdate();
			
			DBConnection.close(pstmt, con);
			
		}
		return result;
	}

	@Override
	public int checkDuplicateMobile(String mobile) throws ClassNotFoundException, SQLException {
		int result = 0;
		
		Connection con = DBConnection.getConnection();
		if (con != null) {
			String query = "select count(*) as cnt from friends where mobile = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, mobile);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				result = rs.getInt("cnt");
			}
			
			DBConnection.close(rs, pstmt, con);
		}
		
		return result;
	}

	public List<FriendVO> selectByName(String searchName) throws ClassNotFoundException, SQLException {
		
		List<FriendVO> lst = new ArrayList<FriendVO>();
		
		Connection con = DBConnection.getConnection();
		
		if(con != null) {
			String query = "select * from friends where friendname like ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, "%" + searchName + "%");
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				lst.add(new FriendVO(rs.getInt("friendNo"), rs.getString("friendName"), rs.getString("mobile"), rs.getString("addr")));
			}
			
			DBConnection.close(rs, pstmt, con);
			
		}
		
		return lst;
		
		
	}

	public int modifyName(int friendNo, String name) throws ClassNotFoundException, SQLException {

		int result = 0;
		
		Connection con = DBConnection.getConnection();
		
		if(con != null) {
			String query = "update friends set friendname = ? where friendNo = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setInt(2, friendNo);
			
			result = pstmt.executeUpdate();
			
			DBConnection.close(pstmt, con);
		}
		
		
		return result;
		
	}


}
