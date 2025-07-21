package webthc.korean;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import webjis.korean.Korean;

public class KoreanMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean1 k1 = new Korean1("250317-1234567", "홍길동");
		Korean1 k2 = new Korean1("250317-1234567", "홍길동");
		Korean1 k3 = new Korean1("250317-1234567", "홍길동");
		
		Set set = new HashSet<>();
		
		set.add(k1);
		set.add(k2);
		set.add(k3);
		
		
		Student stu = new Student("25001", "이대호", 90, 80, 90);
		set.add(stu);
		System.out.println(k1.equals(stu));
		
		
		System.out.println(set);
		
		System.out.println("k1의 equals() : " + k1.equals(k2)); // false -- equals 오버라이딩 한 후 true
		
		System.out.println("k1의 해시코드 : " + k1.hashCode());
		System.out.println("k2의 해시코드 : " + k2.hashCode());
		
		String str1 = "250317-1234567";
		String str2 = "250317-1234567";
		System.out.println(str1 == str2);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1.equals(str2));
		
		System.out.println("----------- ex -------------");
		Student stu2 = new Student("25001", "이대호", 90, 80, 90);
		System.out.println(Objects.hash(stu));
		System.out.println(Objects.hash(stu2));
		
	}

}
