package webjis;

public class Car {
	
//	String branName = "현대";
//	String modelName = "그랜져";
//	int price = 30000000;
//	String color = "검정색";
	
	String brandName;
	String modelName;
	int price;
	String color;
	
	// 차 객체의 초기값을 설정하는 메서드
	void createCar(String brandname, String modelName, int price, String color) {
		this.brandName = brandname;
		this.modelName = modelName;
		this.price = price;
		this.color = color;
	}
	
	public void display() {
		System.out.println("브랜드명 : " + brandName);
		System.out.println("모델명 : " + modelName);
		System.out.println("가격 : " + price);
		System.out.println("색상 : " + color);
	}
}
