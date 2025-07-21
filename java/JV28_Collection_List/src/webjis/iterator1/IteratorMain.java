package webjis.iterator1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorMain {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		System.out.println(list);
		
		// for문 순회
		for (String data : list) {
			System.out.println(data);
		}
		
		// Iterator(반복자)를 이용한 순회 (단방향)
		System.out.println("----- Iterator -----");
		Iterator iter1 = list.iterator();
		
		while (iter1.hasNext()) {
			Object obj = iter1.next();
			System.out.println(obj);
		}
		
		iter1 = list.iterator();
		while (iter1.hasNext()) {
			System.out.println("호출?");
			Object obj = iter1.next();
			System.out.println(obj);
		}
		
		// ListIterator (양방향)
		System.out.println("----- ListIterator -----");
		ListIterator iter2 =list.listIterator();
		
		while (iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
		while (iter2.hasPrevious()) {
			System.out.println(iter2.previous());
		}
		

	}

}
