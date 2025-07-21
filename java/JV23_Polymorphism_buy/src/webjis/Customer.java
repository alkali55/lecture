package webjis;

public class Customer {
	private String name;
	private int money;
	private int point;
	private Product[] products = new Product[3];
	private int buyCnt = 0;
	
	Customer(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	public void showAll() {
		if (buyCnt == 0) {
			System.out.println("구매한 상품 없음!");
		} else {
			int totalPrice = 0;
			System.out.println("구매한 상품 목록 : ");
			for (int i = 0; i < buyCnt; i++) {
				System.out.println((i + 1) + "번 째 구매한 상품 : " + products[i]);
				totalPrice += products[i].getPrice();
			}
			System.out.println("총 가격 : " + totalPrice + ", 적립포인트 : " + point);
		}
	}
	
	public void buy(Product product) {
		if(buyCnt < 3) {
			if (money - product.getPrice() < 0) {
				System.out.println("잔액 부족!");
			} else {
				money -= product.getPrice();
				point += product.getPrice() * 0.1;
				products[buyCnt] = product;
				buyCnt++;
			}
		} else {
			System.out.println("더 이상 구매 불가!");
		}
	}
	
	public String toString() {
		return name;
	}
	
}
