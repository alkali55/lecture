package webjis;

public class Vet {
	private String name;
	private int age;
	
	Vet (String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void doClinic(Pet animal) {
		if(animal instanceof Cat) {
			System.out.println("수의사 " + this + "가 고양이 " + animal + "를 치료합니다.");
		} else {
			System.out.println("수의사 " + this + "가 강아지 " + animal + "를 치료합니다.");
		}
	}
	
	
	public String toString() {
		return name + "(" + age + "세)";
	}
}
