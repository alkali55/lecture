package ex1;

public class Account {
	private int balance = 0;
	
	public void deposit(int money) {
		if (isValid(money)) {
			balance += money;			
		} else {
			System.out.println("유효하지 않은 요청입니다.");
		}
	}
	
	public void withdraw(int money) {
		if (isValid(money)) {
			if (isValid(balance - money)) {
				balance -= money;
			} else {
				System.out.println("유효하지 않은 요청입니다.");
			}
		} else {
			System.out.println("유효하지 않은 요청입니다.");
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
	private boolean isValid(int money) {
//		boolean result = false;
//		if (money >= 0) {
//			result = true;
//		}
//		return result;
		return money >= 0;
	}
}
