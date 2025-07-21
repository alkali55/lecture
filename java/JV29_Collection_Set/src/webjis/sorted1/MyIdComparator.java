package webjis.sorted1;

import java.util.Comparator;

public class MyIdComparator implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
//		Returns a negative integer,zero, or a positive integer 
//		as the first argument is less than, equalto, or greater than the second.
		
//		return o1.getUserId().compareTo(o2.getUserId()); // (알파벳 순 - 오름차순)
		return o2.getUserId().compareTo(o1.getUserId()); // (알파벳 순 - 내림차순)
	}

}
