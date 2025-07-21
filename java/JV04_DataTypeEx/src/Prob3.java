import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		// 메뉴 선택
		// 1. 도서 정보 입력 2. 총비용 3. 종료
		// 1번 선택시 : 도서명, 가격, 수량을 입력받아서 -> 정보 출력
		// 2번 선택시 : 총비용 (=가격 * 수량) 출력
		// 3번 선택시 : 종료
		// 1, 2, 3 중에서 선택하지 않은 경우, "올바르게 선택해 주세요"

//		int inputNum = 0;
//		String[] bookNameArr = new String[5];
//		int priceArr[] = new int[5];
//		int quantArr[] = new int[5];
//		int sum = 0;
//		int count = 0;
//		
//		while (inputNum != 3) {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("1. 도서 정보 입력 2. 총비용 3. 종료>>>");
//			inputNum = sc.nextInt();
//			if (inputNum == 1 && count < 5) {
//				sc.nextLine();
//				System.out.println("도서명을 입력해 주세요>>>");
//				bookNameArr[count] = sc.nextLine();
//				System.out.println("가격을 입력해 주세요>>>");
//				priceArr[count] = sc.nextInt();
//				System.out.println("수량을 입력해 주세요>>>");
//				quantArr[count] = sc.nextInt();
//				count++;
//				for (int i = 0; i < count; i++) {
//					System.out.println("도서명: " + bookNameArr[i] + " 가격: " + priceArr[i] + "원 수량 :" + quantArr[i]);
//				}
//				
//			} else if (count != 0 && inputNum == 2) {
//				sum = 0;
//				for (int i = 0; i < count; i++) {
//					sum += priceArr[i] * quantArr[i];
//				}
//				System.out.println("총비용은 " + sum + "원 입니다.");
//						
//			} else if (inputNum == 1 && count >=5) {
//				System.out.println("입력 최대 수량을 초과했습니다.");
//			} else if (count == 0 && inputNum == 2) {
//				System.out.println("도서 정보를 먼저 입력해 주세요");
//			}
//
//		}

		int inputNum = 0;
//		String bookName = "";
//		int price = 0;
//		int quant = 0;
		int sum = 0;
		int count = 0;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("1. 도서 정보 입력 2. 총비용 3. 종료>>>");
			inputNum = sc.nextInt();
			if (inputNum == 1) {
				sc.nextLine(); // \n 읽기
				System.out.print("도서명을 입력해 주세요>>>");
				String bookName = sc.nextLine();
				System.out.print("가격을 입력해 주세요>>>");
				int price = sc.nextInt();
				System.out.print("수량을 입력해 주세요>>>");
				int quant = sc.nextInt();
				sum = price * quant;
			} else if (inputNum == 2) {
				
				System.out.println("총비용은 " + sum + "원 입니다.");
			} else if (inputNum == 3) {
				System.out.println("프로그램을 종료합니다");
				break;
			}

		}

//		System.exit(0); // 강제종료
//		sc.close(); // 스트림 닫기

	}

}
