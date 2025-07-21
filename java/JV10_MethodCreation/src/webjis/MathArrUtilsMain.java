package webjis;

import java.util.Arrays;

import m.MathArrUtils;

public class MathArrUtilsMain {

	public static void main(String[] args) {
		int[] numArr = {1, 9, 3, 18};
		System.out.println(MathArrUtils.sum(numArr));
		System.out.println(MathArrUtils.average(numArr));
		System.out.println(MathArrUtils.min(numArr));
		System.out.println(MathArrUtils.max(numArr));
		System.out.println(Arrays.toString(MathArrUtils.sort(numArr)));
		System.out.println(Arrays.toString(numArr));

	}
}
