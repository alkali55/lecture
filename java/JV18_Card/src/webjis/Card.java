package webjis;

public class Card {
	private char cardPat;
	private String cardNum;
	
	Card (char pat, String num) {
		cardPat = pat;
		cardNum = num;
	}
	
	char getCardPat() {
		return cardPat;
	}
	
	String getCardNum() {
		return cardNum;
	}
}
