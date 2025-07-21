package ex2;

public class Cart {
	
	// 멤버 변수
	private Book[] bookArr = new Book[10];
	private int totalQuantity = 0;
	
	// 생성자
	public Cart() { 
		// 기본 생성자
	}
	
	// 메서드
	public void addBook (Book book) {
//		if (totalQuantity < bookArr.length) {
//			bookArr[totalQuantity] = book;
//			totalQuantity += 1;
//		} else {
//			System.out.println("장바구니에는 10개까지만 담을 수 있습니다");
//		}
		
		if (totalQuantity >= bookArr.length) {
			System.out.println("장바구니에는 10개까지만 담을 수 있습니다");
			return; // 조건이 만족될 때, 메서드 실행 중단
		}
		bookArr[totalQuantity] = book;
		totalQuantity += 1;
	}
	
	public void displayBooks() {
		int totalPrice = 0;
		System.out.println("-------------장바구니-------------");
		for(int i = 0; i < totalQuantity; i++) {
			System.out.println("책이름 : " + bookArr[i].getBookTitle() + ", 가격 : " + bookArr[i].getBookPrice() + ", 수량 : " + bookArr[i].getBookQuantity());
			totalPrice += bookArr[i].getBookPrice() * bookArr[i].getBookQuantity();
		}
		System.out.println("총 가격 : " + totalPrice);
	}
}
