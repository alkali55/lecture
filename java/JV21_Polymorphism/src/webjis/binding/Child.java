package webjis.binding;

public class Child extends Parent{
	
	int x = 20;
	int y = 10;
	
	@Override
	public void method() {
		System.out.println("부모메서드 재정의");
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
	
	public void childMethod() {
		System.out.println("Child.childMethod() 호출");
	}
}
