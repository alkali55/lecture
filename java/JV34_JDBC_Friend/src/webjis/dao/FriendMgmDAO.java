package webjis.dao;

import java.sql.SQLException;
import java.util.List;

import webjis.controller.dto.FriendDTO;
import webjis.vo.FriendVO;

public interface FriendMgmDAO {
	
	List<FriendVO> selectAllFriends() throws ClassNotFoundException, SQLException;
	
	int getNextFriendNo() throws ClassNotFoundException, SQLException; // 친구 pk값 결정
	
	int insertFriend(int friendNo, FriendDTO friendDTO) throws ClassNotFoundException, SQLException;

	int checkDuplicateMobile(String mobile) throws ClassNotFoundException, SQLException;
	
	List<FriendVO> selectByName(String searchName) throws ClassNotFoundException, SQLException;
	
	int modifyName(int friendNo, String name) throws ClassNotFoundException, SQLException;
}
