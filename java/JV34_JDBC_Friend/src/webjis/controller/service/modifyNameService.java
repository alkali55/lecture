package webjis.controller.service;

import java.sql.SQLException;
import java.util.List;

import webjis.dao.FriendMgmDAOImpl;
import webjis.view.FriendDBModify;
import webjis.view.FriendDBSearch;
import webjis.vo.FriendVO;

public class modifyNameService implements FriendManagementService {

	@Override
	public void toDo() throws ClassNotFoundException, SQLException {

		FriendMgmDAOImpl dao = FriendMgmDAOImpl.getInstance();
		
		String searchName = FriendDBSearch.getFriendNameForModifying();
		
		List<FriendVO> lst = dao.selectByName(searchName);
		
		if(lst.size() == 0) {
			System.out.println("검색된 친구가 없습니다.");
			return;
		}
		
		for(FriendVO f : lst) {
			System.out.println(f);
		}
		
		int friendNo = FriendDBModify.getFriendNo();
		String name = FriendDBModify.getName();
		
		dao.modifyName(friendNo, name);

	}

}
