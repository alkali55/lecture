package webthc.treeset2.student1;

import java.util.Comparator;

public class AscendingByStuName implements Sortable{

	@Override
	public int compare(Student o1, Student o2) {
		
		int nameComp = o1.getStuName().compareTo(o2.getStuName());
		
		if (nameComp == 0) {
			nameComp = o1.getStuNo().compareTo(o2.getStuNo());
		}
		
		
		return nameComp;
	}
	
	
}
