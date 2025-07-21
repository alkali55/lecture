import java.util.Scanner;

public class ArrayEx_ScoreV2_tc {

	public static void main(String[] args) {
		// 2차원 배열 성적표
		// 이름, 국, 영, 수, 총점, 평균
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수 >>> ");
		int cntStudent = sc.nextInt();
		sc.nextLine();
		
		String[][] students = new String[cntStudent][6];
		
		for (int i = 0; i < cntStudent; i++) {
			System.out.print(i + 1 + "번 학생의 이름을 입력하세요 >>>");
			students[i][0] = sc.nextLine();
			
			System.out.print(i + 1 + "번 학생의 국어 성적을 입력하세요 >>>");
			students[i][1] = sc.nextLine();
			
			System.out.print(i + 1 + "번 학생의 영어 성적을 입력하세요 >>>");
			students[i][2] = sc.nextLine();
			
			System.out.print(i + 1 + "번 학생의 수학 성적을 입력하세요 >>>");
			students[i][3] = sc.nextLine();
			
			int total = Integer.parseInt(students[i][1]) + Integer.parseInt(students[i][2]) + Integer.parseInt(students[i][3]);
			students[i][4] = Integer.toString(total);
			students[i][5] = String.valueOf(total / 3.0);
			
			
		}
		System.out.println("성적표");
		System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("----------------------------------------------------------------");
		
		for (int r = 0; r < cntStudent; r++) {
			for (int c = 0; c < students[r].length; c++) {
				System.out.print(students[r][c] + "\t");
			}
			System.out.println();
		}
		
	}

}
