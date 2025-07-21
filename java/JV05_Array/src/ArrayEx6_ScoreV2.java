import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx6_ScoreV2 {

	public static void main(String[] args) {
//		문제 6. 2차원 배열 성적표 5명의 이름, 국, 영, 수 성적을 입력받아서, 
//		이름, 국, 영, 수, 총점, 평균 학점을 출력하세요.
		
		String[][] scores = new String[5][7];
		scores[0][0] = Integer.toString(0);
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i + 1 + "번째 학생의 이름과 국어, 영어, 수학 점수를 입력해주세요.");
			for (int j = 0; j < 4; j++) {
				scores[i][j] = sc.next();
			}
			
			// 총점, 평균
			scores[i][4] = Integer.toString(Integer.parseInt(scores[i][1]) + Integer.parseInt(scores[i][2]) + Integer.parseInt(scores[i][3]));
			scores[i][5] = Float.toString(Integer.parseInt(scores[i][4]) / 3f);
			
			// 학점
			if (Float.parseFloat(scores[i][5]) >= 90) {
				scores[i][6] = "A";
			} else if (Float.parseFloat(scores[i][5]) < 90 && Float.parseFloat(scores[i][5]) >= 80) {
				scores[i][6] = "B";
			} else if (Float.parseFloat(scores[i][5]) < 80 && Float.parseFloat(scores[i][5]) >= 70) {
				scores[i][6] = "C";
			} else if (Float.parseFloat(scores[i][5]) < 70 && Float.parseFloat(scores[i][5]) >= 60) {
				scores[i][6] = "D";
			} else {
				scores[i][6] = "F";
			}
			
			
		}
		String[] head = new String[] {"이름", "국어", "영어", "수학", "총점", "평균", "학점"};
		System.out.println(Arrays.toString(head));
		for (int i = 0; i < scores.length; i++) {
			System.out.println(Arrays.toString(scores[i]));
		}
		
	}

}
