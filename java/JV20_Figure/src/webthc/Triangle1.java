package webthc;

public class Triangle1 extends Shape{
	
	// 부모 Shape클래스에 기본생성자를 만들지 않은 상태에서 Triangle클래스를 만드려고 할 때 에러
	// 해결방법 1) 부모 클래스에 기본 생성자를 만들어 준다.
	// 해결방법 2) 부모 클래스가 가지고 있는 오버로딩된 생성자를 이용
	
	private int base;
	private int height;
	
	public Triangle1(String name, String color, Point p, int base, int height) {
		super(name, color, p); // 반드시 첫줄에 기술한다.
		this.base = base;
		this.height = height;
	}
	
	// getter & setter
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(this.toString() + "인 삼각형이 그려집니다.");
	}

	@Override
	public String toString() {
		return "Triangle1 [base=" + base + ", height=" + height + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
