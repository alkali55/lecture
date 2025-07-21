package webjis;

public class Student {
	
	//멤버 변수
	private String stuNo;
	private String stuName;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private float avg;
	private char grade;
	
	private static int stuCnt = 0;
	private static int totalTot;
	private static Student[] stuArr = new Student[3];
	
	// 생성자
	public Student (String stuNo, String stuName, int kor, int eng, int math) {
		if (stuCnt < 3) {
			this.stuNo = stuNo;
			this.stuName = stuName;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			
			calGrade(kor, eng, math);
			
			stuArr[stuCnt] = this;
			stuCnt++;
		}
	}
	
	// 메소드
	public static void displayScore() {
//		System.out.println("학번 : " + stuNo + ", 이름 : " + stuName + ", 국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math + ", 총점 : " + total + ", 평균 : " + avg + ", 학점 : " + grade);
		if (stuCnt != 0) {
			for (int i = 0; i < stuCnt; i++) {
				System.out.println("학번 : " + stuArr[i].stuNo + ", 이름 : " + stuArr[i].stuName + ", 국어 : " + stuArr[i].kor + ", 영어 : " + stuArr[i].eng + ", 수학 : " + stuArr[i].math + ", 총점 : " + stuArr[i].total + ", 평균 : " + stuArr[i].avg + ", 학점 : " + stuArr[i].grade);
			}
		} else {
			System.out.println("입력된 학생 정보가 없습니다");
		}
	}
	// getter
	
	public String getStuNo() {
		return stuNo;
	}
	
	public String getStuName() {
		return stuName;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public int getTotal() {
		return total;
	}
	
	public float getAvg() {
		return avg;
	}
	
	public char getGrade() {
		return grade;
	}
	
	// 전체총점의 getter
	public static int getTotalTot() {
		return totalTot;
	}
	
	// setter
//	public void setStuNo (String stuNo) {
//		this.stuNo = stuNo;
//	}
	
	public void setStuName (String stuName) {
		this.stuName = stuName;
	}
	
	public void setKor (int kor) {
		
		this.kor = kor;
		
		calGrade(kor, eng, math);
	}
	
	public void setEng (int eng) {
		
		this.eng = eng;
		
		calGrade(kor, eng, math);
	}
	
	public void setMath (int math) {
		
		this.math = math;
		
		calGrade(kor, eng, math);
	}
	
	private void calGrade(int kor, int eng, int math) {
		this.total = kor + eng + math;
		this.avg = this.total / 3f;
		if(this.avg >= 90) {
			this.grade = 'A';
		} else if (this.avg >= 80 && this.avg < 90) {
			this.grade = 'B';
		} else if (this.avg >= 70 && this.avg < 80) {
			this.grade = 'C';
		} else if (this.avg >= 60 && this.avg < 70) {
			this.grade = 'D';
		} else {
			this.grade = 'F';
		}
	}
}
