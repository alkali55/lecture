package webjis;

public class CardMain {

	public static void main(String[] args) {
		
		// 카드 객체 생성
		Card card1 = new Card();
		card1.kind = "Spade";
		card1.number = 2;
		
		System.out.println("card1: 모양은 " + card1.kind + ", 숫자는 " + card1.number);
		
		Card card2 = new Card();
		card2.kind = "Heart";
		card2.number = 3;
		
		System.out.println("card2: 모양은 " + card2.kind + ", 숫자는 " + card2.number);
		
		System.out.println("card의 가로 : " + Card.width + ", 세로 : " + Card.height);
		
		System.out.println("card1의 가로 : " + card1.width + ", 세로 : " + card1.height); // The static field Card.width should be accessed in a static way
		System.out.println("card2의 가로 : " + card2.width + ", 세로 : " + card2.height); // The static field Card.width should be accessed in a static way
		
		// 카드 크기 변경
		System.out.println("카드 크기 변경 : 축소");
		Card.width = 50;
		Card.height = 100;
		
		System.out.println("card1의 가로 : " + card1.width + ", 세로 : " + card1.height); // The static field Card.width should be accessed in a static way
		System.out.println("card2의 가로 : " + card2.width + ", 세로 : " + card2.height); // The static field Card.width should be accessed in a static way
		
		
	}

}
