package webjis;

public class Dog extends Pet{
	
	Dog(String name, String species, int age){
		super(name, species, age);
	}
	
	public void doCry(){
		System.out.println("강아지 " + this + "가 웁니다. '멍멍'");
	}
	
	public void doWalk() {
		System.out.println("강아지 " + this + "가 걷습니다. '터벅터벅'");
	}
	
	public void doWag() {
		System.out.println("강아지 " + this + "가 꼬리를 흔듭니다.");
	}
	
	
}
