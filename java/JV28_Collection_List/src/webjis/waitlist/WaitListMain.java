package webjis.waitlist;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WaitListMain {

	public static void main(String[] args) {
		// 큐 구조를 이용해서 번호표
		
		// 메뉴
		// 1. 대기번호 발급
		// 2. 대기번호 호출
		// 9. 종료
		
		Scanner sc = new Scanner(System.in);
		WaitList wl = new WaitList();
		
		boolean isVal = true;
		while(isVal) {
			
			System.out.println("메뉴를 선택해 주세요");
			System.out.println("1. 대기번호 발급");
			System.out.println("2. 대기번호 호출");
			System.out.println("9. 종료");
			int userInput = 0;
			boolean isError = false;
			try {
				
				userInput = sc.nextInt();
				
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다.");
				sc.nextLine();
				isError = true;
			}
			
			if (!isError) {
				if(userInput == 1) {
					wl.newWait();
				} else if (userInput == 2) {
					wl.callWait();
				} else if (userInput == 9) {
					isVal = false;
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			}
		}
		
		
	}

}
