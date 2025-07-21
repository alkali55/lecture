import java.util.Scanner;

public class Prob4_ScoreV1 {

	public static void main(String[] args) {
		// 학생한명의 학번, 이름, 국어, 영어, 수학 총점 평균 학점을 콘솔에 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("학번을 입력해주세요");
		String stuNo = sc.nextLine();
//		sc.nextLine();
		System.out.println("이름을 입력해주세요");
		String stuName = sc.nextLine();
		System.out.println("국어성적을 입력해주세요");
		int kor = sc.nextInt();
		System.out.println("영어성적을 입력해주세요");
		int eng = sc.nextInt();
		System.out.println("수학성적을 입력해주세요");
		int math = sc.nextInt();
		int totalScore = kor + eng + math;
//		float avgScore = ((int)((float)totalScore / 3 * 100) / 100f); // 소수점 2자리에서 자르기
		float avgScore = totalScore / 3f;
		char grade; // 빈문자('')로 초기화 불가 // char grade = ' '; | char grade = '\u0000';는 가능
//		if (avgScore >= 90) {
//			grade = 'A';
//		} else if (avgScore < 90 && avgScore >= 80) {
//			grade = 'B';
//		} else if (avgScore < 80 && avgScore >= 70) {
//			grade = 'C';
//		} else if (avgScore < 70 && avgScore >= 60) {
//			grade = 'D';
//		} else {
//			grade = 'F';
//		}
		switch ((int) (avgScore / 10)) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		
		char grade1 = (avgScore >= 90 ? 'A' : (avgScore >= 80 ? 'B' : (avgScore >= 70 ? 'C' : (avgScore >= 60 ? 'D' : 'F'))));
		System.out.println(grade1);
		System.out.println("학번 : " + stuNo + " 이름 : " + stuName + " 국어 : " + kor + " 영어 : " + eng + " 수학 : " + math
				+ " 총점 : " + totalScore + " 평균 : " + (Math.floor(avgScore * 100) / 100) + " 학점 : " + grade);
		System.out.println("성적표");
		System.out.println("학번\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 학점");
		System.out.println("----------------------------------------------------------------");
		System.out.println(stuNo + "\t" + stuName + "\t" + kor + "\t" + eng + "\t" + math + "\t" + totalScore + "\t"
				+ avgScore + "\t" + grade);
	}

}
