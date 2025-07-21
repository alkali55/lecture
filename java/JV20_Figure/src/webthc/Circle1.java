package webthc;

public class Circle1 extends Shape{
	private int radius;
	
	Circle1 (String name, String color, Point p, int radius){
		super(name, color, p);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println(this.toString() + "인 원이 그려집니다.");
	}
	
	@Override
	public String toString() {
		return "Circle1 [radius=" + radius + ", toString()=" + super.toString() + "]";
	}
	
	
}
