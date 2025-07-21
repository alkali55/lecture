import java.util.Scanner;
import java.util.Arrays;


public class ArrayEx1_MinMax {

	public static void main(String[] args) {
//		문제 1.
//		유저에게 n개의 정수를 입력받아 배열에 저장한 후
//		최소값, 최대값을 찾아서 출력하는 프로그램을 작성하세요.
//		[1, 5, 3, 4, 7]
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 정수의 갯수를 알려주세요");
		int count = sc.nextInt();
		int[] userArr = new int[count];
		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;
		System.out.print(count + "개의 정수를 입력해주세요");
		for (int i = 0; i < userArr.length; i++) {
			userArr[i] = sc.nextInt();
			if (userArr[i] > maxNum) {
				maxNum = userArr[i];
			}
			if (userArr[i] < minNum) {
				minNum = userArr[i];
			}
		}
		System.out.println(Arrays.toString(userArr));
		System.out.println("최댓값 : " + maxNum + " 최솟값 : " + minNum);
	}

}
