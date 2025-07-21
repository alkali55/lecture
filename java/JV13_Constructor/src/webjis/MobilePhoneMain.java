package webjis;

public class MobilePhoneMain {

	public static void main(String[] args) {
//		MobilePhone phone = new MobilePhone(); // 기본생성자를 실행 시켜 인스턴스 생성
//		System.out.println(phone.toString());
		
		MobilePhone galaxy = new MobilePhone("삼성", "갤럭시S25", 256, "흰색"); // 오버로딩한 생성자 호출해 인스턴스를 생성
		System.out.println(galaxy.toString());
		
		
		MobilePhone sPhone = new MobilePhone("샤오미", "샤오미폰", 0, "블랙");
//		sPhone.mainMemory = 512; // MobilePhone2Main.java
		System.out.println(sPhone.toString());
		
		System.out.println(galaxy.getBrandName());
		System.out.println(galaxy.getModelName());
		System.out.println(galaxy.getMainMemory());
		System.out.println(galaxy.getColor());
		
		galaxy.setBrandName("Samsung");
		System.out.println(galaxy.getBrandName());
		
		if(galaxy.setMainMemory(512)) {
			System.out.println("메모리 업그레이드 성공");
		} else {
			System.out.println("메모리 업그레이드 실패");
		}
		System.out.println(galaxy.getMainMemory());
		
		// 기본 생성자 없이, 오버로딩된 생성자들이 있는 경우
//		MobilePhone phone2 = new MobilePhone(); // 기본생성자를 자동으로 만들어주지 않으므로, 사용 불가능
	}

}
