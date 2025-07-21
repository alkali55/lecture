package webthc.treeset2.student1;

import java.util.Objects;

public class Student implements Comparable<Student>{
	
	//멤버 변수
	private String stuNo;
	private String stuName;
	private int score;
	


	
	// 생성자
	public Student (String stuNo, String stuName, int score) {

			this.stuNo = stuNo;
			this.stuName = stuName;
			this.score = score;
			
			
	}
	
	// getter
	
	public String getStuNo() {
		return stuNo;
	}
	
	public String getStuName() {
		return stuName;
	}
	
	public int getScore() {
		return score;
	}
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(stuNo);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof Student) {
			Student tmp = (Student)obj;
			result = stuNo.equals(tmp.stuNo) ? true : false;
		}
		return result;
		
	}


	@Override
	public int compareTo(Student s) {
		
		return this.stuNo.compareTo(s.stuNo);
//		return 3;
		
//		if(stuNo.equals(s.stuNo)) {
//			return 0;
//		}
		
//		return (score > s.score) ? -1 : (score == s.score) ? 0 : 1;
		
//		return (score > s.score) ? -1 : (score < s.score) ? 1 : stuNo.compareTo(s.stuNo);
	}


	@Override
	public String toString() {
		return "[" + stuNo + ", " + stuName + ", " + score + "]";
	}
}
