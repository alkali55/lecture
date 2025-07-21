package instancecopy;

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
	

	private static int totalTot;

	
	// 생성자
	public Student (String stuNo, String stuName, int kor, int eng, int math) {

			this.stuNo = stuNo;
			this.stuName = stuName;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			
			calGrade(kor, eng, math);
			
	}
	
	public Student(Student student) {
		stuNo = student.getStuNo();
		stuName = student.getStuName();
		kor = student.getKor();
		eng = student.getEng();
		math = student.getMath();
		
		calGrade(kor, eng, math);
	}

	// 메소드
	public void displayScore() {
		System.out.println("학번 : " + stuNo + ", 이름 : " + stuName + ", 국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math + ", 총점 : " + total + ", 평균 : " + avg + ", 학점 : " + grade);
		
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
