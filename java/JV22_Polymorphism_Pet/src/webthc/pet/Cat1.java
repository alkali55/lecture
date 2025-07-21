package webthc.pet;

import webthc.Pet1;

public class Cat1 extends Pet1{
	
	public Cat1(String name, String type, int age) {
		super(name, type, age);
		
	}
	
	@Override
	public void doCry() {
		System.out.println("야옹야옹");
	}
	
	public void doJump() {
		System.out.println(getName() + "가 점프합니다.");
	}

	@Override
	public String toString() {
		return "Cat1 [" + super.toString() + "]";
	}
	
}
