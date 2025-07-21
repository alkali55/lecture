package webjis;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
//		car1.display();
		car1.brandName = "현대";
		car1.modelName = "소나타";
		car1.price = 29000000;
		car1.color = "흰색";
		
		
		Car car2 = new Car();
		initCar(car2, "제네시스", "G80", 80000000, "흰색");
		car2.display();
		
		Car car3 = new Car();
		initCar(car3, "기아", "k8", 50000000, "블랙");
		
		// Car클래스 내부에 createCar()메서드로 초기화
		Car car4 = new Car();
		car4.createCar("기아", "캐스퍼", 30000000, "카키");
		
	}

	private static void initCar(Car car, String brandname, String modelName, int price, String color) {
		// Car객체의 초기값
		car.brandName = brandname;
		car.modelName = modelName;
		car.price = price;
		car.color = color;
	}

}
