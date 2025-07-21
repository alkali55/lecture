package webjis.stackex;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("김영재");
		stack.push("여성욱");
		stack.push("박유진");
		stack.push("전인수");
		
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek()); // 맨 위 요소를 보기만 하고, 제거하지 않는다.
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		
		Queue<String> queue = new LinkedList<String>();
		queue.offer("1김종원");
		queue.offer("2김성현");
		queue.offer("3김강");
		queue.offer("4류준규");
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
		

	}

}
