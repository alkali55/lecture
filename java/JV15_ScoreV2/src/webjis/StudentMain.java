package webjis;

public class StudentMain {

	public static void main(String[] args) {
		// 학생 3명의 학번, 이름, 국어, 영어, 수학, 총점, 평균, 학점을 출력하세요.
		// 점수 수정 가능하게..
		
		Student stu1 = new Student("002691", "하정우", 90, 80, 90);
//		Student.displayScore();
		
		Student stu2 = new Student("002692", "이정재", 99, 89, 97);
		Student stu3 = new Student("002693", "???", 80, 60, 66);
		stu3.setStuName("최민식");
		stu3.setEng(66);
		stu3.setMath(70);
		Student.displayScore();

	}

}
