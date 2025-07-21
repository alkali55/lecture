package webthc;

import java.util.Arrays;

import webthc.pet.Cat1;
import webthc.pet.Dog1;

public class PetMain1 {

	public static void main(String[] args) {
		
		Dog1 myDog = new Dog1("바둑이", "포메라니안", 2);
		Cat1 myCat = new Cat1("나비", "샴고양이", 4);
		
		Pet1[] pets = {myDog, myCat};
//		System.out.println(myDog);
//		System.out.println(myCat);
		
		for (Pet1 pet : pets) {
			System.out.println(pet);
			pet.doCry();
			pet.doWalk();
			if(pet instanceof Dog1) {
				((Dog1)pet).doWag();
			} else if (pet instanceof Cat1) {
				((Cat1) pet).doJump();
			}
		}
		
		PetDoctor 두리틀 = new PetDoctor("두리틀", 30);
		두리틀.doClinic(myCat);
		두리틀.doClinic(myDog);

	}

}
