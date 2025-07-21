package blackjack;

import java.util.Arrays;

public class Deck {
	
	private Card[] deck;
	private int curCardCnt = 52;
	
	Deck(){
		deck = new Card[52];
		char[] tmpArr = {'S', 'H', 'D', 'C'};
		for(int i = 0; i < tmpArr.length; i++) {
			for(int j = 0; j < 13; j++) {
				deck[i*13 + j] = new Card(j+1, tmpArr[i]);
			}
		}
		
	}
	
	public Card[] getDeck() {
		return deck;
	}

	public void setDeck(Card[] deck) {
		this.deck = deck;
	}

	public Card returnCard(int i) {
		return deck[i];
	}
	
	public int getCurCardCnt() {
		return curCardCnt;
	}

	public void setCurCardCnt(int curCardCnt) {
		this.curCardCnt = curCardCnt;
	}

	public String toString() {
		return Arrays.toString(deck);
	}
}
