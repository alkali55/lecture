package webthc;

public abstract class Pet1 {
	
	// 멤버변수
	private String name;
	private String type;
	private int age;
	
	// 생성자
	protected Pet1 (String name, String type, int age){
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	// 메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// 추상메서드
	public abstract void doCry();
	
	public void doWalk() {
		System.out.println("걸어다닙니다.");
	}

	@Override
	public String toString() {
		return "Pet1 [name=" + name + ", type=" + type + ", age=" + age + "]";
	}
	
}
