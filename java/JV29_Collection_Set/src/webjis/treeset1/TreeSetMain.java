package webjis.treeset1;

import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {

		TreeSet<Integer> numSet = new TreeSet<Integer>();
		
		numSet.add(10);
		numSet.add(20);
		numSet.add(50);
		numSet.add(30);
		numSet.add(40);
		
		System.out.println(numSet);
		
		System.out.println("가장 작은 값 : " + numSet.first());
		System.out.println("가장 큰 값 : " + numSet.last());
		
		System.out.println("20보다 큰 최소값 : " + numSet.higher(20));
		System.out.println("40보다 작은 최대값 : " + numSet.lower(40));
	}

}
