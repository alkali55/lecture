import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		
//		int a; // 지역변수는 초기화를 하지 않으면 사용하지 못함.
//		System.out.println(a); // The local variable a may not have been initialized
		
		// 객체는 자동 초기화 된다.
		
		char[] charArr = new char[3];
		System.out.println("charArr : " + charArr);
		
		int[] scores = new int[3];
		System.out.println("scores : " + scores);
		
		String[] names = new String[5];
		System.out.println(names);
		
		boolean isOk[] = new boolean[2];
		System.out.println(isOk);
		
		// 배열의 요소에 값 할당
		scores[0] = 45;
		scores[1] = 23;
		scores[2] = 100;
//		scores[3] = 50; // 런타임에러 발생 java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(Arrays.toString(scores));
		
		// 배열의 크기를 변경
		// 1. 더 큰 크기의 배열을 새로 생성
		
		scores = new int[4]; // 기존의 scores배열이 참조하던 배열에서 크기가 4인 새로운 배열을 참조함.
//		scores = new char[5]; // scores 배열을 처음 생성할 때, int 타입을 담는 배열로 선언하였으므로, 다른 타입으로 할당이 불가하다.
		
		System.out.println(Arrays.toString(scores)); // [0, 0, 0, 0]
		
		// 배열의 생성과 초기화를 동시에
		int[] scores2 = {100, 90, 80, 70, 60};
		System.out.println(Arrays.toString(scores2));
		
		int[] scores3 = new int[] {100, 90, 80, 70, 60};
		System.out.println(Arrays.toString(scores3));
		
		int[] scores4;
		scores4 = new int[] {50, 40, 30, 20, 10};
//		scores4 = {50, 40, 30, 20, 10}; // Array constants can only be used in initializers
		System.out.println(Arrays.toString(scores4));
		
		String[] heroes = {"아이언맨", "스파이더맨", "헐크", "토르"};
		
		// 배열 출력
		for (int i = 0; i < heroes.length; i++) {
			System.out.println(heroes[i]);
		}
		
		System.out.println("-------확장 for문-------");
		// 확장 for문
//		for ( 타입  변수 : 배열) {}
		for (String hero : heroes) {
			System.out.println(hero);
		}
		
		// ----- 2차원 배열 -----
		int[][] twoDimArr = new int[3][4];
		
		for (int r = 0; r < twoDimArr.length; r++) {
//			for (int c = 0; c < twoDimArr[r].length; c++) {
//				System.out.println(twoDimArr[r][c]);
//			}
			System.out.println(Arrays.toString(twoDimArr[r]));
		}
		
		
	}

}
