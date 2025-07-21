package webjis.superconstructor;

public class GrandChild extends Child{
	
	public GrandChild() {
		
		super(30, 40); // 부모의 오버로딩된 생성자 호출
		System.out.println("손자 기본 생성자");
		
	}
	
}
