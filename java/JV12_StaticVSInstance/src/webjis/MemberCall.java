package webjis;

public class MemberCall {
	
	// 멤버 변수
	int iv = 10; // 인스턴스 변수
	static int cv = 20; // 클래스 변수(static, 정적 변수)
	
	int iv2 = cv;
//	static int cv2 = iv; // Cannot make a static reference to the non-static field iv
	// 클래스 변수는 인스턴스 변수를 사용할 수 없다.
	
	// 정적 메서드
	static void staticMethod1() {
		System.out.println(cv); // 20
//		System.out.println(iv); // 정적 메서드 안에서 인스턴스 변수를 사용할 수 없다.
		// 객체 생성 후에야 인스턴스 변수의 참조 가능
		staticMethod2();
		
		MemberCall mc = new MemberCall();
		System.out.println(mc.iv); // 10
		mc.instanceMethod1();
	}
	static void staticMethod2() {
		System.out.println("staticMethod2");
	}
	
	// 인스턴스 메서드
	void instanceMethod1() {
		System.out.println("instance method1 : cv " + cv);
		System.out.println("instance method1 : iv " + iv);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticMethod1(); // 정적 메서드 호출 (같은 클래스 내에서)
		
		MemberCall mc = new MemberCall();
		mc.instanceMethod1(); // 인스턴스 메서드 호출
	}

}
