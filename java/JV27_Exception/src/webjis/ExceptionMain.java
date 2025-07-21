package webjis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 >>>");
		
		int result = 0;
		
		try {
			
			int num = sc.nextInt();
			System.out.println("입력한 수는 : " + num);
			
			result = 3 / num;
			System.out.println("result : " + result);
			
		} catch (InputMismatchException e) {
			
			System.out.println(e.getMessage());
//			e.printStackTrace();
			System.out.println("다음부터는 꼭 정수를 입력하세요.");
			
		} catch (ArithmeticException e) {
			
//			System.out.println(e.getMessage());
			System.out.println("다음부터는 0은 입력하면 안됩니다.");
		} catch (Exception e) { // Exception 캐치 블럭은 가장 마지막에 써야 한다.
			System.out.println("예외가 발생했습니다.");
		} finally {
			System.out.println("Finally");
		}
		
		System.out.println("완전 끝");
		sc.close();
		

	}

}
