package webjis.stackbrowser;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class WebHistory {
	
	private Stack<String> history = new Stack<String>();
	private Stack<String> history2 = new Stack<String>();
	private String currentPage = null;
	
	public void visitPage(String webAddr) {
		
		if (currentPage != null) {
			
			history.push(currentPage);
		}
		currentPage = webAddr;
		
//		currentPage = webAddr;
//		history.push(webAddr);
		
		System.out.println("방문한 웹 페이지 : " + webAddr);
	}
	
	public void goBack() {
		if(!history.isEmpty()) {
		System.out.println("뒤로 가기 클릭!");
		currentPage = history.pop();
		System.out.println("현재 페이지 : " + currentPage);
		} else {
			System.out.println("더 이상 뒤로 가기 안됩니다.");
		}
	}
	
//	public void goBack() {
//		
//		history2.push(currentPage);
//		
//		System.out.println("뒤로 가기 클릭!");
//		history.pop();
//		currentPage = history.peek();
//		System.out.println("현재 페이지 : " + currentPage);
//	}
//	
//	public void goFront() {
//		
//		history.push(currentPage);
//		
//		System.out.println("앞으로 가기 클릭!");
//		currentPage = history2.peek();
//		System.out.println("현재 페이지 : " + currentPage);
//		history2.pop();
//	}
}
