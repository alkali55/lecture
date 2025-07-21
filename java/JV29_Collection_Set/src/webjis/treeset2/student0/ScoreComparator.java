package webjis.treeset2.student0;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
//		if (o1.equals(o2)) {
//			return 0;
//		}
		
		int scoreComp = -1 * Integer.compare(o1.getScore(), o2.getScore());
		
		if (scoreComp == 0) {
			scoreComp = o1.getStuNo().compareTo(o2.getStuNo());
		}
		
//		return Integer.compare(o1.getScore(), o2.getScore()); // 오름차순 
//		return -1 * Integer.compare(o1.getScore(), o2.getScore()); // 내림차순 
		
		return scoreComp;
	}
	
}
