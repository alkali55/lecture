package webjis.basic;

public class Child extends Parent{
	
	public void childMethod() {
		System.out.println("Child.childMethod() 호출");
	}
	
	@Override
	public void parentMethod() { 		
		System.out.println("부모 메서드 재정의");
	}
}
