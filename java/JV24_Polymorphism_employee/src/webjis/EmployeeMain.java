package webjis;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegEmp r1 = new RegEmp("001", "홍길동", 3000000);
		PartEmp p1 = new PartEmp("002", "하정우", 120, 11000);
		Department d1 = new Department("IT");
		
		d1.printEmp();
		d1.arrangeEmp(r1);
		d1.arrangeEmp(p1);
		d1.printEmp();
	}

}
