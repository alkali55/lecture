package webjis;

public class Circle extends Figure{
	private int radius;
	
	Circle(String name, String color, int x, int y, int radius){
		super(name, color, x, y);
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("원점 : " + displaySP() + ", 반지름 : " + radius + " 으로 " + getColor() + " 원 " + this + "을 그립니다.");
	}
	

}
