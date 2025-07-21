package webjis;

public class MobilePhone {
	
	private String brandName;
	private String modelName;
	private int mainMemory;
	private String color;
	

	
	public MobilePhone(String brandName, String modelName, int mainMemory, String color) {
		// 생성자 오버로딩
//		this(); // 생성자에서 다른 생성자를 호출할 때는 반드시 생성자의 첫 문장에 써야 한다.
		this.brandName = brandName;
		this.modelName = modelName;
		this.mainMemory = mainMemory;
		this.color = color;
//		this(); // Constructor call must be the first statement in a constructor
		
	}
	
	
	// 메서드
	// getter
	public String getBrandName() {
		return this.brandName;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public int getMainMemory() {
		return mainMemory;
	}
	
	public String getColor() {
		return color;
	}
	
	// setter
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
//	public void setMainMemory(int mainMemory) {
//		this.mainMemory = mainMemory;
//	}
	
	// 메모리 업그레이드는 1TB까지만 가능
	
	public boolean setMainMemory(int mainMemory) {
		boolean result = false;
		
		if(mainMemory <= 1024) {
			this.mainMemory = mainMemory;
			result = true;
		}
		return result;
	}
	
	public String toString() {
		return "[" + this.getClass().getName() + ": " + this.hashCode() + "] " + 
				" = brandName : " + this.brandName + ", modelName" + this.modelName + ", mainMemory :" + this.mainMemory +
				", color : " + this.color;
	}
}
