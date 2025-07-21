package webjis.custom;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionMain {

	public static void main(String[] args) {
		
		// 양수만 입력
		// 0이거나 음수를 입력받았을 때 예외 상황
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) { // 유저가 잘못된 값을 입력하면 다시 입력받기위함
			try {
				
				System.out.println("양의 정수를 입력하세요 >>>");

				num = sc.nextInt();
				
				if (num > 0) {
					break;
				} else if (num <= 0) {
					NotPostiveInteger npi = new NotPostiveInteger("음수는 입력하면 안됩니다.");
					//				NotPostiveInteger npi = new NotPostiveInteger();
					throw npi; // 예외를 발생시킴
				}

			} catch (NotPostiveInteger e) {
				//			e.printStackTrace();
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("숫자를 입력하세요.");
			}
		}
		
		sc.close();
		System.out.println("입력하신 숫자 : " + num);	
			
		
		
		
	}

}
