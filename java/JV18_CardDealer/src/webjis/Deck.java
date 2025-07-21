package webjis;

import java.util.Arrays;

public class Deck {
	private Card[] cardDeck;
	private int cardCnt = 52;
	
	Deck() {
		cardDeck = new Card[52];
		String[] ajqk = {"A", "J", "Q", "K"};
		char[] basicPat = {'S', 'D', 'H', 'C'};
		for(int i = 0; i < 4; i++) {
			
			int tmpCount = 0;
			for(int j = 0; j < 13; j++) {
				if (j == 0 || j == 10 || j == 11 || j == 12) {
					cardDeck[(i * 13) + j] = new Card(basicPat[i], ajqk[tmpCount]);
					tmpCount++;
				} else {
					cardDeck[(i * 13) + j] = new Card(basicPat[i], Integer.toString(j));					
				}
				
			}
		}
		
	}
	
	void pickedCard() {
		cardCnt--;
		Card[] tmpDeck = new Card[cardCnt];
		for (int i = 0; i < cardCnt; i++) {
			tmpDeck[i] = cardDeck[i];
		}
		cardDeck = tmpDeck;
	}
	
	Card[] getDeck() {
		return cardDeck;
	}
	
	void setDeck(Card[] deck) {
		cardDeck = deck;
	}
	
	void showDeck() {
		for (int i = 0; i < cardCnt; i++) {
			System.out.print(cardDeck[i].getCardPat() + cardDeck[i].getCardNum() + " ");
		}
		System.out.println("");
	}
}
