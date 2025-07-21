package webthc.treeset2.student1;

import java.util.Set;
import java.util.TreeSet;

public class StuClass {
	
	private int classNo;
	private Set<Student> stuSet;
	
	StuClass(int classNo){
		this.classNo = classNo;
		this.stuSet = new TreeSet<Student>();
	}

	public int getClassNo() {
		return classNo;
	}

	public Set<Student> getStuSet() {
		return stuSet;
	}
	
	public void addStudent(Student s) {
		this.stuSet.add(s);
	}
	
	public void outputAllStidents() {
		for (Student s : stuSet) {
			System.out.println(s);
		}
	}
}
