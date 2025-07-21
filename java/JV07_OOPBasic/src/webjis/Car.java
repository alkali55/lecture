package webjis;

public class Car {
	
	// 속성 (인스턴스 변수)
	String brandName = "현대";
	String modelName = "그랜저";
	int price = 35000000;
	String color = "검정색";
	
	// 메서드 (인스턴스 메서드)
	// Car 객체의 속성값을 화면에 출력
	public void displayCar() {
		System.out.println("브랜드명 : " + brandName + " 모델명 : " + modelName + " 색상 : " + color + " 가격 : " + price);
	}
	
	
}
