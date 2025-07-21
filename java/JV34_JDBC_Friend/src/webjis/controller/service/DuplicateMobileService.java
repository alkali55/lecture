package webjis.controller.service;

import java.sql.SQLException;
import java.util.List;

import webjis.dao.FriendMgmDAO;
import webjis.dao.FriendMgmDAOImpl;
import webjis.vo.FriendVO;

public class DuplicateMobileService {
	
	// 싱글톤
	
	private static DuplicateMobileService instance = null;
	
	private DuplicateMobileService() {}
	
	public static DuplicateMobileService getInstance() {
		if(instance == null) {
			instance = new DuplicateMobileService();
		}
		return instance;
	}
	
	public boolean duplicateMobileService(String mobile) throws ClassNotFoundException, SQLException {
		boolean result = false;
		
		FriendMgmDAO dao = FriendMgmDAOImpl.getInstance();
		
		if(dao.checkDuplicateMobile(mobile) == 1) {
			result = true;
		};
		
		
		
		return result;
	}
	
}
