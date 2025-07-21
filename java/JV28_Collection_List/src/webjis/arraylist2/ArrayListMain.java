package webjis.arraylist2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListMain {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList<>();
		
		// 데이터 추가 : add()
		list.add(10);
		list.add(30);
		System.out.println(list); // [10, 30]
		
		
		list.add(1, 20); // 1번째 인덱스에 20을 추가
		list.add(new Integer(1));
		list.add(new Integer(50));
		
		System.out.println(list); 
		
		// 데이터 얻어오기 : get()
		System.out.println(list.get(2));
		
		// 리스트의 길이
		System.out.println("리스트의 길이 : " + list.size());
		
		// 부분 리스트 추출 : subList(시작인덱스, 끝인덱스(불포함))
//		System.out.println(list.subList(1, 3));
		ArrayList list2 = new ArrayList<>(list.subList(1, 3));
		displayList(list, list2);
		
		// contains()
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("A");
		list3.add("B");
		list3.add("C");
		System.out.println(list3.contains("B")); // true
		System.out.println(list3.contains("D")); // false
		System.out.println(list3);
		
		// 수정 : set()
		list3.set(0, "AA");
		System.out.println(list3);
		
		// indexOf()
		System.out.println(list);
		list.add(0, "1");
		System.out.println(list);
		
		System.out.println("list.indexOf(\"1\") = " + list.indexOf("1"));
		System.out.println("list.indexOf(1) = " + list.indexOf(1));
		System.out.println(list.indexOf(new Integer(1)));
		
		// 삭제 : remove(int index) : index번째 요소 삭제
		//		  remove(Object o) : o 요소를 찾아서 삭제
		list.remove(1); // 1번째 인덱스를 삭제
		System.out.println(list);
		
		list.remove("1");
		System.out.println(list);
		
		list.remove(new Integer(1));
		System.out.println(list);
		
		//
		ArrayList list4 = new ArrayList<>();
		list4.add(0);
		list4.add(1);
		list4.add(2);
		list4.add(3);
		list4.add(4);
		
		ArrayList list5 = new ArrayList<>();
		list5.add(1);
		list5.add(2);
		list5.add("A");
		list5.add("B");
		list5.add("C");
		
		displayList(list4, list5);
		// list4에서 list5와 겹치는 부분만 남기고 나머지는 삭제
		
		for(int i = list4.size() - 1; i >= 0; i--) {
			
			if(!list5.contains(list4.get(i))) {
				list4.remove(i);
			}
		}
		
//		list4.removeIf(item -> !(list5.contains(item)));
		
		displayList(list4, list5);
		
		ArrayList list6 = new ArrayList<>(list4);
		ArrayList list7 = new ArrayList<>(list5);
		
		list6.retainAll(list7);
//		displayList(list6, list7);
		
		// 모든 요소 삭제 - clear()
		list7.clear();
//		System.out.println(list7);
		
		// isEmpty()
//		System.out.println(list7.isEmpty()); // true
		
		
	}

	private static void displayList(ArrayList list, ArrayList list2) {
		System.out.println(list);
		System.out.println(list2);
	}

}
