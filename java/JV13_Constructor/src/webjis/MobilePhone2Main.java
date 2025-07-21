package webjis;

public class MobilePhone2Main {

	public static void main(String[] args) {
//		MobilePhone phone = new MobilePhone(); // 기본생성자를 실행 시켜 인스턴스 생성
//		System.out.println(phone.toString());
		
		MobilePhone2 galaxy = new MobilePhone2("삼성", "갤럭시S25", 256, "흰색"); // 오버로딩한 생성자 호출해 인스턴스를 생성
		System.out.println(galaxy.toString());
		
		MobilePhone2 iPhone = new MobilePhone2("애플", "아이폰16ProMax");
		System.out.println(iPhone.toString());
		
		MobilePhone2 sPhone = new MobilePhone2("샤오미", "샤오미폰", 0, "블랙");
		sPhone.mainMemory = 512;
		System.out.println(sPhone.toString());
		
		// 기본 생성자 없이, 오버로딩된 생성자들이 있는 경우
//		MobilePhone phone2 = new MobilePhone(); // 기본생성자를 자동으로 만들어주지 않으므로, 사용 불가능
	}

}
