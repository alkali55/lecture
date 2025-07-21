package webjis.map0;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "영재님");
		map.put(2, "성욱님");
		map.put(3, "유진님");
		map.put(4, "종원님");
		map.put(5, "인수님");
		map.put(6, "준규님");
		map.put(7, "강님");
		map.put(8, "성현님");
		map.put(7, "예비군"); // 기존에 저장된 키와 같은 키에 새로운 값 저장하는 경우, 기존의 값이 새로운 값으로 변경됨.
		
		System.out.println(map);
		
		// 탐색
		if(map.containsKey(7)) {
			System.out.println(map.get(7));
		} else {
			System.out.println("해당하는 값이 없습니다");
		}
		
		// Map에 있는 모든 키
		Set<Integer> keys = map.keySet();
		
		for (Integer key : keys) {
			System.out.println(key);
		}
		
		// Map에 있는 모든 값
		Collection<String> values = map.values();
		
		for (String value : values) {
			System.out.println(value);
		}
		
		System.out.println(map.isEmpty()); // false
		System.out.println(map.containsKey(10)); // false
		System.out.println(map.containsValue("홍길동")); // false
		
		System.out.println(map.getOrDefault(7, "defaultValue")); // 해당 키에 value가 있으면 출력(예비군)하고
		System.out.println(map.getOrDefault(10, "defaultValue")); // 없으면 defaultValue를 반환
		
		System.out.println(map.putIfAbsent(8, "putIfAbsent")); // 해당 키가 있으면 그 값을 반환하고(값을 update하지 않음)
		System.out.println(map.putIfAbsent(9, "putIfAbsent")); // 없으면, null 출력 (해당 키가 없으면 추가)
		System.out.println(map);
		
		// 수정
		map.replace(9, "replace");
		System.out.println(map);
		
		map.replace(9, "replace", "new replace");
		System.out.println(map);
		
		// 삭제
		map.put(10, "value10");
		System.out.println(map);
		
		map.remove(10);
		System.out.println(map);
		
		map.remove(9, "new replace");
		System.out.println(map);
		
		System.out.println("===================================================================");
		System.out.println("===================================================================");
		System.out.println("===================================================================");
		
		// 맵생성 : key : 학번, value : 성적
		Map<String, Integer> class1 = new HashMap<String, Integer>();
		class1.put("25001", 90);
		class1.put("25002", 99);
		class1.put("25003", 100);
		class1.put("25004", 55);
		class1.put("25005", 79);
		
		// 총 학생 목록 출력
		Set<Entry <String, Integer>> set = class1.entrySet();
//		System.out.println(set);
		
		Iterator iter = set.iterator();
		
		while (iter.hasNext()) {
			Map.Entry<String, Integer> es = (Map.Entry)iter.next();
			System.out.println("학번 : " + es.getKey() + ", 성적 : " + es.getValue());
		}
		
		
		// 학번만 출력
		Set<String> stuNos = class1.keySet();
//		System.out.println(stuNo);
		for (String stuNo : stuNos) {
			System.out.println(stuNo);
		}
		
		// 성적만 출력
		Collection<Integer> scores = class1.values();
//		System.out.println(scores);
		for (Integer score : scores) {
			System.out.println(score);
		}
		
		// 총 학생 수 출력
		System.out.println(class1.size());
		
		// 총점, 평균 출력
		int total = 0;
		float avg = 0;
		for (Integer score : scores) {
			total += score;
		}
		avg = (float)total / class1.size();
		System.out.println("총점 : " + total + ", 평균 : " + avg);
		
		// 성적이 70점 이상인 학생의 학번과 성적을 출력하세요.
		for (Entry<String, Integer> entry : class1.entrySet()) {
			if (entry.getValue() >= 70) {
				System.out.println("학번 : " + entry.getKey() + ", 성적 : " + entry.getValue());
			}
		}
		
//		iter = set.iterator();
//		while(iter.hasNext()) {
//			Map.Entry<String, Integer> es = (Map.Entry)iter.next();
//			if (es.getValue() >= 70) {
//				System.out.println("학번 : " + es.getKey() + ", 성적 : " + es.getValue());
//			}
//		}
	}

}
