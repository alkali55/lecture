package webthc;

public class CardDealerMain {

	public static void main(String[] args) {
		// 딜러 생성
		Dealer 주윤발 = new Dealer();
		System.out.println("섞기 전 카드 : ");
		System.out.println(주윤발.displayCard());
		
		주윤발.shuffle();
		System.out.println("섞은 후 카드 : ");
		System.out.println(주윤발.displayCard());
		
//		for(int i = 0; i < Dealer.CARD_CNT; i++) {
//			
//			// 카드 1장씩 지급
//			Card c = 주윤발.pickCard();
//			System.out.println((i + 1) + "번째 뽑힌 카드" + c.toString());
//			System.out.println(주윤발.displayCard());
//			
//		}
		
		for(int i = 0; i < Dealer.CARD_CNT; i++) {
			
			// 카드 1장씩 지급
			Card c = 주윤발.pickCardWithRemoveArray();
			System.out.println((i + 1) + "번째 뽑힌 카드" + c.toString());
			System.out.println(주윤발.displayCard());
			
		}

	}

}
