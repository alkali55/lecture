package webjis.treeset2.student1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StudentMain {

	public static void main(String[] args) {


		Student s1 = new Student("25001", "이대호", 90);
		Student s2 = new Student("25002", "박찬호", 90);
		Student s3 = new Student("25003", "이승엽", 77);
		Student s4 = new Student("25004", "김갑용", 100);
		Student s5 = new Student("25005", "이용규", 50);
		
		Set<Student> t1 = new TreeSet<Student>();
		
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		t1.add(s4);
		t1.add(s5);
		
		System.out.println(t1);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 학번순 정렬 (오름차순)");
		System.out.println("2. 이름순 정렬 (오름차순)");
		System.out.println("3. 성적순 정렬 (내림차순)");
		System.out.println("9. 종료");
		System.out.println("정렬 기준을 선택하세요 >>>");
		
		int userInput = sc.nextInt();
		
		switch (userInput) {
		case 1:
			TreeSet<Student> tmp = new TreeSet<Student>(new StuNoComparator());
			tmp.addAll(t1);
			t1 = new TreeSet<Student>(new StuNoComparator());
			t1.addAll(tmp);
			break;
		case 2:
			TreeSet<Student> tmp2 = new TreeSet<Student>(new StuNameComparator());
			tmp2.addAll(t1);
			t1 = new TreeSet<Student>(new StuNameComparator());
			t1.addAll(tmp2);
			break;
		case 3:
			TreeSet<Student> tmp3 = new TreeSet<Student>(new ScoreComparator());
			tmp3.addAll(t1);
			t1 = new TreeSet<Student>(new ScoreComparator());
			t1.addAll(tmp3);
			break;
		case 9:
			System.exit(0);
			break;
		default:
			break;
		}
		
		
		System.out.println(t1);
		

	}

}
