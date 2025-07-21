package webjis.inheritance.inheritance;

public class FireEngine extends Car{
	
	public void hoseWater() {
		System.out.println("물을 뿌립니다.");
	}
	
	@Override
	public void accelerate() {
		System.out.println("엄청 빨리 가속합니다.");
	}
}
