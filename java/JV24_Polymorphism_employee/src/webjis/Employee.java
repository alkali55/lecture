package webjis;

public class Employee {
	private String empNo;
	private String name;
	private String departName;
	private int salary;
	
	Employee(String empNo, String name, int salary){
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}
	

	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}


	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", departName=" + departName + ", salary=" + salary
				+ "]";
	}

	
}
	
	
