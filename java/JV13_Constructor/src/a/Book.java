package a;

public class Book {
	
	// 멤버 변수
	
	public String bookName;
	public String author;
	public int price;
	
	// 생성자
	
	public Book() {
		// 기본 생성자
	}
	
	public Book(String bookName, String author, int price) {
		// 생성자 오버로딩
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	
	// 메서드
	
	public void displayBook() {
		System.out.println("제목 : " + bookName + ", 저자 : " + author + ", 가격 : " + price + "원");
	}
	
}
