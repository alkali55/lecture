package webjis;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreV3Main {
	
	private static int curSavedStudentCnt = 0;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bool = true;
		StuClass stuClass = null; // 반객체 초기화
		
		while (bool) {
			outputMenu();
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				System.out.println("반을 생성합니다...");
				stuClass = createClass();
				break;
			case 2:
				System.out.println("학생을 입력합니다...");
				inputStudent(stuClass);
				break;
			case 3:
				System.out.println("전체 학생 점수를 출력합니다.");
				outputEntireStudent(stuClass);
				break;
			case 4:
				System.out.println("반과 학생을 자동으로 생성합니다.");
				stuClass = autoInputStudent();
				break;
			case 5:
				System.out.println("학번으로 검색합니다.");
				searchStudentByNo(stuClass);
				break;				
			case 9:
//				System.exit(0); // 프로그램 종료
				bool = false;
				break;
			}
		}
	}
	
	private static void searchStudentByNo(StuClass stuClass) {
		
		System.out.println("검색할 학생의 학번을 입력해주세요 >>>");
		String stuNo = sc.nextLine();
		
		stuClass.findStudentByNo(stuNo);
		
		
	}

	private static StuClass autoInputStudent() {
		Student[] stuList = {new Student("25001", "lee", 80, 77, 90),
							 new Student("25002", "choi", 99, 77, 66),
							 new Student("25003", "kim", 60, 55, 70)};
		StuClass stuClass = new StuClass(2, "jsp", stuList);
		curSavedStudentCnt = stuList.length;
		return stuClass;
	}

	public int getcurSavedSudentCnt() {
		return curSavedStudentCnt;
	}
	
	private static void outputEntireStudent(StuClass stuClass) {
		System.out.println("====================================");
		System.out.println("              성 적 표              ");
		System.out.println("====================================");
		System.out.println("반 번호 : " + stuClass.getNo() + ", 과정명 : " + stuClass.getStuClassName());
		System.out.println("------------------------------------");
		stuClass.outputAllStudents(curSavedStudentCnt);
		System.out.println("------------------------------------");
		System.out.println("반 총점 : " + stuClass.calTotalTot() +", 반 평균 : " + stuClass.calTotalAvg());
		
	}

	private static void inputStudent(StuClass stuClass) {
		if (stuClass == null) {
			System.out.println("반을 먼저 생성해야 합니다...");
			return;
		} else {
			if (curSavedStudentCnt < StuClass.STUDENT_MAX_COUNT) {
				// 학생 입력
				System.out.println("학번 >>> ");
				String stuNo = sc.nextLine();
				System.out.println("이름 >>> ");
				String stuName = sc.nextLine();
				System.out.println("국어 >>> ");
				int kor = Integer.parseInt(sc.nextLine());
				System.out.println("영어 >>> ");
				int eng = Integer.parseInt(sc.nextLine());
				System.out.println("수학 >>> ");
				int math = Integer.parseInt(sc.nextLine());
				stuClass.addStudent(new Student(stuNo, stuName, kor, eng, math), curSavedStudentCnt);
				curSavedStudentCnt++;
			} else {
				System.out.println("학생수가 초과됩니다.");
			} 
		}
		
	}

	private static StuClass createClass() {
		// 학생수 초기화
		curSavedStudentCnt = 0;
		
		// 입력받기
		System.out.println("반번호 입력 >>>");
		int stuClassNo = Integer.parseInt(sc.nextLine());
		
		System.out.println("과정명 입력 >>>");
		String stuClassName = sc.nextLine();
		
		// 반생성
		StuClass c1 = new StuClass(stuClassNo, stuClassName);
		System.out.println(c1.toString());
		System.out.println(Arrays.toString(c1.getStuList()));
		
		return c1;
	}

	private static void outputMenu(){
		System.out.println("***************************************************");
		System.out.println("**                 성 적 표 V3                   **");
		System.out.println("***************************************************");
		System.out.println("** 1. 반 생성                                    **");
		System.out.println("** 2. 생성된 반에 학생 입력 (1번 부터 수행)      **");
		System.out.println("** 3. 전체 학생 점수 출력                        **");
		System.out.println("** 4. 반, 학생 자동생성                          **");
		System.out.println("** 5. 학번으로 검색                              **");
		System.out.println("** 9. 종료                                       **");
		System.out.println("***************************************************");
		System.out.println("메뉴 번호 입력 >>> ");
	}
	
}
