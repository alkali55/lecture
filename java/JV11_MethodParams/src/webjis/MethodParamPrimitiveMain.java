package webjis;

public class MethodParamPrimitiveMain {

	public static void main(String[] args) {
		int a = 10; // 기본형
		
		System.out.println("메서드 호출 전 a = " + a);
		
		callPrimitiveParam(a); // 기본형 매개변수를 전달하면서 메서드 호출	
		System.out.println("메서드 호출 후 a = " + a); // 10
		
		Data dataA = new Data(); // 참조형 (사용자 정의타입)
		System.out.println(dataA.value); // 0
		
		dataA.value = 10;
		System.out.println("메서드 호출 전 dataA.value = " + dataA.value); // 10
		
		callPrimitiveParam(dataA.value);
		System.out.println("메서드 호출 후 dataA.value = " + dataA.value); // 10
	}

	private static void callPrimitiveParam(int x) {
		x = 20;
		
	}

}
