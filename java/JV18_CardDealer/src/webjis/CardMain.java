package webjis;

public class CardMain {

	public static void main(String[] args) {
		Deck d1 = new Deck();
		
		d1.showDeck();
		Dealer.shuffleDeck(d1);
		d1.showDeck();
		Dealer.pickCard(d1);
		d1.showDeck();
	}

}
