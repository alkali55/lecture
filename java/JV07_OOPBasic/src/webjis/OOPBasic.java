package webjis;

public class OOPBasic {

	public static void main(String[] args) {
		// 객체 생성
		// String str = new String();
		Car car1 = new Car();
		
		// Car(): 기본 생성자 : 매개변수가 하나도 없는 생성자
		
		Car[] carArr = new Car[10];
		
		for (int i = 0; i < carArr.length; i++) {
			carArr[i]= new Car();
			System.out.println(i + ": " + carArr[i].hashCode());
		}
		
		Car car2 = new Car();
		System.out.println(car2.brandName);
		car2.brandName = "제네시스"; // 속성 값 변경
		System.out.println(car2.brandName);
		car2.color = "흰색";
		car2.price = 36000000;
		car2.modelName = "GV70";
		
//		System.out.println("car2 모델명 : " + car2.modelName + " 색상 : " + car2.color + " 가격 : " + car2.price);
		
		// Car객체의 멤버 메서드 호출
		car2.displayCar();
		car1.displayCar();
	}

}
