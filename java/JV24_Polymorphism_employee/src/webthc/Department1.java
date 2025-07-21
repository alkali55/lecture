package webthc;

import java.util.ArrayList;

public class Department1 {
	
	private int deptNo;
	private String deptName;
	private ArrayList<Employee1> empList;
	
	Department1 (int deptNo, String deptName){
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.empList = new ArrayList<Employee1>();
	}
	
	// 사원 추가
	public void addEmployee(Employee1 e) {
		empList.add(e);
	}
	
	// 사원 출력
	public void outputAllEmployees() {
		for(Employee1 e : empList) {
			System.out.println(e);
		}
	}
	
}
