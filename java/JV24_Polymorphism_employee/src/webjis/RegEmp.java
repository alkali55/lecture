package webjis;

public class RegEmp extends Employee{
	
	RegEmp(String empNo, String name, int salary){
		super(empNo, name, salary);
	}

	@Override
	public String toString() {
		return "RegEmp [" + super.toString() + "]";
	}

	

	

	
}
