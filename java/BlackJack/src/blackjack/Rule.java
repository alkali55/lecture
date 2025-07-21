package blackjack;

public class Rule {
	
	
	public static String judgeWL (int dealerScore, int playerScore) {
		if (dealerScore > playerScore) {
			return "딜러 승";
		} else if (dealerScore == playerScore) {
			return "무승부";
		} else {
			return "플레이어 승";
		}
	}
	
	public static boolean isBust(int score) {
		if(score > 21) {
			return true;
		} else {
			return false;
		}
	}
	
}
