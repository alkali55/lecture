package webjis.binding;

public class BindingMain {

	public static void main(String[] args) {
		Child child = new Child();
		child.method();
		
		Parent poly = new Child(); // 다형성 정의
		
//		Child child2 = new Parent();
		
		System.out.println("poly.x = " + poly.x); // 10
		System.out.println("child.x = " + child.x); // 20
		
		poly.method(); // 자식이 재정의한 메서드 호출 가능
//		poly.childMethod();
		
		// 캐스팅 (부모타입의 참조변수 -> 자식타입으로 형변환)
		Child poly2 = (Child) poly;
		poly2.childMethod();
		System.out.println("poly2.x = " + poly2.x); // 20

	}

}
