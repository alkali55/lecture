package webjis;

public class PetMain {

	public static void main(String[] args) {
		Cat cat = new Cat("애옹이", "러시안블루", 3);
		Dog dog = new Dog("멍멍이", "보더콜리", 2);
		
		cat.doCry();
		dog.doCry();
		cat.doWalk();
		dog.doWalk();
		cat.doJump();
		dog.doWag();
		
		Vet vet = new Vet("홍길동", 40);
		vet.doClinic(dog);
		vet.doClinic(cat);

	}

}
