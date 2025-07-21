package webjis;

public class Cat extends Pet{

	Cat(String name, String species, int age){
		super(name, species, age);
	}
	
	public void doCry(){
		System.out.println("고양이 " + this + "가 웁니다. '애옹'");
	}
	
	public void doWalk() {
		System.out.println("고양이 " + this + "가 걷습니다. '살금살금'");
	}
	
	public void doJump() {
		System.out.println("고양이 " + this + "가 점프합니다.");
	}
	
	
}
