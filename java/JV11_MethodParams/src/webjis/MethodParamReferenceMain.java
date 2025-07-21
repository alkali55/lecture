package webjis;

public class MethodParamReferenceMain {

	public static void main(String[] args) {
		Data dataA = new Data();
		System.out.println("dataA.value : " + dataA.value); // 0
		
		dataA.value = 10;
		
		System.out.println("메서드 호출 전 dataA.value : " + dataA.value); // 10
		
		callReferenceParam(dataA);
		
		System.out.println("메서드 호출 후 dataA.value : " + dataA.value); // 20

	}

	private static void callReferenceParam(Data dataX) {
		dataX.value = 20;
		
	}

}
