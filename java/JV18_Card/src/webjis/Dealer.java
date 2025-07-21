package webjis;

import java.util.Arrays;

public class Dealer {

	
	
	static void pickCard(Deck deck) {
		Card[] cardArr = deck.getDeck();
		for (int i = 51; i >= 0; i--) {
			System.out.println(cardArr[i].getCardPat() + cardArr[i].getCardNum());
			deck.pickedCard();
		}
	}
	
	static void shuffleDeck(Deck cardDeck) {
		Card[] deck = cardDeck.getDeck();
		int[] tmpArr = new int[52];
		Card[] shuffledDeck = new Card[52];
		for(int i = 0; i < 52; i++) {
			boolean isDup = true;
			while (isDup) {
				isDup = false;
				int tmp = (int)(Math.random() * 52);
				for (int j = 0; j < i; j++) {
					if (tmp == tmpArr[j]) {
						isDup = true;
					}
				}
				if (!isDup) {
					tmpArr[i] = tmp;
				}
			}
			shuffledDeck[tmpArr[i]] = deck[i];
		}
		cardDeck.setDeck(shuffledDeck);
	}
}
