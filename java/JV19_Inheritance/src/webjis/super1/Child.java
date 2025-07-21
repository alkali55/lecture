package webjis.super1;

public class Child extends Parent{
	
	int a = 20;
	int c = 200;
	
	public Child(){
		System.out.println("자식 기본 생성자");
	}
	
	void display() {
		System.out.println("a : " + a); // 20
		System.out.println("this.a : " + this.a); // 20
		System.out.println("super.a : " + super.a); // 10
		
		System.out.println("b : " + b);
		System.out.println("super.b : " + super.b);
		
		sing();
		this.sing();
		super.sing();
	}
	
	@Override
	void sing() {
		System.out.println("자식이 노래합니다.");
	}
}
