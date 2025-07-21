package webjis;

public class Triangle extends Figure{
	
	// 부모 Figure 클래스에 기본생성자를 만들지 않은 상태에서 상속을 하게 되면 에러
	// 해결방법 1) 부모 클래스에 기본 생성자를 만들어 준다.
	// 해결방법 2) 부모 클래스가 가지고 있는 오버로딩된 생성자를 이용해서 부모객체가 생성되도록 해야 한다.
	
	private int height;
	private int baseLine;
	
	Triangle(String name, String color, int x, int y, int height, int baseLine){
		super(name, color, x, y); // 반드시 첫줄에 기술한다.
		this.height = height;
		this.baseLine = baseLine;
	}
	
	public void draw() {
		System.out.println("원점 : " + displaySP() + ", 높이 : " + height + ", 밑변 : " + baseLine + "으로 " + getColor() + " 삼각형 " + this + "을 그립니다.");
	}
	

}
