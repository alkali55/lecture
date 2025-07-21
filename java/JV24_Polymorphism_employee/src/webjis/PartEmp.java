package webjis;

public class PartEmp extends Employee{
	private int workTime;
	private int hourlyWage;
	
	PartEmp(String empNo, String name, int workTime, int hourlyWage){
		super(empNo, name, workTime * hourlyWage);
		this.workTime = workTime;
		this.hourlyWage = hourlyWage;
	}

	public int getWorkTime() {
		return workTime;
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}

	public int getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	@Override
	public String toString() {
		return "PartEmp [workTime=" + workTime + ", hourlyWage=" + hourlyWage + ", " + super.toString()
				+ "]";
	}

	
	
}
