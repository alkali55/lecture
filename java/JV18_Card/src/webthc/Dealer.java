package webthc;

import java.util.Arrays;

public class Dealer {
	
	// 멤버 변수
	public static final int CARD_CNT = Card.KIND_MAX * Card.NUMBER_MAX;
	
	private Card[] cardDeck = new Card[CARD_CNT];
	private static int curCardCount = 0; // 딜러가 가지고 있는 카드 수
	
	
	// 생성자
	public Dealer() {
		// 딜러 등장시 개봉하지 않은 카드를 들고 옴.
		curCardCount = CARD_CNT;
		int cardIndex = 0;
		for (int cardKind = 1; cardKind <= Card.KIND_MAX; cardKind++) {
			for (int cardNum = 1; cardNum <= Card.NUMBER_MAX; cardNum++) {
				cardDeck[cardIndex] = new Card(cardKind, cardNum);
				cardIndex++;
			}
		}
	}
	
	// 메서드
	
	public String displayCard() {
		return "전체 카드 갯수 : " + this.cardDeck.length +
				", [Cards] : " + Arrays.toString(this.cardDeck);
	}
	
	public void shuffle() {
		// 카드 섞기
		for (int i = 0; i < 1000; i++) {
			int index = (int)(Math.random() * 52); // 0 ~ 51 사이의 랜덤 정수
			
			Card tmp = this.cardDeck[index];
			this.cardDeck[index] = this.cardDeck[0];
			this.cardDeck[0] = tmp;
			
		}
	}

	public Card pickCard() {
		// 카드 지급
		// 1) 뽑은 카드는 null 처리
		int index = 0; // 랜덤 인덱스
		Card returnCard = null; // 뽑힌 카드
		
		do {
			index = (int)(Math.random() * CARD_CNT);
			returnCard = this.cardDeck[index];
		} while(returnCard == null);
		
		this.cardDeck[index] = null; // 지급된 카드 요소에 null 넣기
		
		return returnCard;
		
	}
	
	public Card pickCardWithRemoveArray() {
		// 2) 랜덤으로 카드를 뽑은 후, 배열의 크기를 하나씩 줄여 새로 카드덱을 생성해서 남은 카드를 넣는다.
		int index = (int)(Math.random() * curCardCount);
		Card returnCard = cardDeck[index];
		
		curCardCount--;
		Card[] tmpDeck = new Card[curCardCount];
		for(int i = 0; i < curCardCount; i++) {
			if(i < index) {
				tmpDeck[i] = cardDeck[i];
			} else {
				tmpDeck[i] = cardDeck[i+1];
			}
		}
		
		cardDeck = tmpDeck;
		return returnCard;
	}
}
