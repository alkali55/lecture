package webthc.treeset2.student1;

import java.util.Comparator;

public class AscendingByStuNo implements Sortable{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getStuNo().compareTo(o2.getStuNo());
	}
	
}
