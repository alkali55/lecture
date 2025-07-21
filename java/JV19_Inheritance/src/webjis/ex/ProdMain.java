package webjis.ex;

public class ProdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie movie = new Movie("마블", 9000, "감독님", "15세 관람가");
		Book book = new Book("자바", 32000, "신용권 외", "10101024");
		Album album = new Album("벚꽃엔딩", 10000, "장범준");
		
		System.out.println(movie.display());
		System.out.println(book.display());
		System.out.println(album.display());
		
		int total = book.getPrice() + movie.getPrice() + album.getPrice();
		System.out.println("총 가격 : " + total + "원");
		
	}

}
