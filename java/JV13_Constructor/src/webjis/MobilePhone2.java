package webjis;

public class MobilePhone2 {
	
	String brandName;
	String modelName;
	int mainMemory;
	String color;
	
//	public MobilePhone() {
//		// 기본 생성자
//		System.out.println("고객님~폰이 개통되었습니다");
//	}
	
	public MobilePhone2(String brandName, String modelName, int mainMemory, String color) {
		// 생성자 오버로딩
//		this(); // 생성자에서 다른 생성자를 호출할 때는 반드시 생성자의 첫 문장에 써야 한다.
		this.brandName = brandName;
		this.modelName = modelName;
		this.mainMemory = mainMemory;
		this.color = color;
//		this(); // Constructor call must be the first statement in a constructor
		
	}
	
	public MobilePhone2(String brandName, String modelName) {
		// 생성자 오버로딩
//		this.brandName = brandName;
//		this.modelName = modelName;
//		this.mainMemory = 256;
//		this.color = "흰색";
		this(brandName, modelName, 256, "흰색");
	}
	
	public MobilePhone2(String color, int mainMemory) {
		this(null, null, mainMemory, color);
		this.brandName = "삼성";
		this.modelName = "플립";
	}
	
	// 메서드
	public String toString() {
		return "[" + this.getClass().getName() + ": " + this.hashCode() + "] " + 
				" = brandName : " + this.brandName + ", modelName" + this.modelName + ", mainMemory :" + this.mainMemory +
				", color : " + this.color;
	}
}
