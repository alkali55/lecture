package webthc.hashmapex.voca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VocaMain {
	public static Scanner sc = new Scanner(System.in);
	
	public static Map<String, ArrayList<String>> vocaBook = new HashMap<String, ArrayList<String>>();
	
	public static void main(String[] args) {
		
		addWord("apple", "사과");
		addWord("apple", "컴퓨터 회사");
		addWord("watch", "손목시계");
		addWord("cat", "고양이");
		addWord("bat", "야구방망이");
		addWord("bat", "박쥐");
		
		// 메뉴 출력
		outputMenu();

	}

	private static void outputMenu() {
		while(true) {
			System.out.println("1. 단어 등록");
			System.out.println("2. 단어장 출력");
			System.out.println("3. 검색: 단어 -> 뜻");
			System.out.println("4. 검색: 뜻 -> 단어");
			System.out.println("5. 단어 삭제");
			System.out.println("9. 종료");
			
			System.out.println("번호를 입력하세요>>>");
			
			int menu = 0;
			
			try {
				menu = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("메뉴번호를 확인하고 다시 입력해 주세요.");
				continue;
			}
			
			switch(menu) {
			case 1:
				addNewWord();
				break;
			case 2:
				outputVocaBook();
				break;
			case 3:
				searchByWord();
				break;
			case 4:
				searchByMeaning();
				break;
			case 5:
				deleteWord();
				break;
			case 9:
				System.exit(0);
				break;
			}
			
		}
		
	}
	
	private static void deleteWord() {
		System.out.println("삭제할 단어 입력 >>> ");
		String wordToDelete = sc.nextLine();
		vocaBook.remove(wordToDelete);
		
		
	}

	private static void searchByMeaning() {
		// 뜻으로 단어 조회
		System.out.println("조회할 뜻을 입력 >>> ");
		String meaning = sc.nextLine();
		
		System.out.println(" -------" + meaning + " 뜻을 가진 단어 검색 -------");
		
		boolean isFind = false;
		
		for(Map.Entry<String, ArrayList<String>> entry : vocaBook.entrySet()) {
			
			String word = entry.getKey();
			
			ArrayList<String> meanings = entry.getValue();
			
			for(String m : meanings) {
				if (m.contains(meaning)) {
					isFind = true;
					System.out.println(word);
					break;
				}
			}
			
		}
		
		if(!isFind) System.out.println("그런 뜻을 가진 단어는 없습니다....");
		
	}

	private static void searchByWord() {
		// 단어로 뜻 조회
		
		System.out.println("조회할 단어 입력 >>>");
		String wordToSearch = sc.nextLine();
		System.out.println(" ----- " + wordToSearch + "의 뜻을 검색합니다.");
		
		ArrayList<String> meanings = vocaBook.get(wordToSearch);
		
		if(meanings != null) {
			System.out.println(meanings);
		} else {
			System.out.println("뜻이 없습니다.");
		}
	}

	private static void outputVocaBook() {
		// 단어장 출력
//		Set<String> words = vocaBook.keySet();
//		
//		for(String word : words) {
//			// 뜻 가져오기
//			List<String> meanings = vocaBook.get(word);
//			
//			for(String meaning : meanings) {
//				System.out.print(" " + meaning);
//			}
//			System.out.println();
//		}
		
		// Map.Entry
		for (Map.Entry<String, ArrayList<String>> entry : vocaBook.entrySet()) {
			String word = entry.getKey();
			
			ArrayList<String> meanings = entry.getValue();
			System.out.println(word + " : " + meanings);
		}
	}

	private static void addNewWord() {
//		System.out.println("새 단어 추가");
		System.out.println("영어단어를 입력하세요 >>> ");
		String newWord = sc.nextLine();
		
		while(true) {
			System.out.println("뜻을 입력하세요 (모두 입력 후에는 q를 입력)");
			
			String newMeaning = sc.nextLine();
			
			if(newMeaning.equals("q")) {
				break;
			} else {
				addWord(newWord, newMeaning);
			}
		}
		
	}

	private static void addWord(String newWord, String newMeaning) {

		if (vocaBook.containsKey(newWord)){
			// 단어장에 단어 존재하는 경우
			vocaBook.get(newWord).add(newMeaning); // 뜻 배열에 새로운 뜻을 추가
		} else {
			// 단어장에 단어가 없는 경우
			ArrayList<String> meanings = new ArrayList<String>();
			meanings.add(newMeaning);
			vocaBook.put(newWord, meanings);
		}
		
		
	}

}
