package webjis.instanceof1;

class Parent{}

class Child extends Parent{}
	

public class InstanceOfMain {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		Parent poly = new Child();
		
		// Parent ref = new Parent();
		System.out.println("parent instanceof Parent : " + (parent instanceof Parent)); // true
		
		// Parent ref = new Child(); // 다형성의 정의
		System.out.println("child instanceof Parent : " + (child instanceof Parent)); // true
		
		// Child ref = new Parent();
		System.out.println("parent instanceof Child : " + (parent instanceof Child)); // false
		
		// Child ref = new Child();
		System.out.println("child instanceof Child : " + (child instanceof Child)); // true
		
		
		System.out.println("poly instanceof Child : " + (poly instanceof Child)); // true
		System.out.println("poly instanceof Parent : " + (poly instanceof Parent)); // true

	}

}
