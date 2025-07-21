package webjis.sorted1;

import java.util.ArrayList;
import java.util.List;

public class SortMain {

	public static void main(String[] args) {

		// 스트링
		String str1 = "a";
		String str2 = "b";
		String str3 = "a";
//		String str4 = "bbasda";
//		String str5 = "z";
//		String str6 = "ab";
		
		System.out.println(str1.compareTo(str2)); // -1 : str1이 str2보다 사전 순으로 앞에 있다.
		System.out.println(str1.compareTo(str3)); // 0
		System.out.println(str2.compareTo(str1)); // 1
		
		// Integer
		Integer num1 = 10;
		Integer num2 = 20;
		Integer num3 = 10;
		System.out.println(num1.compareTo(num2)); // -1
		System.out.println(num1.compareTo(num3)); // 0
		System.out.println(num2.compareTo(num1)); // 1
		
		List<Integer> iList = new ArrayList<Integer>();
		iList.add(num1);
		iList.add(num2);
		iList.add(num3);
		
		System.out.println(iList);
		iList.sort(null);
		System.out.println(iList);
		
		// 사용자 정의 객체
		User user1 = new User("a", 10);
		User user2 = new User("b", 8);
		User user3 = new User("c", 40);
		
		List<User> ulist = new ArrayList<User>();
		ulist.add(user1);
		ulist.add(user2);
		ulist.add(user3);
		
		System.out.println("---------- 정렬 전 ------------");
		System.out.println(ulist);
		
		System.out.println("---------- 기본 정렬 후 ------------");
		ulist.sort(null); // java.lang.ClassCastException: webjis.sorted1.User cannot be cast to java.lang.Comparable
		System.out.println(ulist);
		
		System.out.println("---------- 아이디 정렬 후 ------------");
		ulist.sort(new MyIdComparator());
		System.out.println(ulist);
		
		

	}

}
