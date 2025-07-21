package webjis;

public class Computer extends Product{
	Computer (int price, String modelNum){
		super(price, modelNum);
	}

	@Override
	public String toString() {
		return "Computer [toString()=" + super.toString() + "]";
	}

}
