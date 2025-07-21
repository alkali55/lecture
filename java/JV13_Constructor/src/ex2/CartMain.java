package ex2;

public class CartMain {

	public static void main(String[] args) {
		// Book클래스 멤버변수 : 책이름, 가격, 수량
		// Cart클래스 멤버변수 : Book배열, 전체수량
		// 캡슐화
		// Book, Cart 클래스는 다른 패키지에서도 사용할 수 있어야 한다.
		// 카드(장바구니)에는 10개까지만 담을 수 있습니다. (10개 초과시, "장바구니에는 10개까지만 담을 수 있습니다" 출력)
		
		Cart cart = new Cart();
		Book book1 = new Book("자바", 20000, 2);
		Book book2 = new Book("JSP", 22000, 3);
		
		cart.addBook(book1);
		cart.addBook(book2);
		
		cart.displayBooks(); // 장바구니 상품 출력하고, 전체 가격의 총합을 출력한다.

	}

}
