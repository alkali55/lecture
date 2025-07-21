package webjis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 >>>");
		
		int result = 0;
		
		try {
			int num = sc.nextInt();
			System.out.println("입력한 수는 : " + num);
			
			result = 3 / num;
			System.out.println("result : " + result);
		} catch (InputMismatchException | ArithmeticException e) {
			
			System.out.println("InputMismatchException 또는 ArithmeticException 예외 발생");
		}
		
		System.out.println("완전 끝");
		sc.close();

	}

}
