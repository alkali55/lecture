package webjis.accessmodifier.child;

import webjis.accessmodifier.parent.Parent;

public class Child extends Parent{
	
	public void displayChild() {
		publicIv = 10;
		protectedIv = 10;
//		defaultIv = 10; // 다른 패키지이므로 접근 불가
//		privateIv = 10; // 다른 클래스이므로 접근 불가
		
		publicMethod();
		protectedMethod();
//		defaultMethod(); // The method defaultMethod() from the type Parent is not visible
//		privateMethod(); // The method privateMethod() from the type Parent is not visible
		
		displayParent();
		
		// AnotherClass의 protected 멤버 접근
		AnotherClass anotherClass = new AnotherClass();
		anotherClass.anotherProtectedIv = 100;
		
	}
	
	
}
