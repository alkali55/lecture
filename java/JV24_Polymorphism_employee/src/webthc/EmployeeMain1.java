package webthc;

public class EmployeeMain1 {

	public static void main(String[] args) {
		Department1 아이티부서 = new Department1(10, "IT");
		
		// Agreegation : 부서 인스턴스가 소멸되더라도, 사원 인스턴스는 소멸되지 않는다.
		Employee1 이대호 = new Permanent1("250312", "이대호", 10, 2000000);
		아이티부서.addEmployee(이대호);
		아이티부서.outputAllEmployees();
		
		Partimer1 이택근 = new Partimer1("250313", "이택근", 10, 10, 20000);
		아이티부서.addEmployee(이택근);
		아이티부서.outputAllEmployees();
		
		// Composition : 부서 인스턴스가 소멸될 때 사원 인스턴스도 함께 소멸된다.
		아이티부서.addEmployee(new Permanent1("250314", "정근우", 10, 2000000));
		
	}

}
