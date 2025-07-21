import java.util.Arrays;

public class ArrayEx_shuffle_tc {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
		}
		
		System.out.println("초기배열 : " + Arrays.toString(numArr));
		
		for (int i = 0; i < 30; i ++) {
			int n = (int)(Math.random() * 10); // 0 ~ 9 사이의 난수
			
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		System.out.println("셔플 후 배열 : " + Arrays.toString(numArr));
		
		// 버블 정렬
		for (int i = 0; i < numArr.length - 1; i++) {
			boolean isSwap = false;
			for (int j = 0; j < numArr.length - 1 - i; j++) {
				// 오름차순 정렬을 위한 swap
				if (numArr[j] > numArr[j+1]) {
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
					isSwap = true;
				}
				System.out.println("j : " + j + " " + Arrays.toString(numArr) + isSwap);
			}
			System.out.println(i + "번째 라운드");
			if (!isSwap) {
				break;
			}
		}
		
		System.out.println("버블 정렬 후 배열 : " + Arrays.toString(numArr));
		
	}

}
