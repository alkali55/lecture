package webjis;

public class MethodCreation {

	// float 타입의 두 실수를 매개변수로 받아서, 두 수의 합을 반환하는 인스턴스 메서드
	public float addFloat(float a, float b) {
		return a + b;
	}
	
	public void outputNtimes(String str, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		// 메서드 생성
//		[접근제한자] [static] 반환값타입 메서드이름 (매개변수1, 매개변수2, ...) {
//			
//			[return 반환값;]
//		}
		
		// static 메서드 호출 : 클래스이름.메서드이름();
		int result = MethodCreation.add(300, 500);
		System.out.println("result = " + result);
		
		int result1 = add(3, 5); // 호출하는 곳과 호출되는 클래스가 같다면 메서드 호출 시 클래스명 생략 가능
		System.out.println("result1 = " + result1);
		
		// non-static 인스턴스 메서드 호출
		MethodCreation mc = new MethodCreation();
		float result2 = mc.addFloat(3.14f, 9.12f);
		System.out.println("result2 = " + result2);
		
		// 이름이 outputNTimes이고, 매개변수는 String타입 변수 하나와 int타입 변수 하나를 받아서
		// 받은 문자열을 화면에 n번 반복해서 출력하는 메서드(인스턴스)를 만들고 호출하세요.
		
		mc.outputNtimes("안녕하세요", 5);
		
	}

	// 두 int타입의 숫자를 매개변수로 받아서, 두 수의 합을 반환하는 정적 메서드
	public static int add(int a, int b) {
//		int sum = a + b;
//		return sum;
		
		return a + b;
	}
	
	// 오버로딩
	public long add(int a, int b, int c) {
		return a + b + c;
	}
	
	// 오버로딩
	public float add(float a, float b) {
		return a + b;
	}
	
	public float add(int a, float b) {
		return a + b;
	}
	
	public float add(float a, int b) {
		return a + b;
	}
	
//	public float add (int x, int y) { // 오버로딩 x
//		return x + y;
//	}
}
