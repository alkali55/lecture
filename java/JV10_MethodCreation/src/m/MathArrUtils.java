package m;

import java.util.Arrays;

public class MathArrUtils {
	
	public static int sum(int[] numArr) {
		int total = 0;
		for (int num : numArr) {
			total += num;
		}
		return total;
	}
	
	public static float average(int[] numArr) {
		float total = sum(numArr);
		return total / numArr.length;
	}
	
	public static int min(int[] numArr) {
		int minNum = Integer.MAX_VALUE;
		for (int num : numArr) {
			if (num < minNum) {
				minNum = num;
			}
		}
		return minNum;
	}
	
	public static int max(int[] numArr) {
		int maxNum = Integer.MIN_VALUE;
		for (int num : numArr) {
			if (num > maxNum) {
				maxNum = num;
			}
		}
		return maxNum;
	}
	
	public static int[] sort(int[] numArr) {
		for (int i = 0; i < numArr.length - 1; i++) {
			for (int j = i + 1; j < numArr.length; j++) {
				if (numArr[i] > numArr[j]) {
					int tmp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = tmp;
					
				}
			}
		}
		return numArr;
	}
}
