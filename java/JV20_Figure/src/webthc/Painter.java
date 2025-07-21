package webthc;

public class Painter {
	
	private String name;

	public Painter(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 그림 그리는 메서드
//	public void drawShape(Circle1 circle1) {
//		System.out.println(name + "가 " + circle1 + "인 원을 그립니다.");
//	}
//	public void drawShape(Rectangle rectangle) {
//		System.out.println(name + "가 " + rectangle + "인 사각형을 그립니다.");
//	}
//	public void drawShape(Triangle1 triangle1) {
//		System.out.println(name + "가 " + triangle1 + "인 삼각형을 그립니다.");
//	}
	
	public void drawShape(Shape shape) {
		System.out.println("===================================================");
		System.out.println(name + "가 " + shape + "그립니다");
		
		if(shape instanceof Circle1) {
			// 다운캐스팅
			Circle1 c = (Circle1) shape;
			System.out.println("원의 반지름 : " + c.getRadius());
//			System.out.println("반지름 : " + ((Circle1)shape).getRadius());
		} else if (shape instanceof Rectangle) {
			Rectangle r = (Rectangle) shape;
			System.out.println("사각형의 가로 : " + r.getWidth());
		} else if (shape instanceof Triangle1) {
			Triangle1 t = (Triangle1) shape;
			System.out.println("삼각형의 높이 : " + t.getHeight());
		}
	}
	
	@Override
	public String toString() {
		return "Painter [name=" + name + "]";
	}
	
	
}
