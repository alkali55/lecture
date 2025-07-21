package webthc;

public class Permanent1 extends Employee1{
	
	public Permanent1(String empNo, String empName, int deptNo, int salary) {
		super(empNo, empName, deptNo, salary);
	}
	
	@Override
	public String toString() {
		return super.toString() + " Permanent1 ";
	}

	public int calSalary() {
		return salary;
	}
}
