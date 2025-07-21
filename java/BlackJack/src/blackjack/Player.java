package blackjack;


public class Player {
	private int score;
	private Card[] cards = new Card [12];
	private int curCardCnt = 0;
	private String name;
	
	Player(String name){
		this.name = name;
	}
	
	
	public void shuffleDeck(Deck cardDeck) {
		int deckCnt = cardDeck.getCurCardCnt();
		Card[] deck = cardDeck.getDeck();
		int[] tmpArr = new int[deckCnt];
		Card[] shuffledDeck = new Card[deckCnt];
		for(int i = 0; i < deckCnt; i++) {
			boolean isDup = true;
			while (isDup) {
				isDup = false;
				int tmp = (int)(Math.random() * deckCnt);
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
	
	public int getScore() {
		return score;
	}


	public void showCardAndScore() {
		System.out.println(this + "의 카드 : ");
		for(int i = 0; i < curCardCnt; i++) {
			System.out.print(cards[i] + " ");
		}
		System.out.println("현재 " + score + "점");
	}
	
	public void takeCard(Deck deck) {
		int deckCnt = deck.getCurCardCnt();
		cards[curCardCnt] = deck.returnCard(deckCnt - 1);
		if(cards[curCardCnt].getNum() > 10) {
			score += 10;
		} else {
			score += cards[curCardCnt].getNum();
		}
		curCardCnt++;
		deckCnt--;
		deck.setCurCardCnt(deckCnt);
		Card[] tmpArr = new Card[deckCnt];
		for(int i = 0; i < deckCnt; i++) {
			tmpArr[i] = deck.returnCard(i);
		}
		deck.setDeck(tmpArr);
		
	}
	
	public String toString() {
		return name;
	}
	
}
