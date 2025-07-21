package webjis.accessmodifier;

import webjis.accessmodifier.child.Child;

public class AccessModifierMain {

	public static void main(String[] args) {
		Child child = new Child();
//		webjis.super1.Child child2 = new webjis.super1.Child(); // 임포트하지 않은 같은 이름의 클래스를 쓰려면 풀네임을 써야한다.
		
		child.displayChild();

	}

}
