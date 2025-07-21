package webjis.inheritance.inheritance;

public class CarMain {

	public static void main(String[] args) {
		
		ElectricCar electricCar = new ElectricCar();
		electricCar.startEngine();
		electricCar.accelerate();
		electricCar.charge();
		
		GasCar gasCar = new GasCar();
		gasCar.startEngine();
		gasCar.accelerate();
		gasCar.fillUpGas();
		
		// 감속, 시동끄는 기능 Car클래스 추가
		electricCar.decelerate();
		electricCar.turnOffEngine();
		
		gasCar.decelerate();
		gasCar.turnOffEngine();
		
		// 부모는 자식의 멤버 사용 불가
		Car car = new Car();
//		car.charge();
//		car.fillUpGas();
		
		//소방차 추가
		FireEngine fireEngine = new FireEngine();
		fireEngine.startEngine();
		fireEngine.accelerate();
		fireEngine.hoseWater();
	}

}
