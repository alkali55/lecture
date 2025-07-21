package websky.thread4;

public class StopMain {

	public static void main(String[] args) {
		
		TestThread th1 = new TestThread("-");
		TestThread th2 = new TestThread("--");
		TestThread th3 = new TestThread("---");
		
		th1.start();
		th2.start();
		th3.start();
		
		
		try {
			Thread.sleep(3000);
			System.out.println("th1 일시정지");
			th1.suspend(); // th1 일시정지
			
			Thread.sleep(3000);
			System.out.println("th2 일시정지");
			th2.suspend(); // th2 일시정지
			
			Thread.sleep(3000);
			System.out.println("th1 재개");
			th1.resume();
			
			Thread.sleep(3000);
			System.out.println("th1, th2 정지");
			th1.stop();
			th2.stop();
			
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}

class TestThread implements Runnable {
	
	volatile boolean isStopped = false; // 멀티스레드 환경에서 변수의 값을 캐싱된 값이 아니라, ram에서 최신 값을 읽어오도록.
	volatile boolean isSuspended = false;
	
	Thread th;
	
	TestThread(String name){
		th = new Thread(this, name);
	}
	
	void start() {
		th.start();
	}
	
	void stop() {
		isStopped = true;
	}
	
	void suspend() {
		isSuspended = true;
	}
	
	void resume() {
		isSuspended = false;
	}

	@Override
	public void run() {
		while(!isStopped) {
			if (!isSuspended) {
				System.out.println(Thread.currentThread().getName());
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(Thread.currentThread().getName() + " == stopped");
	}
	
}
