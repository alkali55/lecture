package webjis;

public class Department {
	
	private String name;
	final static int MAX_EMP = 10;
	private Employee[] emps = new Employee[MAX_EMP];
	private int empCnt = 0;
	
	Department(String name){
		this.name = name;
	}
	
	public void arrangeEmp(Employee emp) {
		if(empCnt >= 10) {
			System.out.println("부서 최대 정원 초과");
			return;
		}
		emps[empCnt] = emp;
		emp.setDepartName(name);
		empCnt++;
	}
	
	public void printEmp() {
		if(empCnt == 0) {
			System.out.println(this + "에 사원이 존재하지 않습니다.");
			return;
		}
		System.out.println(this + "의 사원 : ");
		for(int i = 0; i < empCnt; i++) {
			System.out.println(emps[i]);
		}
	}
	
	public String toString() {
		return name + " 부서";
	}
}
