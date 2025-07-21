package websky.thread3;

import javax.swing.JOptionPane;

public class InterruptMain {

	public static void main(String[] args) {
		
		ThreadInterrupt th1 = new ThreadInterrupt();
		th1.start();
		
		String input = JOptionPane.showInputDialog("값을 입력하세요");
		System.out.println(input);
		
		th1.interrupt();
		
	}

	
}

class ThreadInterrupt  extends Thread {

	@Override
	public void run() {
		
		int i = 10;
		
		while( i != 0 && !isInterrupted()) {
			System.out.println(i--);
			for (long x = 0; x < 2800_000_000L; x++);
		}
		
		System.out.println("스레드th1: " + isInterrupted()); // true
		System.out.println("스레드th1: " + isInterrupted()); // true
		System.out.println("스레드th1: " + Thread.interrupted()); // true
		System.out.println("스레드th1: " + Thread.interrupted()); // false (초기화된 상태)
		
	}
	
	
	
	
}
