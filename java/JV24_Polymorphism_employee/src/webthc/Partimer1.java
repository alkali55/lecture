package webthc;

public class Partimer1 extends Employee1{
	
	private int workTime; // 근무시간
	private int payPerHour; // 시급
	
	public Partimer1(String empNo, String empName, int deptNo, int workTime, int payPerHour) {
		super(empNo, empName, deptNo, 0);
		this.workTime = workTime;
		this.payPerHour = payPerHour;
		calSalary();
	}
	
	public int calSalary() {
		salary = workTime * payPerHour;
		return salary;
	}

	@Override
	public String toString() {
		return super.toString() + " Partimer1 [workTime=" + workTime + ", payPerHour=" + payPerHour +  "]";
	}
}
