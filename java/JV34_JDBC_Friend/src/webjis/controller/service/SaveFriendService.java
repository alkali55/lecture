package webjis.controller.service;

import java.sql.SQLException;

import webjis.controller.dto.FriendDTO;
import webjis.dao.FriendMgmDAO;
import webjis.dao.FriendMgmDAOImpl;
import webjis.view.FriendDBInsert;

public class SaveFriendService implements FriendManagementService {

	@Override
	public void toDo() throws ClassNotFoundException, SQLException {
		System.out.println("친구 저장하러 가자~~");
		
		FriendMgmDAOImpl dao = FriendMgmDAOImpl.getInstance();
		
		//친구 정보
		FriendDTO friendDTO = FriendDBInsert.getFriendData();
		
		// friendNo 값 (pk)
		
		int friendNo = dao.getNextFriendNo();
		
		if (dao.insertFriend(friendNo, friendDTO) == 1) {
			System.out.println("친구 저장 성공");
		};
		
	}

}
