import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx3_random {

	public static void main(String[] args) {		
//		문제 3.
//		int 배열에 1 ~ 100의 난수 20개를 넣어놓고,
//		유저에게 찾을 숫자를 입력받아
//		찾는 값은 n번째에 있습니다. < 출력
		
		int[] ranArr = new int[20];
//		for (int ranNum : ranArr) {
//			ranNum = (int)Math.ceil(Math.random() * 100);
//		}
		
		int searchCnt = 0;
		int[] searchArr = new int[20]; 
		
		for (int i = 0; i < ranArr.length; i++) {
			ranArr[i] = (int)Math.ceil(Math.random() * 100);
		}
		System.out.println(Arrays.toString(ranArr));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으려는 수를 입력해주세요>>>");
		int searchNum = sc.nextInt();
		
		for (int i = 0; i < ranArr.length; i++) {
			if (searchNum == ranArr[i]) {
				searchArr[searchCnt] = i;
				searchCnt += 1;
			}
		}
		
		if (searchCnt != 0) {
			for (int i = 0; i < searchCnt; i++) {
				System.out.println("찾는 숫자 " + searchNum + "는(은)" + searchArr[i] + "번째에 있습니다");
			}
		} else {
			System.out.println("찾는 숫자 " + searchNum + "는(은) 존재하지 않습니다");
		}// ifFind 변수(boolean) 선언하고 위 포문에서 직접 출력하는게 더 간편할듯
	}

}
