package webjis.singleton;

public class ConnectService {
	//싱글톤
	
	static ConnectService cs = new ConnectService();
//	static ConnectService cs; // cs가 null로 초기화됨
	
	private ConnectService() {
		
	}
	
	static ConnectService getInstance() {
		return cs;
	}
}
