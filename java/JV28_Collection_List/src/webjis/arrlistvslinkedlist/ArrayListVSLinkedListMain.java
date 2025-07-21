package webjis.arrlistvslinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class ArrayListVSLinkedListMain {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		
		System.out.println("요소 순차적으로 추가");
//		System.out.println("arrayList : " + add1(al)); // 19
		System.out.println("linkedList : " + add1(ll)); // 24
		
		System.out.println("중간에 추가");
//		System.out.println("arrayList : " + addMid1(al)); // 982
//		System.out.println("linkedList : " + addMid1(ll)); // 4
		
		System.out.println("끝에서부터 순차적으로 삭제");
//		System.out.println("arrayList : " + remove1(al)); // 6
//		System.out.println("linkedList : " + remove1(ll)); // 9
		
		System.out.println("0번째 삭제");
//		System.out.println("arrayList : " + remove2(al)); // 958
//		System.out.println("linkedList : " + remove2(ll)); // 1
		
		System.out.println("요소 추출");
//		System.out.println("arrayList : " + getList(al)); // 0
		System.out.println("linkedList : " + getList(ll)); // 67
	}
	
	private static long getList(List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			list.get(i);
		}
		
		long end = System.currentTimeMillis();
		return end - start;
	}

	private static long remove2(List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			list.remove(0);
		}
		
		long end = System.currentTimeMillis();
		return end - start;
	}

	private static long remove1(List list) {
		long start = System.currentTimeMillis();
		
		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		
		long end = System.currentTimeMillis();
		return end - start;
		
	}

	private static Long addMid1(List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			list.add(100, "a");
		}
		
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long add1(List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 1000000; i++) {
			list.add(i);
		}
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}
}
