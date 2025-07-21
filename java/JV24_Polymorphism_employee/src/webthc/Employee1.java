package webthc;

public abstract class Employee1 {
	
	private String empNo;
	private String empName;
	private int deptNo;
	protected int salary;
	
	public Employee1(String empNo, String empName, int deptNo, int salary) {
		this.empNo = empNo;
		this.empName = empName;
		this.deptNo = deptNo;
		this.salary = salary;
	}
	
	// 급여계산방법이 정규직과 알바직 사원에 따라서 다르므로 abstract 메서드로 만든다.
	public abstract int calSalary();

	@Override
	public String toString() {
		return "Employee1 [empNo=" + empNo + ", empName=" + empName + ", deptNo=" + deptNo + ", salary=" + salary + "]";
	}
	
	
	
}
