package webjis.controller.service;

import java.sql.SQLException;
import java.util.List;

import webjis.dao.FriendMgmDAOImpl;
import webjis.view.FriendDBSearch;
import webjis.vo.FriendVO;

public class searchFriendService implements FriendManagementService {

	@Override
	public void toDo() throws ClassNotFoundException, SQLException {

		FriendMgmDAOImpl dao = FriendMgmDAOImpl.getInstance();
		
		String searchName = FriendDBSearch.getFriendName();
		
		List<FriendVO> lst = dao.selectByName(searchName);
		
		for(FriendVO f : lst) {
			System.out.println(f);
		}

	}

}
