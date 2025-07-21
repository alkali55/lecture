package webjis.treeset2.student1;

import java.util.Comparator;

public class StuNoComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getStuNo().compareTo(o2.getStuNo());
	}
	
}
