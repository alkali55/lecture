import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		// 유저에게 숫자를 입력받아서 1부터 입력된 숫자까지의 총합을 구해 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요>>>");
		int userInput = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= userInput; i++) {
			// 누적합
			sum += i; // sum = sum + i
		}
		
		System.out.println("입력숫자 " + userInput + "까지의 총합은 " + sum + "입니다.");

	}

}
