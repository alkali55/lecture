import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열의 복사
		int[] arr = {0, 10, 20, 30, 40};
		
		System.out.println("원본 배열 : " + Arrays.toString(arr));
		System.out.println("arr의 해시코드 : " + arr.hashCode()); // 해시코드 : 객체의 주소값 (다른 객체이면 다른 값 반환)
		
		// 얕은 복사 (Shallow Copy)
		int[] arr1 = arr;
		System.out.println("복사본 배열 : " + Arrays.toString(arr1));
		System.out.println("arr1의 해시코드 : " + arr1.hashCode());
		
		System.out.println("원본 1번째 값 수정 후.......");
		arr[1] = 1000;
		System.out.println("원본 배열 : " + Arrays.toString(arr));
		System.out.println("복사본 배열 : " + Arrays.toString(arr1));
		
		System.out.println("복사본 2번째 값 수정 후.......");
		arr1[2] = 2000;
		System.out.println("원본 배열 : " + Arrays.toString(arr));
		System.out.println("복사본 배열 : " + Arrays.toString(arr1));
		
		// 깊은 복사 (Deep copy) ----------------------------------------------------------------------
		int[] arr2 = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		System.out.println("원본 배열 : " + Arrays.toString(arr));
		System.out.println("arr의 해시코드 : " + arr.hashCode());
		
		System.out.println("깊은 복사본 배열 : " + Arrays.toString(arr2));
		System.out.println("arr2의 해시코드 : " + arr2.hashCode());
		
		
		arr[4] = 4000; // 원본수정
		System.out.println("원본 수정 후 : 원본 배열 : " + Arrays.toString(arr));
		System.out.println("원본 수정 후 : 깊은 복사본 배열 : " + Arrays.toString(arr2));
		
		// 깊은 복사 3가지 방법
		// 1) for 이용 요소 하나씩 값을 복사
		// 2) Arrays.copyof() 이용
		// 3) System 클래스의 arraycopy() 이용
		
		// 2)
		int[] arr3 = {9, 8, 7, 6, 5};
		int[] arr4 = Arrays.copyOf(arr3, arr3.length);
		
		System.out.println("원본 배열 : " + Arrays.toString(arr3));
		System.out.println("arr3의 해시코드 : " + arr3.hashCode());
		
		System.out.println("copyOf 복사본 배열 : " + Arrays.toString(arr4));
		System.out.println("arr4의 해시코드 : " + arr4.hashCode());
		
		// 배열을 오름차순 정렬
		Arrays.sort(arr4);
		System.out.println("정렬 후 arr4 : " + Arrays.toString(arr4));
		
		// 3)
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		System.out.println(abc);
		System.out.println(num);
		
		char[] copyNum = new char[num.length];
		// 원본배열, 원본시작인덱스, 대상배열, 대상배열시작인덱스, 복사할요소개수
		System.arraycopy(num, 0, copyNum, 0, num.length);
		System.out.println(copyNum);
		
		//
		char[] copyNum2 = new char[abc.length + num.length];
		System.arraycopy(abc, 0, copyNum2, 0, abc.length);
		System.arraycopy(num, 0, copyNum2, abc.length, num.length);
		
		System.out.println(Arrays.toString(copyNum2));
	}

}
