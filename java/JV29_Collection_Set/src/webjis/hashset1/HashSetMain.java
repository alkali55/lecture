package webjis.hashset1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

	public static void main(String[] args) {
		
		HashSet<String> setA = new HashSet<String>();
		
		setA.add("1");
		setA.add("2");
		System.out.println(setA.add("3")); // true
		setA.add("5");
		setA.add("4");
		System.out.println(setA.add("3")); // false (중복 허용하지 않는다!!!)
		System.out.println("setA : " + setA);
		
		HashSet<String> setB = new HashSet<String>();
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("setB : " + setB);
		
		// 출력
		Iterator iter = setB.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		iter = setB.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// setA 또는 setB에 있는 모든 원소를 출력 (합집합) -> [1, 2, 3, 4, 5, 6, 7, 8]
		HashSet setUnion = new HashSet(setA);
		Iterator iter2 = setB.iterator();
		
		while(iter2.hasNext()) {
			setUnion.add(iter2.next());
		}
		System.out.println("합집합 : " + setUnion);
		
		// setA와 setB에 공통으로 있는 요소 (교집합) -> [4, 5]
		HashSet setInter = new HashSet();
		Iterator iter1 = setA.iterator();
		iter1 = setA.iterator();
		
		while(iter1.hasNext()) {
			Object item = iter1.next();
			if(setB.contains(item)) {
				setInter.add(item);
			}
		}
		System.out.println("교집합 : " + setInter);
		
		// 차집합 (A - B) -> [1, 2, 3]
		HashSet setDiff = new HashSet(setA);
		iter2 = setB.iterator();
		
		while(iter2.hasNext()) {
			Object item = iter2.next();
			if(setDiff.contains(item)) {
				setDiff.remove(item);
			}
		}
		System.out.println("차집합 : " + setDiff);
		
		// 메서드 이용
		HashSet<Integer> setC = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		HashSet<Integer> setD = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7, 8));
		System.out.println(setC);
		System.out.println(setD);
		
		HashSet<Integer> resultUni = new HashSet<Integer>(setC);
		System.out.println(resultUni);
		resultUni.addAll(setD);
		
		System.out.println("합집합 adaAll() : " + resultUni);
		
		HashSet<Integer> resultInter = new HashSet<Integer>(setC);
		resultInter.retainAll(setD);
		System.out.println("교집합 retainAll() : " + resultInter);
		
		HashSet<Integer> resultDiff = new HashSet<Integer>(setC);
		resultDiff.removeAll(setD);
		System.out.println("차집합 removeAll() : " + resultDiff);
		
		
	}

}
