package webjis;

public class Quadrangle extends Figure{
	private int height;
	private int width;
	
	Quadrangle(String name, String color, int x, int y, int height, int width){
		super(name, color, x, y);
		this.height = height;
		this.width = width;
	}
	
	public void draw() {
		System.out.println("원점 : " + displaySP() + ", 세로 : " + height + ", 가로 : " + width + "으로 " + getColor() + " 사각형 " + this + "을 그립니다.");
	}
	

}
