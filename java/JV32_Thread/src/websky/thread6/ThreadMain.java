package websky.thread6;

public class ThreadMain {

	public static void main(String[] args) {
		
//		Family 아빠 = new Family("아빠");
//		Family 엄마 = new Family("엄마");
//		Family 나 = new Family("나");
//		
//		Thread fth = new Thread(아빠);
//		Thread mth = new Thread(엄마);
//		Thread nth = new Thread(나); 
		// 위의 경우는 개별 Family 인스턴스가 별도의 계좌를 가진다. 
		// (자원을 공유하지 않는다)
		
		Family 가족 = new Family("가족");
		Thread fth = new Thread(가족);
		Thread mth = new Thread(가족);
		Thread nth = new Thread(가족);
		
		fth.start();
		mth.start();
		nth.start();
		
	}

}
