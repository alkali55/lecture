package webjis;

public class FinalMain {

	public static void main(String[] args) {
		// 지역변수
		final int lv;
		lv = 10;
		System.out.println(lv);
		
		// final 제어자가 붙은 지역변수는 값을 재할당 하지 못한다.
//		lv = 20; // The final local variable lv may already have been assigned
		
		method(10);
		
		// 생성자 초기화
		ConstructInitFinal cif = new ConstructInitFinal(100);
		System.out.println(cif.iv);
		
		// final을 멤버변수(필드)에 사용할 경우, 생성자를 통해서 한번만 초기화되고,
		// 재할당 할 수 없다.
//		cif.iv = 200; // The final field ConstructInitFinal.iv cannot be assigned
		
		//멤버 변수 초기화
		FieldInitFinal fif = new FieldInitFinal();
		System.out.println(fif.fieldVar); // 10
//		fif.fieldVar = 20; // The final field FieldInitFinal.fieldVar cannot be assigned
		System.out.println(fif.STU_CNT);
		
		System.out.println(FieldInitFinal.MAX_CNT);
		
	}
	
	static void method(final int num) {
		// 메서드의 매개변수에 final이 붙으면 메서드 안에서 매개변수 값을 변경할 수 없다.
		System.out.println(num);
//		num = 20;
	}
	
}
