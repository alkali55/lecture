package webjis.arraylist1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RawTypeMain {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList<>(); // raw타입의 ArrayList객체 생성 - 경고 메시지
		
		ar.add(10);
		ar.add(3.14f);
		ar.add(3.14156d);
		ar.add("대한민국");
		ar.add(new Computer());
		
		
		
		System.out.println(ar);
		
		System.out.println(ar.get(0));
		int a = (Integer)ar.get(0);
		System.out.println("a : " + a);
		
		// Generic타입으로 사용할 것을 권고
//		ArrayList<String> ar2 = new ArrayList<String>(); // ok
		ArrayList<String> ar2 = new ArrayList<>();  // ok
		
		ar2.add("스트링만");
		ar2.add("저장됨");
//		ar2.add(new Computer());
//		ar2.add(20);
		
		System.out.println(ar2);
		
		// Generic 타입은 참조 타입만 사용가능
		// 정수만 넣는 ArrayList
//		ArrayList<int> ar3 = new ArrayList<>();
		ArrayList<Integer> ar3 = new ArrayList<Integer>();
		
//		ar3.add("스트링");
		ar3.add(10);
		ar3.add(new Integer(1));
		System.out.println(ar3);
		
//		List<String> ar4 = new ArrayList<>(); // 다형성
		List<String> ar4 = new Stack<String>();
		
		
	}

}

class Computer {}