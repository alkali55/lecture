package webthc;

public class PetDoctor {
	private String name;
	private int age;
	
	public PetDoctor(String name, int age) {
		this.name = name;
		this.age =age;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void doClinic(Pet1 pet) {
		System.out.println(pet + "을 치료합니다.");
	}
	
	@Override
	public String toString() {
		return "PetDoctor [name=" + name + ", age=" + age + "]";
	}
}
