package webthc;

public class Customer1 {
	private int money = 1000000;
	private int point;
	static final int MAX_ITEM = 5;
	private int prodCounter = 0;
	private Electronics[] items = new Electronics[MAX_ITEM];
	
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Electronics[] getItems() {
		return items;
	}

	public void setItems(Electronics[] items) {
		this.items = items;
	}

	
	// 구매 메서드
	public void buy(Electronics elec) {
		if(prodCounter >= MAX_ITEM) {
			System.out.println(MAX_ITEM + "개 까지만 구매하실 수 있습니다.");
			return;
		}
		
		if(money < elec.getPrice()) {
			System.out.println("잔액이 부족합니다.");
			return;
		} 
		money -= elec.getPrice();
		point += elec.getPoint();
		items[prodCounter++] = elec; 
	}
	
	public void printItems() {
		System.out.println("구입 목록 리스트");
		
		int sum = 0;
		for(int i = 0; i < prodCounter; i++) {
			sum += items[i].getPrice();
			System.out.println(items[i]);
		}
		
		System.out.println("총가격 : " + sum + "원");
		System.out.println("적립포인트 : " + point + "원");
	}
	
}
