import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx5_shuffle {

	public static void main(String[] args) {
//		문제 5. 1 ~ 9까지 수를 shuffle 한 후, 버블 정렬 
//		오름차순으로 정렬결과를 출력한다.
		
		
		int[] numArr = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90};
		int[] shuffleArr = new int[9];
		for (int i = 0; i < shuffleArr.length; i++) {
			boolean checkDup = true;
			int ranNum = 0;
			while (checkDup) {
				checkDup = false;
				ranNum = (int)Math.floor(Math.random() * 9);
//				System.out.println(ranNum);
				for (int j = 0; j < i; j ++) {
					if (shuffleArr[j] == ranNum) {
						checkDup = true;
					}
				}
			}
			shuffleArr[i] = ranNum;
		}
		
		int[] finalArr = new int[9];
		for (int i = 0; i < finalArr.length; i++) {
			finalArr[shuffleArr[i]] = numArr[i];
		}
		System.out.println(Arrays.toString(numArr));
		System.out.println(Arrays.toString(shuffleArr));
		System.out.println(Arrays.toString(finalArr));
		
		
		for (int i = 0; i < finalArr.length - 1; i++) {
			int ex1 = 0;
			boolean check = true;
			while (check) {
				if (finalArr[ex1] > finalArr[ex1 + 1]) {
					int tmp = finalArr[ex1];
					finalArr[ex1] = finalArr[ex1 + 1];
					finalArr[ex1 + 1] = tmp;
//					System.out.println("정렬");
//					System.out.println(Arrays.toString(finalArr));
				}
				if (ex1 == finalArr.length - 2 - i) {
					check = false;
				}
				ex1++;
			}
			System.out.println(Arrays.toString(finalArr));
		}
		
		System.out.println(Arrays.toString(finalArr));
		
		
		
	}

}
