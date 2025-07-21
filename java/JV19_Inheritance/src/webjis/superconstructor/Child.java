package webjis.superconstructor;

public class Child extends Parent{
	

	Child(){
//		super(); // 기본 생성자 생략 가능
		System.out.println("자식 기본 생성자");
	}
	
	Child(int a){
//		super();
		System.out.println("자식 생성자 a : " + a);
	}
	
	Child(int a, int b){
		super();
		System.out.println("자식 생성자 a : " + a + ", b : " + b);
	}
	
	
}
