package webjis.super1;

public class SuperMain {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.display();
		child.sing();
		
		Parent parent = new Parent();
		parent.sing();
		
		child.display();

	}

}
