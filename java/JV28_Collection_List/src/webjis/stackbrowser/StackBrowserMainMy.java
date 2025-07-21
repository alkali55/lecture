package webjis.stackbrowser;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackBrowserMainMy {

	public static void main(String[] args) {
		// 브라우저의 뒤로/앞으로 기능
		// 방문 사이트 : 홈페이지 > 네이버 > 다음 > 쿠팡 > 자바API
		// 뒤로가기 : goBack()
		
		Stack<String> history1 = new Stack<String>();
		Stack<String> history2 = new Stack<String>();
		
		
		history1.push("홈페이지");
		history1.push("네이버");
		history1.push("다음");
		history1.push("쿠팡");
		history1.push("자바API");
		goBack(history1, history2);
		goBack(history1, history2);
		goFront(history1, history2);
		

	}

	private static String goFront(Stack<String> history1, Stack<String> history2) {
		String returnVal = "";
		returnVal = history2.peek();
		System.out.println(history2.peek());
		
		history1.push(history2.peek());
		history2.pop();
		return returnVal;
		
	}

	private static String goBack(Stack<String> history1, Stack<String> history2) {
		
		history2.push(history1.peek());
		
		history1.pop();
		System.out.println(history1.peek());
		return history1.peek();
		
	}

}
