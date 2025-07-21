package webjis.korean;

import java.util.HashSet;
import java.util.Set;

public class KoreanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("250317-1234567", "홍길동");
		Korean k2 = new Korean("250317-1234567", "홍길동");
		Korean k3 = new Korean("250317-1234567", "홍길동");
		
		Set<Korean> set = new HashSet<Korean>();
		
		set.add(k1);
		set.add(k2);
		set.add(k3);
		
		System.out.println(set);
		
		System.out.println("k1의 해시코드 : " + k1.hashCode());
		System.out.println("k2의 해시코드 : " + k2.hashCode());
		
		System.out.println("k1의 equals() : " + k1.equals(k2));
	}

}
