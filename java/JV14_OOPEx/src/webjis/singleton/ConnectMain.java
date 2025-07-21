package webjis.singleton;

public class ConnectMain {

	public static void main(String[] args) {
		
		ConnectService cs1 = ConnectService.getInstance();
		ConnectService cs2 = ConnectService.getInstance();
//		ConnectService cs3 = ConnectService.getInstance();
		
		// 외부 클래스에서 직접 new 로 인스턴스를 생성하지 못하도록
		// 생성자에 private 제어자를 붙여 줘야 한다.
//		ConnectService cs4 = new ConnectService();
		
		if (cs1 == cs2) { // 같은 주소값 
			System.out.println("같은 ConnectService객체입니다");
		} else {
			System.out.println("다른 ConnectService객체입니다");
		}
		
		
	}

}
