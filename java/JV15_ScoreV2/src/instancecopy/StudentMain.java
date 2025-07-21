package instancecopy;

public class StudentMain {

	public static void main(String[] args) {
		// 학생 3명의 학번, 이름, 국어, 영어, 수학, 총점, 평균, 학점을 출력하세요.
		// 점수 수정 가능하게..
		
		Student s1 = new Student("002691", "하정우", 90, 80, 90);
		s1.displayScore();
		
		// 얕은 복사
		Student s2 = s1;
		s2.displayScore();
		
		s2.setKor(0);
		s1.displayScore();
		s2.displayScore();
		
		
		// 깊은 복사
		Student originS3 = new Student("002692", "이정재", 90, 80, 90);
		Student deepcopyS3 = new Student(originS3.getStuNo(), originS3.getStuName(), originS3.getKor(), originS3.getEng(), originS3.getMath());
		originS3.displayScore();
		deepcopyS3.displayScore();
		// 원본 수정
		originS3.setMath(100);
		
		originS3.displayScore();
		deepcopyS3.displayScore();
		
		// 깊은 복사 (생성자를 통한 깊은 복사)
		Student deepcopyS4 = new Student(originS3);
		deepcopyS4.displayScore();
		
		// 사본 수정
		deepcopyS4.setEng(0);
		originS3.displayScore();
		deepcopyS4.displayScore();
	}

}
