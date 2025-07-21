package ex2;

public class Book {
	
	// 멤버 변수 : 책이름, 가격, 수량	
	private String title;
	private int price;
	private int quantity;
	
	// 생성자
	public Book(String title, int price, int quantity){
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}
	
	// 메서드
	public String getBookTitle() {
		return title;
	}
	
	public int getBookPrice() {
		return price;
	}
	
	public int getBookQuantity() {
		return quantity;
	}
	
}
