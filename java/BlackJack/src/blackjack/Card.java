package blackjack;

public class Card {
	private int num;
	private char pat;
	
	public Card(int num, char pat) {
		this.num = num;
		this.pat = pat;
	}
	
	@Override
	public String toString() {
		if(num == 1) {
			return pat+"A";
		} else if (num == 11) {
			return pat+"J";
		} else if (num == 12) {
			return pat+"Q";
		} else if (num == 13) {
			return pat+"K";
		} else {			
			return Character.toString(pat)+num;
		}
		
	}

	public int getNum() {
		return num;
	}
}
