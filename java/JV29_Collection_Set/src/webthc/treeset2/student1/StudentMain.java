package webthc.treeset2.student1;

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
		
		Scanner sc = new Scanner(System.in);
		
		
		// 반 생성
		StuClass class1 = new StuClass(1);
		
		// 반에 학생 추가
		class1.addStudent(s2);
		class1.addStudent(s3);
		class1.addStudent(s1);
		class1.addStudent(s4);
		class1.addStudent(s5);
		
		// 반 학생 목록 출력
		class1.outputAllStidents();
		
		while(true) {
			System.out.println("1. 학번순 정렬 (오름차순)");
			System.out.println("2. 이름순 정렬 (오름차순)");
			System.out.println("3. 성적순 정렬 (내림차순)");
			System.out.println("9. 종료");
			System.out.println("정렬 기준을 선택하세요 >>>");
			
			int menu = sc.nextInt();
			
			Set<Student> output = new TreeSet<Student>(SortManager.getSortMethod(menu));
			output.addAll(class1.getStuSet());
			
			for (Student s : output) {
				System.out.println(s);
			}
		}

	}

}
