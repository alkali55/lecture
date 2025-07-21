package webjis;

public class StuClass {
	// 멤버변수
	private int no; // 반 번호
	private String stuClassName; // 과정명
	private Student[] stuList; // 학생리스트
	private int totalTot; //학생 전체 총점
	private float totalAvg; // 학생 전체 평균
	
	public static final int STUDENT_MAX_COUNT = 3; // 최대 학생 수 (상수)
	
	
	// 생성자
	public StuClass(int no, String stuClassName) {
		this.no = no;
		this.stuClassName = stuClassName;
		this.stuList = new Student[STUDENT_MAX_COUNT];
	}
	
	// 자동 반, 학생 생성시 사용하는 생성자
	public StuClass(int no, String stuClassName, Student[] stuList) {
		this.no = no;
		this.stuClassName = stuClassName;
		this.stuList = stuList;
	}
	
	
	// 메서드
	public String toString() {
		return "stuClass[반번호 = " + no + ", 과정명 = " + stuClassName + "]";
	}


	public Student[] getStuList() {
		return stuList;
	}


	public void addStudent(Student student, int no) {
		
		stuList[no] = student;
		
	}


	public int getNo() {
		return this.no;
	}


	public String getStuClassName() {
		return stuClassName;
	}


	public void outputAllStudents(int curSavedSudentCnt) {
		for (int i = 0; i < curSavedSudentCnt; i++) {
			stuList[i].displayScore();
		}
		
	}


	public int calTotalTot() {
		totalTot = 0;
		ScoreV3Main svm = new ScoreV3Main();
		for(int i = 0; i < svm.getcurSavedSudentCnt(); i++) {
			totalTot += stuList[i].getTotal();
		}
		return totalTot;
	}


	public float calTotalAvg() {
		ScoreV3Main svm = new ScoreV3Main();
		totalAvg = totalTot / 3f / svm.getcurSavedSudentCnt();
		return totalAvg;
	}
	
	public void findStudentByNo(String stuNo) {
		boolean isFind = false;
		
		for(Student s : this.stuList) {
			if (s.getStuNo().equals(stuNo)) {
				System.out.println("********** 검색된 학생 정보 **********");
				s.displayScore();
				isFind = true;
			}
		}
		if (!isFind) {
			System.out.println("검색된 학생 정보가 없습니다.");
		}
		
	}
}
