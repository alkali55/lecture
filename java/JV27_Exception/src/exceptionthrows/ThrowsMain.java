package exceptionthrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsMain {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요>>>");
		
		try {
			
			int num = getPositiveNumber();
			System.out.println("입력하신 숫자는 : " + num);
			
		} catch (InputMismatchException e) {
			System.out.println("문자는 입력하면 안됩니다.");
		} catch (NumberFormatException e) {
			System.out.println("3.141592 는 정수가 아닙니다..");
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		}
		
		

	}
	
	public static int getPositiveNumber() throws InputMismatchException, NumberFormatException, Exception{
		
		Scanner sc = new Scanner(System.in);
		int tmp = 0;
		
		// 직접 예외 처리
//		try {
//			tmp = sc.nextInt();
//			sc.nextLine();
//		} catch (InputMismatchException e) {
//			e.printStackTrace();
//			System.out.println("문자는 입력하면 안됩니다.");
//		}
		
		tmp = sc.nextInt(); // 에러를 미뤄도 에러가 난 순간 아래문장은 실행x , 미루고 처리도 하면 어떻게 될까?
		sc.nextLine();
		
		int tmp2 = Integer.parseInt("3.141592");
		System.out.println(tmp2);
		
		
		
		return tmp;
		
	}

}
