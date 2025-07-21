package webjis;

public class FigureMain {

	public static void main(String[] args) {
		Circle circle = new Circle("c1", "하얀색", 0, 5, 10);
		circle.draw();
		
		Triangle triangle = new Triangle("t1", "검은색", 10, 20, 10, 5);
		triangle.draw();
		
		Quadrangle quadrangle = new Quadrangle("q1", "녹색", 11, 22, 20, 30);
		quadrangle.draw();

	}

}
