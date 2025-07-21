package webjis.waitlist;

import java.util.LinkedList;
import java.util.Queue;

public class WaitList {
	private Queue<Integer> waitList = new LinkedList<Integer>();
	private int waitNum = 0;
	
	public void newWait() {
		
		waitNum++;
		waitList.offer(waitNum);
		System.out.println("대기번호는 " + waitNum + "번 입니다");
		
	}
	
	public void callWait() {
		if(!waitList.isEmpty()) {
			System.out.println(waitList.poll() + "번 차례 호출");
		} else {
			System.out.println("대기중인 손님이 없습니다.");
		}
	}
	
	
}
