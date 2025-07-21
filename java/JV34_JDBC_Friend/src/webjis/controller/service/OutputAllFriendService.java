package webjis.controller.service;

import java.sql.SQLException;
import java.util.List;

import webjis.dao.FriendMgmDAOImpl;
import webjis.vo.FriendVO;

public class OutputAllFriendService implements FriendManagementService {

	@Override
	public void toDo() throws ClassNotFoundException, SQLException {
		System.out.println("전체 친구 조회하러 가자~~~~~");
		
		FriendMgmDAOImpl dao = FriendMgmDAOImpl.getInstance();
		
		List<FriendVO> lst = dao.selectAllFriends();
		
		for(FriendVO f : lst) {
			System.out.println(f);
		}
		
	}

}
