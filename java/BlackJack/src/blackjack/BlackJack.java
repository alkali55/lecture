package blackjack;

import java.util.Deque;
import java.util.Scanner;

public class BlackJack {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		BlackJack game1 = new BlackJack();
		game1.start();
	
		
		
	}
	
	public void start() {
		boolean isEnd = false;
		while(!isEnd) {
			System.out.println("=============================================");
			System.out.println("==             블 랙 잭 Ver.01             ==");
			System.out.println("==                                         ==");
			System.out.println("== 1. 시작하기                             ==");
			System.out.println("== 2. 점수확인                             ==");
			System.out.println("== 3. 종료하기                             ==");
			System.out.println("=============================================");
			
			switch(sc.nextInt()) {
			case 1:
				blackjack();
				break;
			case 2:
				
				break;
			case 3:
				isEnd = true;
			}
		}
	}
	
	public void blackjack() {
		sc.nextLine();
		System.out.println("플레이어 이름을 입력해주세요.");
		Player player = new Player(sc.nextLine());
		Player dealer = new Player("dealer");
		Deck deck = new Deck();
		dealer.shuffleDeck(deck);
		dealer.takeCard(deck);
		dealer.takeCard(deck);
		dealer.showCardAndScore();
		
		
		boolean isEnd = false;
		while(!isEnd) {
			System.out.println("=============================================");
			System.out.println("== 1. Hit                                  ==");
			System.out.println("== 2. Stand                                ==");
			System.out.println("== 3. 딜러의 카드 확인                     ==");
			System.out.println("=============================================");
			int inputNum = sc.nextInt();
			if(inputNum == 1) {
				player.takeCard(deck);
				player.showCardAndScore();
				if (Rule.isBust(player.getScore())) {
					System.out.println("버스트!");
					System.out.println("패배하셨습니다.");
					return;
				}
			} else if (inputNum == 2) {
				while(dealer.getScore() <= 16) {
					try {
					Thread.sleep(2000);
					}
					catch (InterruptedException e) {
						e.printStackTrace();
						
					}
					dealer.takeCard(deck);
					dealer.showCardAndScore();
				}
				if(Rule.isBust(dealer.getScore())) {
					System.out.println("딜러 버스트!");
					System.out.println("승리하셨습니다.");
					return;
				}
				
				System.out.println("딜러의 점수 : " + dealer.getScore());
				System.out.println(player + "의 점수 : " + player.getScore());
				System.out.println(Rule.judgeWL(dealer.getScore(), player.getScore()));
				return;
			} else if (inputNum == 3){
				dealer.showCardAndScore();
			}
		}
		
		
		
	}

}
