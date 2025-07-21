package ex1;

public class AccountMain {

	public static void main(String[] args) {
		Account acc1 = new Account();
		System.out.println(acc1.getBalance());
		
		acc1.deposit(500);
		System.out.println(acc1.getBalance());
		
		acc1.withdraw(1000);
		System.out.println(acc1.getBalance());
		
		acc1.deposit(-1);
		System.out.println(acc1.getBalance());
		
		acc1.withdraw(500);
		System.out.println(acc1.getBalance());
		
		acc1.withdraw(-500);
		System.out.println(acc1.getBalance());
	}

}
