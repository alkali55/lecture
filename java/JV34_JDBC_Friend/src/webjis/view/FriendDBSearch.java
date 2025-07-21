package webjis.view;

import java.util.Scanner;

public class FriendDBSearch {
	
	public static String getFriendName() {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println(sc);
		
		String name = "";
		
		do {
			System.out.println("친구 이름 입력 >>>");
			name = sc.nextLine();
		} while (name.equals(""));
		
//		sc.close();
		return name;
		
	}
	
	public static String getFriendNameForModifying() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수정할 친구 이름 입력 >>>");
		String name = sc.nextLine();
		
		return name;
	}
	
}
