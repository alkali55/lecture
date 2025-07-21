package webthc.treeset2.student1;

import java.util.Comparator;

public abstract class SortManager {
	
	public static Sortable getSortMethod(int menu) {
		
		Sortable result = null;
		
		switch (menu) {
		case 1:
			result = new AscendingByStuNo();
			break;
		case 2:
			result = new AscendingByStuName();
			break;
		case 3:
			result = new DescendingByScore();
			break;
		default:
			System.exit(0);
			break;
		}
		
		return result;
	}
}
