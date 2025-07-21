package webjis.vocabulary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Vocabulary {
	
	private HashMap<String, ArrayList<String>> vocabulary = new HashMap<String, ArrayList<String>>();
	
	// k는 key로 쓸 word, d는 definition
	
	public void insertWord(String k, String... d) {
		
		ArrayList<String> tmpList = new ArrayList<String>();  
		for(int i = 0; i < d.length; i++) {
			tmpList.add(d[i]);
		}
		
		if(vocabulary.containsKey(k)) {
			
			ArrayList<String> oldList = vocabulary.get(k);
			for(String tmpM : tmpList) {
				if(!oldList.contains(tmpM)){
					oldList.add(tmpM);
				}
			}
			vocabulary.put(k, oldList);
			
		} else {
			
			vocabulary.put(k, tmpList);
		}
		
		System.out.println("[" + k + "] 입력 완료");
	}
	
	public void searchByWord(String k) {
		System.out.println("[" + k + "] 의 검색결과 :");
		if(!vocabulary.containsKey(k)) {
			System.out.println("단어장에 존재하지 않는 단어입니다.");
		} else {
			System.out.println(k + "의 의미 : " + vocabulary.get(k));
		}
	}
	
	public void searchByDefinition(String d) {
		
		System.out.println("[" + d + "] 의 검색결과 :");
		
		boolean isFind = false;
		Set<Entry<String, ArrayList<String>>> tmpSet = vocabulary.entrySet();
		
		for (Entry<String, ArrayList<String>> entry : tmpSet) {
			
			for(String tmpM : entry.getValue()) {
				if(tmpM.equals(d)) {
					System.out.println(entry.getKey() + "의 의미 : " + entry.getValue());
					isFind = true;
				}
			}
			
		}
		
		if(!isFind) {
			System.out.println("검색결과가 존재하지 않습니다.");
		}
		
	}

	public void deleteWord(String k) {
		vocabulary.remove(k);
		System.out.println("[" + k + "] 삭제 완료");
	}

	public void showVocabulary() {
		
		System.out.println("[단어장 전체 조회]");
		Set <Entry<String, ArrayList<String>>> tmpSet = vocabulary.entrySet();
		for(Entry<String, ArrayList<String>> entry : tmpSet) {
			System.out.println(entry.getKey() + "의 의미 : " + entry.getValue());
		}
		
	}

}
