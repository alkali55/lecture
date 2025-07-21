package websky.thread1;

class ThreadEx extends Thread {
	
	public ThreadEx() {
		
	}
	
	public ThreadEx(String name) {
		super.setName(name);
	}

	@Override
	public void run() {
//		System.out.println("이름 : " + this.getName());
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName() + ", i : " + i);
			for (int j = 0; j < 100000; j++);
		}
	}
	
}

class ThreadRunnable implements Runnable {

	@Override
	public void run() {
//		System.out.println("ThreadRunnable 이름");
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ", j : " + i);
			for (int j = 0; j < 100000; j++);
		}
		
	}
}

public class ThreadMain {

	public static void main(String[] args) {
		
		// 스레드 객체 생성
		// 1) Thread클래스를 상속받아 구현한 클래스 
//		ThreadEx t1 = new ThreadEx();
		ThreadEx t1 = new ThreadEx("t1");
		
		System.out.println(t1.getName());
		t1.setName("스레드1"); // 스레드 이름 수정
		System.out.println(t1.isAlive());
		
		t1.start(); // 스레드가 시작되며, 실행가능한 상태(Runnable)가 된다. 
		System.out.println(t1.isAlive()); 
		System.out.println("스레드1의 우선순위 : " + t1.getPriority());
		
		// 2) Runnable 인터페이스를 구현한 클래스
		Runnable r = new ThreadRunnable();
		Thread t2 = new Thread(r);
		
		t2.setName("스레드2");
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		
		
		try {
			Thread.sleep(2000);// 2초 동안 일시정지 (main스레드)
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		
		for (int i = 0; i < 10; i++) {
			// 메인메서드의 스레드
			System.out.println(Thread.currentThread().getName() + ", m : " + i);
			for (int j = 0; j < 100000; j++);
		}
		
		
	}

}
