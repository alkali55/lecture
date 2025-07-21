package webjis.hashmapex.cart;

public class ThcMain {

	public static void main(String[] args) {

		ThcCart cart = new ThcCart();
		
		cart.addProduct(new Product("자바", 20000), 1);
		cart.addProduct(new Product("자바", 20000), 1);
		cart.addProduct(new Product("오라클", 30000), 1);
		cart.addProduct(new Product("자바", 20000), 1);
		
		cart.displayCart();
		
		System.out.println("오라클 책 1권 삭제 ------");
		cart.deleteProduct(new Product("오라클", 30000), 2);
		cart.displayCart();
		
		System.out.println("자바 책 1권 삭제 ------");
		cart.deleteProduct(new Product("자바", 20000), 1);
		cart.displayCart();
	}

}
