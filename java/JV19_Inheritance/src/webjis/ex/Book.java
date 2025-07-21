package webjis.ex;

public class Book extends Product{
	
	private String author;
	private String isbn;
	
		
	Book(String name, int price, String author, String isbn){
		super(name, price);
		this.author = author;
		this.isbn = isbn;
	}
	
	@Override
	public String display() {
		return super.display() + " 저자 : " + author + ", isbn : " + isbn;
	}
		
//		void displayBook() {
//			super.displayProduct();
//			System.out.println("저자 : " + author + ", 고유번호 : " + isbn);
//		}
}
