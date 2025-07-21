import java.util.Scanner;
import java.util.Arrays;

public class ArrayEx2_Coins {

	public static void main(String[] args) {
//		문제 2.
//		거스름돈 액수를 유저에게 입력받아서, 몇개의 동전으로 지불할 수 있는지 구하는 
//		프로그램을 작성하세요.
//		예를 들어, 거스름돈 = 2680원,
//		출력 : 500원짜리 5개, 100원짜리 1개, 50원짜리 1개, 10원짜리 3개
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("거스름돈을 입력해주세요");
//		int charge = sc.nextInt();
//		int fHCoin = 0;
//		int hCoin = 0;
//		int fTCoin = 0;
//		int tCoin = 0;
//		fHCoin = charge / 500;
//		charge = charge % 500;
//		hCoin = charge / 100;
//		charge = charge % 100;
//		fTCoin = charge / 50;
//		charge = charge % 50;
//		tCoin = charge / 10;
//		System.out.println("500원 : " + fHCoin + "개 100원 : " + hCoin + "개 50원 : " + fTCoin + "개 10원 : " + tCoin + "개");
		
		int[] coinUnit = {500, 100, 50, 10};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("거스름돈을 입력해주세요");
		int money = sc.nextInt();
		
		for (int coin : coinUnit) {
			System.out.println(coin + "원 짜리 동전 " + (money / coin) + "개");
			money %= coin;
		}
		
		
		
	}

}
