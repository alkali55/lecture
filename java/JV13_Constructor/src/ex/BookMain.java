package ex;

import a.Book;

public class BookMain {

	public static void main(String[] args) {
		
		// 아래의 코드가 동작되도록 Book 클래스를 만들어 보세요.
		// 중복 코드는 최대한 줄여봅시다.
		Book book1 = new Book();
		book1.bookName = "스프링";
		book1.author = "이름";
		book1.price = 300000;
		
		book1.displayBook(); // 책의 속성값이 출력 (제목, 저자, 가격)
		
		Book book2 = new Book("이것이자바다", "신용권외", 38000);
		book2.displayBook();
		
		Book book3 = new Book("DoIt오라클", "이지훈", 23000);
		book3.displayBook();
		
	}

}
