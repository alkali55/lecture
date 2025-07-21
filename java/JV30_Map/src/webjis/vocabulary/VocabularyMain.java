package webjis.vocabulary;

public class VocabularyMain {

	public static void main(String[] args) {
		
		Vocabulary v = new Vocabulary();
		
		v.insertWord("apple", "사과", "컴퓨터 회사");
		v.insertWord("apple", "뉴욕");
		v.insertWord("mean", "~을 뜻하다", "못된");
		
//		v.deleteWord("mean");
		
		v.searchByWord("apple");
		v.searchByWord("grape");
		
		v.searchByDefinition("못된");
		
		v.showVocabulary();
		
	}

}
