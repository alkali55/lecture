package webthc;

public abstract class Shape {
	// 멤버 변수
	private String name;
	private String color;
	private Point p;

	
	
	// 생성자
	Shape(){}
	
	Shape(String name, String color, Point p){
		this.name = name;
		this.color = color;
		this.p = p;
	}
	
	
	//setter
	public void setName(String name) {
		this.name = name;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	public void setP(Point p) {
		this.p = p;
	}



	//getter
	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public Point getP() {
		return p;
	}


	// 메서드
//	void draw() {
//	}
	
	// 추상메서드
	abstract void draw();


	@Override
	public String toString() {
		return "Shape [name=" + name + ", color=" + color + ", p=" + p + "]";
	}
	
	


//	@Override
//	public String toString() {
//		return "Shape [name=" + name + ", color=" + color + ", x=" + data.x + ", y=" + data.y + "]";
//	}
	
	
	
//	@Override
//	public String toString() {
//		return "Shape [name = " + name + ", color = " + color + ", x = " + x + ", y = " + y + "]";
//	}
}
