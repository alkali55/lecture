package webthc.pet;

import webthc.Pet1;

public class Dog1 extends Pet1{
	
	public Dog1(String name, String type, int age) {
		super(name, type, age);
	}
	
	@Override
	public void doCry() {
		System.out.println("멍멍");
	}
	
	public void doWag() {
		System.out.println(getName() + "가 꼬리를 흔듭니다.");
	}

	@Override
	public String toString() {
		return "Dog1 [" + super.toString() + "]";
	}
	
	
}
