package webjis.casting;

public class CastingMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.drive();
		
		// 다운캐스팅 ( 부모타입 -> 자손타입)
		// FireEngine fireEngine = (FireEngine)car; // 컴파일은 통과
		// 런타임(실행시) java.lang.ClassCastException
		
		// 업캐스팅 한 후, 다운 캐스팅
//		Car poly = (Car) new FireEngine(); // 업캐스팅 ( 자손타입 -> 부모타입)
		Car poly = new FireEngine(); // 윗문장도 가능
//		poly.drive();
		
		FireEngine fireEngine = (FireEngine) poly;
		fireEngine.drive();
		fireEngine.hoseWater();
		
		
		
	}

}
