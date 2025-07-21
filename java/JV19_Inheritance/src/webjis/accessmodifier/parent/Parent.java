package webjis.accessmodifier.parent;

public class Parent {
	public int publicIv;
	protected int protectedIv;
	int defaultIv;
	private int privateIv;
	
	public void publicMethod() {
		System.out.println("Parent publicMethod()");
	}
	
	protected void protectedMethod() {
		System.out.println("Parent protectedMethod()");
	}
	
	void defaultMethod() {
		System.out.println("Parent defaultMethod()");
	}
	
	private void privateMethod() {
		System.out.println("Parent privateMethod()");
	}
	
	public void displayParent() {
		System.out.println("Parent클래스");
		System.out.println("publicIv : " + publicIv);
		System.out.println("protectedIv : " + protectedIv);
		System.out.println("defaultIv : " + defaultIv);
		System.out.println("privateIv : " + privateIv);
	}
}
