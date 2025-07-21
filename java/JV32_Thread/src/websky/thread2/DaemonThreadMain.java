package websky.thread2;

public class DaemonThreadMain {

	public static void main(String[] args) {
		// 데몬 스레드
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); // 데몬스레드로 설정 (start()호출 이전에 설정해야 한다)
		autoSaveThread.start(); 
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 종료");
		
	}

}

class AutoSaveThread extends Thread {
	
	public void save() {
		System.out.println("작업내용이 저장됨.");
	}

	@Override
	public void run() {
		 
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			save();
		}
		
		
	}
	
}
