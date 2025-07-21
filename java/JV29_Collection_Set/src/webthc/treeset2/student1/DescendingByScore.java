package webthc.treeset2.student1;

import java.util.Comparator;

public class DescendingByScore implements Sortable{

	@Override
	public int compare(Student o1, Student o2) {
		
		int scoreComp = Integer.compare(o1.getScore(), o2.getScore()) * -1;
		
		if (scoreComp == 0) {
			scoreComp = o1.getStuNo().compareTo(o2.getStuNo());
		}
		
//		return Integer.compare(o1.getScore(), o2.getScore()); // 오름차순 
		return scoreComp; // 내림차순 
		
		
	}
	
}
