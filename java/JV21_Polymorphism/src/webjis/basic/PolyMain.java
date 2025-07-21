package webjis.basic;

public class PolyMain {

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		parent.parentMethod();
		
		Child child = new Child();
		child.childMethod();
		
		System.out.println("-------------------------------");
		// 다형성
		// 조상클래스타입의 참조변수로 자손클래스의 인스턴스를 참조
		Parent poly = new Child();
		poly.parentMethod();
//		poly.childMethod(); // The method childMethod() is undefined for the type Parent
		// 위의 문장은 에러 : 조상타입의 참조변수로 오버라이딩 되지 않은, 자손만의 메서드를 호출하는 것은 불가.

	}

}
