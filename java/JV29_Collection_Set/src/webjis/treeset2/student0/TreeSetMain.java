package webjis.treeset2.student0;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		Student s1 = new Student("25001", "홍길동", 90);
		Student s2 = new Student("25001", "홍길남", 50);
		Student s3 = new Student("25002", "이정재", 88);
		Student s4 = new Student("25003", "하동균", 99);
		Student s5 = new Student("25004", "하정우", 99);
		Student s6 = new Student("25005", "이대호", 90);
		
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		
//		TreeSet<Student> slist = new TreeSet<Student>();
		
//		slist.add(s1);
//		slist.add(s2);
//		slist.add(s3);
//		slist.add(s4);
//		slist.add(s5);
//		slist.add(s6);
//		
//		System.out.println(slist);
		
		// 성적 정렬
		ScoreComparator scoreComparator = new ScoreComparator();
		TreeSet<Student> scoreSet = new TreeSet<Student>(scoreComparator);
		
		scoreSet.add(s1);
		scoreSet.add(s2);
		scoreSet.add(s3);
		scoreSet.add(s6);
		System.out.println(scoreSet);

	}

}
