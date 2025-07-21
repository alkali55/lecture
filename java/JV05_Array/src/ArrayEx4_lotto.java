import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4_lotto {

	public static void main(String[] args) {
//		문제 4. 로또 번호 생성
//		1 ~ 45 사이의 정수 중에서 6개를 뽑아서 로또번호를 생성하여 출력합니다.
		
		int[] lotArr = new int[6];
		
		for (int i = 0; i < lotArr.length; i++) {
			boolean checkDup = true;
			int ranNum = 0;
			while (checkDup) {
				checkDup = false;
				ranNum = (int)Math.ceil(Math.random() * 45);
//				System.out.println(ranNum);
				for (int j = 0; j < i; j ++) {
					if (lotArr[j] == ranNum) {
						checkDup = true;
					}
				}
			}
			lotArr[i] = ranNum;
		}
		
		System.out.println("로또 번호 : " + Arrays.toString(lotArr));
	}

}
