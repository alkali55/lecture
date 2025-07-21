package webjis.view;

import java.util.Scanner;

public class FriendDBModify {

	public static int getFriendNo() {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("위의 친구들 중 이름을 수정할 친구의 friendNo를 입력해 주세요.");
		result = Integer.parseInt(sc.nextLine());
//		sc.close();
		return result;
	}

	public static String getName() {
		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("새로 저장할 이름을 입력해 주세요.");
		result = sc.nextLine();
//		sc.close();
		return result;
	}

}
