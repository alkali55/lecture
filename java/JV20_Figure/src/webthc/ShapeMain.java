package webthc;

public class ShapeMain {

	public static void main(String[] args) {
		
		// 추상 메서드를 override한다는 의미는 객체가 분명해 졌다는 뜻
		// > 이 객체는 더 이상 추상적이지 않다
		// Shape 클래스는 추상적이기 때문에
		// 아래와 같이 객체화하면 논리적 모순이 생기므로 아래와 같이 사용하지 않는다.
//		Shape s = new Shape() {
//			
//			@Override
//			void draw() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		Triangle1 triangle1 = new Triangle1("삼각형", "빨강", new Point(50, 50), 200, 100);
//		System.out.println(triangle1);
		
		triangle1.draw();
		
		Rectangle rectangle = new Rectangle("사각형", "흰색", new Point(0, 0), 10, 50);
		rectangle.draw();
		
		Circle1 circle1 = new Circle1("원", "노랑", new Point(100, 100), 100);
		circle1.draw();

		// Painter 클래스 추가
		Painter 피카소 = new Painter("피카소");
		
		피카소.drawShape(circle1);
		피카소.drawShape(rectangle);
		피카소.drawShape(triangle1);
	}

}
