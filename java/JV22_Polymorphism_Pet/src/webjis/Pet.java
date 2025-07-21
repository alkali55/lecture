package webjis;

public abstract class Pet {
	private String name;
	private String species;
	private int age;
	
	Pet(String name, String species, int age){
		this.name = name;
		this.species = species;
		this.age = age;
	}
	
	

	public abstract void doCry();
	
	public abstract void doWalk();
	
	public String toString() {
		return species + " " + name + "(" + age + "세)";
	}
}
